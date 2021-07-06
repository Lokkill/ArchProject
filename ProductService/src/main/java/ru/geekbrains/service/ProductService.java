package ru.geekbrains.service;

import ru.geekbrains.model.Product;

public interface ProductService {
    Product getProductById(Long id);
}
