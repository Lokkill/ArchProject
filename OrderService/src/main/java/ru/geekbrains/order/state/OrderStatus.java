package ru.geekbrains.order.state;

import ru.geekbrains.order.model.Status;

public abstract class OrderStatus {
    Status status;

    public OrderStatus(Status status){
        this.status = status;
    }

    abstract void performOperations();
}
