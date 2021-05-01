package com.example.Catalog.restController;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryRestController {
    private CatService catService;

    @Autowired
    public CategoryRestController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("api/category")
    public List<CategoryDto> getAllCategory(){
        return catService.getAllCategories();
    }
    /*
    @GetMapping("/api/Category/{id}")
    public CategoryDto getCategoryById(@PathVariable("id")  Integer id) {
     return catService.(id);
    }
   */
    @GetMapping("/api/category/{name}")
    public CategoryDto getCategoryByName(@PathVariable String name) {
        return catService.getCategoryByName(name);
    }
}
