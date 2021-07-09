package ru.geekbrains.order.state;

public enum TitleStatus {
    REQUEST("Заявка"),
    FULFILLMENT("Выполнение"),
    DISPATCH("Отправка"),
    DONE("Готово")
    ;

    TitleStatus(String s) {
    }
}
