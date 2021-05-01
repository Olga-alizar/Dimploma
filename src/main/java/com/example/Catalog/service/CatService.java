package com.example.Catalog.service;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.dto.FurnitureDto;
import com.example.Catalog.entity.Category;

import java.util.List;

public interface CatService {

    public List<CategoryDto> getAllCategories();
    public List<CategoryDto> getAllCategoryWithFurnituries();
    public CategoryDto getCategoryByName(String name);
    public void saveCategory(CategoryDto categoryDto);
    public CategoryDto getFurnituriesByCategory(Integer id);

}
