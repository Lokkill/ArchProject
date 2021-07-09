package ru.geekbrains.order.model;

import ru.geekbrains.order.state.OrderStatus;
import ru.geekbrains.order.state.RequestStatus;

public class Status {
    private OrderStatus status;
    private String title;

    public Status() {
        this.status = new RequestStatus(this);
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void changeStatus(OrderStatus status){
        this.status = status;
    }
}
