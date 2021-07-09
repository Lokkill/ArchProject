package ru.geekbrains.service;

import ru.geekbrains.model.Product;
import ru.geekbrains.model.StorageOrder;

public interface StorageService {
    void addProduct(Product product);
    boolean checkAvailabilityProduct(Product product);
    void deleteProductById(Long id);
    StorageOrder createOrderOnStorage();
    void saveOrder();
    int getCountProductsInOrder();
}
