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
    public List<Category> getAllCategories() {
        List<Category> categories = CategoryRepository.getAllCategory() {
        return convertFromListEntityToListDto(categories);
    }

    @Override
    public List<Category> getAllCategoriesWithJoin() {
        return CategoryRepository.getAllCategoryWithJoin();
    }

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
        CategoryDto.setId(Category.getId());
        CategoryDto.setName(Category.getName());
        CategoryDto.setDescription(Category.getDescription());
        List<FurnitureDto> FurnitureDtos = new ArrayList<>();
        for(Furniture Furniture:  Category.getFurnitures()) {
            FurnitureDto FurnitureDto = new FurnitureDto();
            FurnitureDto.setId(Furniture.getId());
            FurnitureDto.setName(Furniture.getName());
            FurnitureDtos.add(FurnitureDto);
        }
            categoryDto.setFurnitures(FurnitureDtos);
       return categoryDto;
    }
}
