package com.example.Catalog.dto;

import java.util.List;

public class CategoryDto {
    private Integer id;
    private String name;
    private String description;
    private List<FurnitureDto> furnitures;

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
        return furnitures;
    }

    public void setFurnitures(List<FurnitureDto> furnitures) {
        this.furnitures = furnitures;
    }
}
