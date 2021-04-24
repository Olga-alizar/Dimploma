package com.example.Catalog;

import com.example.Catalog.dto.CategoryDto;
import com.example.Catalog.entity.Category;
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

		List<CategoryDto> categoryList = catService.getAllCategories();
		for (CategoryDto category : categoryList) {
			System.out.println(category);
		}
	}

}
