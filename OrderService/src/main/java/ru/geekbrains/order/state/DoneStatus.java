package ru.geekbrains.order.state;

import ru.geekbrains.order.model.Status;

public class DoneStatus extends OrderStatus{
    public DoneStatus(Status status) {
        super(status);
        status.setTitle(TitleStatus.DONE.name());
    }

    @Override
    void performOperations() {

    }

}
