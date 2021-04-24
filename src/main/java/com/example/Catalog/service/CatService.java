package com.example.Catalog.service;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.entity.Category;

import java.util.List;

public interface CatService {

    public List<CategoryDto> getAllCategories();
    public List<CategoryDto> getAllCategoriesWithJoin();
}
