package com.example.Catalog.repositiry;

import com.example.Catalog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Query("select c from category c")
    public List<Category> getAllCategory();

    @Query("SELECT с FROM category с Where c.name = :name")
    public List<Category> getCategoryByName(@Param("name") String name);

    @Query("select disctinct с FROM category с LEFT JOIN FETCH c.furnitures")
    public List<Category> qetAllCategoryWithJoin();

}
