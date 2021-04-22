package com.example.Catalog.service;

import com.example.Catalog.entity.Categories;
import com.example.Catalog.repositiry.CategoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatServiceImpl implements CatService {

    private CategoriesRepository categoriesRepository;

    @Autowired
    public CatServiceImpl(CategoriesRepository categoriesRepository) {
        this.categoriesRepository = categoriesRepository;
    }

    @Override
    public List<Categories> getAllCategories() {
        return CategoriesRepository.getAllCategories();
    }
}
