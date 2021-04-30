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
         return convertFromListEntityToListDto(categories);
        }

    @Override
    public CategoryDto getCategoryByName(String name) {
        return convertFromEntityToDto(categoryRepository.getCategoryByName(name));
    }

    @Override
    public void saveCategory(CategoryDto categoryDto) {
       Category category = convertFromDtoToEntity(categoryDto);
       categoryRepository.save(category);
    }
/*
    @Override
    public CategoryDto getFurnituriesByCategory(Integer id) {
        return convertFromEntityToWithFurnituriesDto(categoryRepository.getCategoryWithFurnituriesById(id));
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
    private CategoryDto convertFromEntityToWithFurnituriesDto(Category category)   {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());
        List<FurnitureDto> FurnitureDtos = new ArrayList<>();
        for(Furniture furniture:  category.getFurnituries()) {
            FurnitureDto FurnitureDto = new FurnitureDto();
            FurnitureDto.setId(furniture.getId());
            FurnitureDto.setName(furniture.getName());
            FurnitureDto.setPrice(furniture.getPrice());
            FurnitureDto.setDescription(furniture.getDescription());
            FurnitureDtos.add(FurnitureDto);
        }
            categoryDto.setFurnituries(FurnitureDtos);
        return categoryDto;
    }

    private CategoryDto convertFromEntityToDto(Category category)   {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());
        categoryDto.setFurnituries(new ArrayList<>());
        return categoryDto;
    }

    /*
    private List<CategoryDto> convertFromListEntityToListWithFurnituriesDtо(Category category) {
       List<CategoryDto> categoryDtos = new ArrayList();
       for  (Category category: categories)   {
           categoryDtos.add(convertFromEntityToWithFurnituresDto(category));
       }
     return categoryDtos;
    }
    */
    private CategoryDto convertFromEntityToWithFurnituresDto(Category category) {

        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        return null;
    }
    private Category convertFromDtoToEntity(CategoryDto categoryDto)
    {
        Category category = new Category();
        category.setName(categoryDto.getName());
        return category;
    }
}
