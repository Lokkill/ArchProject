package ru.geekbrains.service;


import java.util.List;

public interface StorageProductFacade {
    void createOrderOnStorage(List<Long> productsId);
}
