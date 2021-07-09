package ru.geekbrains.order.state;

import ru.geekbrains.order.model.Status;

public class DispatchStatus extends OrderStatus{
    public DispatchStatus(Status status) {
        super(status);
        status.setTitle(TitleStatus.DISPATCH.name());
    }

    @Override
    void performOperations() {
        if (start()) status.changeStatus(new DoneStatus(status));
    }

    private boolean start(){
        // Запуск различных операций на данном этапе, если всё выполнено корректно, возвращает True и меняет статус,
        // запуская новые операции
        return true;
    }
}
