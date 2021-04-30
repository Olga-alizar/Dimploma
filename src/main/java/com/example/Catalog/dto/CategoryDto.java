package com.example.Catalog.dto;

import java.util.List;

public class CategoryDto {
    private Integer id;
    private String name;
    private String description;
    private List<FurnitureDto> furnituries;

    public CategoryDto() {
    }

    public CategoryDto(String name, String description) {
        this.name = name;
        this.description = description;
    }

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

    public List<FurnitureDto> getFurnitures() {
        return furnituries;
    }

    public void setFurnituries(List<FurnitureDto> furnituries) {
        this.furnituries = furnituries;
    }

    @Override
    public String toString() {
        return "CategoryDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", furnituries=" + furnituries +
                '}';
    }
}
