package ru.geekbrains.order.state;

import ru.geekbrains.order.model.Status;

public class RequestStatus extends OrderStatus{
    public RequestStatus(Status status) {
        super(status);
        status.setTitle(TitleStatus.REQUEST.name());
    }

    @Override
    void performOperations() {
        if (start()) status.changeStatus(new FulfillmentStatus(status));
    }

    private boolean start(){
        // Запуск различных операций на данном этапе, если всё выполнено корректно, возвращает True и меняет статус,
        // запуская новые операции
        return true;
    }
}
