package com.example.Catalog.service;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.dto.FurnitureDto;
import com.example.Catalog.entity.Category;
import com.example.Catalog.entity.Furniture;
import com.example.Catalog.repositiry.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CatServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    @Transactional
    public List<CategoryDto> getAllCategories() {
        List<Category> categories = categoryRepository.getAllCategory();
        return convertFromListEntityToListDto(categories);
    }
/*
    @Override
    public List<CategoryDto> getAllCategoriesWithFurnituries() {
         List<Category category = categoryRepository.getAllCategoryWithFurnituries();
         return convertFromEntityToDto(category);
        }
*/
    @Override
    public CategoryDto getCategoryByName(String name) {
        return convertFromEntityToDto(categoryRepository.getCategoryByName(name));
    }
/*
    @Override
    public List<CategoryDto> getAllCategoryWithFurnituries () {
        return convertFromListEntityToLisDtotWithFurnituriesDto(categoryRepository.getAllCategoryWithFurnituries());
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
    private CategoryDto convertFromEntityToDto(Category category)   {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());
        List<FurnitureDto> FurnitureDtos = new ArrayList<>();
        for(Furniture furniture:  category.getFurnitures()) {
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
    /*
    private CategoryDto convertFromEntityToDto(Category category)   {
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setId(category.getId());
        categoryDto.setName(category.getName());
        categoryDto.setDescription(category.getDescription());
        List<FurnitureDto> FurnitureDtos = new ArrayList<>();
        for(Furniture Furniture:  category.getFurnitures()) {
            FurnitureDto FurnitureDto = new FurnitureDto();
            FurnitureDto.setId(Furniture.getId());
            FurnitureDto.setName(Furniture.getName());
            FurnitureDtos.add(FurnitureDto);
        }
        categoryDto.setFurnituries(FurnitureDtos);
        return categoryDto;
    }
*/
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
}
