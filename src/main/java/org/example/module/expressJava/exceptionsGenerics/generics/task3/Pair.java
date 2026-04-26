package org.example.module.expressJava.exceptionsGenerics.generics.task3;
/*
Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
Класс должен позволять получать и устанавливать каждый из этих объектов.
 */
public class Pair <T, V> {
    private T type;
    private V variable;

    public void addType(T type) {
        this.type = type;
    }

    public T getType() {
        return type;
    }

    public void addVariable(V variable) {
        this.variable = variable;
    }

    public V getVariable() {
        return variable;
    }

}
