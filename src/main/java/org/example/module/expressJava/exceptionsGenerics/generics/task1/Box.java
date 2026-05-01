package org.example.module.expressJava.exceptionsGenerics.generics.task1;
/*
Условие задачи: Разработайте дженерик класс Box, который может хранить объекты любого типа.
Класс должен иметь методы для установки и получения значения объекта, хранящегося внутри.
 */

public class Box<T> {
    private T type;

    public void setType(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }


}
