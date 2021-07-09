package ru.geekbrains.order.state;

import ru.geekbrains.order.model.Status;

public class FulfillmentStatus extends OrderStatus{
    public FulfillmentStatus(Status status) {
        super(status);
        status.setTitle(TitleStatus.FULFILLMENT.name());
    }
    @Override
    void performOperations() {
        if (start()) status.changeStatus(new DispatchStatus(status));
    }

    private boolean start(){
        // Запуск различных операций на данном этапе, если всё выполнено корректно, возвращает True и меняет статус,
        // запуская новые операции
        return true;
    }
}
