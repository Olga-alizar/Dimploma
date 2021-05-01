package com.example.Catalog.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String description;


    @OneToMany(fetch = FetchType.EAGER, mappedBy="category")
    private List<Furniture> furnituries;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Furniture> getFurnituries() {
        return furnituries;
    }

    public void setFurnitures(List<Furniture> furnitures) {
        this.furnituries = furnitures;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", furniture=" + furnituries +
                '}';
    }
}
