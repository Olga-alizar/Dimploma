package com.example.Catalog.entity;

import javax.persistence.*;

@Entity
public class Furniture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer Price;

    @Column
    private String description;

    @Column
    private Integer manufacturer_id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="category_id",  nullable=false)
    Category category;
/*
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="manufacturer_id",  nullable=false)
    Manufacturer manufacturer;
*/
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

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Integer getManufacturer_id() {
        return manufacturer_id;
    }

    public void setManufacturer_id(Integer manufacturer_id) {
        this.manufacturer_id = manufacturer_id;
    }


    @Override
    public String toString() {
        return "Furniture{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Price=" + Price +
                ", description='" + description + '\'' +
                  '}';
    }
}
