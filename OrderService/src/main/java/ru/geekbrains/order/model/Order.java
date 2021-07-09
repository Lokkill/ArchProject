package ru.geekbrains.order.model;


import ru.geekbrains.order.dto.ProductDto;
import ru.geekbrains.order.dto.UserDto;
import ru.geekbrains.order.state.RequestStatus;

import java.time.LocalDateTime;
import java.util.List;


// TODO ДЗ №3
// Решил реализовать паттерн Prototype, так как возможность создавать клон заказа достаточно актуален в CRM.

public class Order {

    private Long id;
    private String title;
    private String description;
    private List<ProductDto> products;
    private LocalDateTime createdAt;
    private Status status;
    private LocalDateTime updatedAt;
    private UserDto responsibleUser;

    public Order() {
    }

    public Order(Long id, String title, String description, List<ProductDto> products, UserDto responsibleUser) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.products = products;
        this.status = new Status();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.responsibleUser = responsibleUser;
    }

    public Order(Order order) {
        this.id = order.getId();
        this.title = order.getTitle();
        this.description = order.getDescription();
        this.products = order.getProducts();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.status = order.getStatus();
        this.responsibleUser = order.getResponsibleUser();
    }

    public Order clone() {
        return new Order(this);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ProductDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDto> products) {
        this.products = products;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public UserDto getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(UserDto responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    public Status getStatus() {
        return status;
    }

    public void changeStatus(Status status) {
        this.status = status;
    }
}
