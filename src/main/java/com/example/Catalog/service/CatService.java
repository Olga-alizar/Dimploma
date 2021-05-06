package com.example.Catalog.service;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.entity.Category;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CatService {

    public List<CategoryDto> getAllCategories();
    public List<CategoryDto> getAllCategoryWithFurnituries();
    public CategoryDto getCategoryByName(String name);
    public List<CategoryDto> seaCategoryByName(@Param("name") String name);
    public List<CategoryDto>  sortCategoryByNameA();
    public void saveCategory(CategoryDto categoryDto);
    public CategoryDto getFurnituriesByCategory(Integer id);
    public CategoryDto getCategoryById (Integer idCategory);
    public void delCategoryById(Integer id);
   // public void saveFurniture(FurnitureDto furnitureDto);
}
