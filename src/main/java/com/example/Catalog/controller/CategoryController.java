package com.example.Catalog.controller;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.dto.FurnitureDto;
import com.example.Catalog.entity.Furniture;
import com.example.Catalog.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @RequestMapping(value = "/category/furniture", method = RequestMethod.GET)
    public String getAllFurnituries(ModelMap modelMap, @RequestParam Integer id){
    CategoryDto categoryDto = catService.getFurnituriesByCategory(id);
    modelMap.addAttribute("category", categoryDto);
    return "furnituries";
    }

    @RequestMapping(value = "/furniture/edit")
    public String editFurniture(ModelMap modelMap, @RequestParam Integer id){
        System.out.println(id);
        List<FurnitureDto> furniture = catService.getFurnituriesByCategory(id).getFurnituries();
        modelMap.addAttribute("furniture", furniture);
        //CategoryDto categoryDto = catService.getCategoryById(id);
        //modelMap.addAttribute ( "category", categoryDto) ;
        return "editFurniture";
    }

    @RequestMapping("/category/edit")
    public String editCategory(ModelMap modelMap, @RequestParam Integer id){
        CategoryDto categoryDto = catService.getCategoryById(id);
        modelMap.addAttribute ( "category", categoryDto) ;
        return "editCategory";
    }

    @RequestMapping ("/edit-category")
    public String saveCategory(@ModelAttribute("category") CategoryDto categoryDto){
        catService.saveCategory(categoryDto);
        return "redirect:/category";
    }

    @RequestMapping ("/edit-furniture")
    public String saveFurniture(@ModelAttribute("cfurniture") FurnitureDto furnitureDto){
     //   catService.saveFurniture(furnitureDto);
        return "redirect:/category/furniture";
    }

    @RequestMapping("/category/add")
    public String addCategory(ModelMap modelMap){
        CategoryDto categoryDto = new CategoryDto();
        modelMap.addAttribute ( "category", categoryDto);
        return "addCategory";
    }

}
