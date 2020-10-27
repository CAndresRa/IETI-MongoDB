package edu.escuelaing.ieti.mongolab.entities;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Product {
    @Id
    private Long id;

    private String name;
    private String description;
    private String responsible;


    public Product() {
    }

    public Product(Long id, String name, String description, String responsible) {
        this.id = id;
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", responsible='" + responsible + '\'' +
                '}';
    }
}
