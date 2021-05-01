package com.example.Catalog.controller;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CategoryController {

    private CatService catService;

    @Autowired
    public CategoryController(CatService catService) {
        this.catService = catService;
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String getAllCategory(ModelMap modelMap){
        List<CategoryDto> categories = catService.getAllCategories();
        modelMap.addAttribute( "categories",categories);
        return "categories";
    }

    @RequestMapping("/category/furniture")
    public String getAllFurnituries(ModelMap modelMap, @RequestParam Integer id){
    CategoryDto categoryDto = catService.getFurnituriesByCategory(id);
    modelMap.addAttribute("category", categoryDto);
    return "furnituries";
    }

}
