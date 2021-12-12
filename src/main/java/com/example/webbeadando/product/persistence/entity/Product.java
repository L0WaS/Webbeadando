package com.example.webbeadando.product.persistence.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)
    private Long id;
    private String name;
    private String type;
    private Integer kilogram;
    private Double volume;
    private String imageURL;

    public Product(String name, String type, Integer kilogram, Double volume,  String imageURL) {
        this.name = name;
        this.type = type;
        this.kilogram = kilogram;
        this.volume = volume;
        this.imageURL = imageURL;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getKilogram() {
        return kilogram;
    }

    public void setKilogram(Integer milliliter) {
        this.kilogram = milliliter;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return  name + " ( type = " + type  + "in " + kilogram + " kilogram." + "volume=" + volume + "imageUrl= " + imageURL + " )";
    }
}
