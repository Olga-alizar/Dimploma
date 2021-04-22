package com.example.Catalog;

import com.example.Catalog.entity.Categories;
import com.example.Catalog.repositiry.CategoriesRepository;
import com.example.Catalog.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class CatalogApplication  implements CommandLineRunner {

	@Autowired
	CatService catService;

	public static void main(String[] args) {
		SpringApplication.run(CatalogApplication.class, args);
	}
	@Override
	public void run(String...  args) throws Exception {

		List<Categories> categoriesList = catService.getAllCategories();
		for (Categories categories: categoriesList) {
			System.out.println(categories);
		}
	}

}
