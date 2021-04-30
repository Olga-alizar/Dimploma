package com.example.Catalog.dto;

import java.util.List;

public class ManufacturerDto {
    private Integer id;
    private String name;
    private String description;
    private List<FurnitureDto> furnituries;

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

    public List<FurnitureDto> getFurnituries() {
        return furnituries;
    }

    public void setFurnituries(List<FurnitureDto> furnituries) {
        this.furnituries = furnituries;
    }

    @Override
    public String toString() {
        return "ManufacturerDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", furniture=" + furnituries +
                '}';
    }
}
