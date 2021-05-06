package com.example.Catalog.restController;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @GetMapping("/api/category/{idCategory}")
    public CategoryDto getCategoryById(@PathVariable("idCategory")  Integer id) {
        System.out.println(id);
        //return catService.getCategoryById(id);
        return catService.getFurnituriesByCategory(id);
    }
    @GetMapping("/api/category/name")
    public CategoryDto getCategoryByName(@RequestParam String name) {
        return catService.getCategoryByName(name);
    }
    @GetMapping("/api/category/sea")
    public List<CategoryDto> seaCategoryByName(@RequestParam String name) {
        return catService.seaCategoryByName(name);
    }
    @GetMapping("/api/category/sort")
    public List<CategoryDto> sortCategoryByNameA() {
        return catService.sortCategoryByNameA();
    }

    @PostMapping("/api/category/add")
    public void saveCategory(CategoryDto categoryDto){
        catService.saveCategory(categoryDto);
    }
    @DeleteMapping("/api/category/del/{id}")
    public void delCategory(@PathVariable("id")  Integer id){
        catService.delCategoryById(id);
    }

}
