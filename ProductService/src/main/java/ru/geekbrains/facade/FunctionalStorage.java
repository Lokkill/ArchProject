package ru.geekbrains.facade;

import ru.geekbrains.model.Product;
import ru.geekbrains.model.StorageOrder;
import ru.geekbrains.service.ProductService;
import ru.geekbrains.service.StorageProductFacade;
import ru.geekbrains.service.StorageService;

import java.util.List;

public class FunctionalStorage implements StorageProductFacade {

    protected ProductService productService;
    protected StorageService storageService;

    public void createOrderOnStorage(List<Long> productsId) {
        for (Long l : productsId){
            Product product = productService.getProductById(l);
            storageService.createOrderOnStorage();
            if (storageService.checkAvailabilityProduct(product)){
                storageService.addProduct(product);
            } else {
                System.out.println("Not enough products in storage");
            }
        }
        if (storageService.getCountProductsInOrder() > 0) storageService.saveOrder();
    }
}
