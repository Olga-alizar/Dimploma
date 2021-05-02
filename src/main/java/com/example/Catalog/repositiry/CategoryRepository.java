package com.example.Catalog.repositiry;

import com.example.Catalog.entity.Category;
import com.example.Catalog.entity.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("SELECT c FROM Category c")
    public List<Category> getAllCategory();

    @Query("SELECT s FROM Category s LEFT JOIN FETCH s.furnituries where s.id = :id")
    public Category getCategoryWithFurnituriesById(@Param("id") Integer id);

    @Query("SELECT c FROM Category c Where c.name = :name")
    public Category getCategoryByName(@Param("name") String name);

    @Query("SELECT distinct c FROM Category c LEFT JOIN FETCH c.furnituries")
    public List<Category> getAllCategoryWithFurnituries();

}
