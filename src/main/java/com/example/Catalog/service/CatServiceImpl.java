package com.example.Catalog.service;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.dto.FurnitureDto;
import com.example.Catalog.entity.Category;
import com.example.Catalog.entity.Furniture;
import com.example.Catalog.repositiry.CategoryRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    private CategoryRepository categoryRepository;


    public CatServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    @Transactional
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.getAllCategory();
        return convertFromListEntityToListDto(categories);
    }

    @Override
    public List<CategoryDto> getAllCategoryWithFurnituries() {
         List<Category> categories = categoryRepository.getAllCategoryWithFurnituries();
         return convertFromListEntityToListDtoWithFurnituries(categories);
        }

    @Override
    public CategoryDto getCategoryByName(String name) {
        return convertFromEntityToDto(categoryRepository.getCategoryByName(name));
    }

    @Override
    public List<CategoryDto> seaCategoryByName(String name) {
        return convertFromListEntityToListDto(categoryRepository.seaCategoryByName(name));
    }

    @Override
    public List<CategoryDto> sortCategoryByNameA() {
        return convertFromListEntityToListDto(categoryRepository.sortCategoryByNameA());
    }

    @Override
    public void saveCategory(CategoryDto categoryDto) {
       Category category = convertFromDtoToEntityWithFurnituries(categoryDto);
       categoryRepository.save(category);
    }

    @Override
    public CategoryDto getFurnituriesByCategory(Integer id) {
        return convertFromEntityToDtoWithFurnituries(categoryRepository.getCategoryWithFurnituriesById(id));
    }

    @Override
    public CategoryDto getCategoryById (Integer id)  {
        return convertFromEntityToDto(categoryRepository.findById(id).get());
    }

    @Override
    public void delCategoryById(Integer id) {
        categoryRepository.deleteById(id);
    }
/*
    @Override
    public void saveFurniture(FurnitureDto furnitureDto) {
        categoryRepository.save(furnitureDto);
    }
*/

    private List<CategoryDto> convertFromListEntityToListDto(List<Category> categories){

        List<CategoryDto> categoryDtos = new ArrayList<>();
        for (Category category: categories)
        {
           categoryDtos.add(convertFromEntityToDto(category));
        }
         return categoryDtos;
    }

     private List<CategoryDto> convertFromListEntityToListDtoWithFurnituries(List<Category> categories){

        List<CategoryDto> categoryDtos = new ArrayList<>();
        for (Category category: categories)
        {
            categoryDtos.add(convertFromEntityToDtoWithFurnituries(category));
        }
        return categoryDtos;
    }

    private CategoryDto convertFromEntityToDto(Category category)   {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());
        categoryDto.setFurnituries(new ArrayList<>());
        return categoryDto;
    }

    private CategoryDto convertFromEntityToDtoWithFurnituries(Category category)   {
        return getCategoryDto(category);
    }

    private CategoryDto getCategoryDto(Category category) {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());
        List<FurnitureDto> furnitureDtos = new ArrayList<>();
        for(Furniture furniture:  category.getFurnituries()) {
            FurnitureDto furnitureDto = new FurnitureDto();
            furnitureDto.setId(furniture.getId());
            furnitureDto.setName(furniture.getName());
            furnitureDto.setPrice(furniture.getPrice());
            furnitureDto.setDescription(furniture.getDescription());
            furnitureDto.setManufacturer_id(furniture.getManufacturer_id());
            furnitureDtos.add(furnitureDto);
        }
        categoryDto.setFurnituries(furnitureDtos);

        return categoryDto;
    }

    private Category convertFromDtoToEntity(CategoryDto categoryDto)
    {
        Category category = new Category();
        if(categoryDto.getId() != null) {
            category.setId(categoryDto.getId());
        }
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());
        return category;
    }

    private Category convertFromDtoToEntityWithFurnituries(CategoryDto categoryDto)
    {
        Category category = new Category();
        if(categoryDto.getId() != null) {
            category.setId(categoryDto.getId());
        }
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());
        if(categoryDto.getFurnituries() != null) {
            List<Furniture> furniture = new ArrayList<>();
            for(FurnitureDto furnitureDtos:  categoryDto.getFurnituries()) {
                Furniture furnitures = new Furniture();
                furnitures.setId(furnitureDtos.getId());
                furnitures.setName(furnitureDtos.getName());
                furnitures.setPrice(furnitureDtos.getPrice());
                furnitures.setDescription(furnitureDtos.getDescription());
                furnitures.setManufacturer_id(furnitureDtos.getManufacturer_id());
                furniture.add(furnitures);
            }
            category.setFurnituries(furniture);
        }
        return category;
    }

}
