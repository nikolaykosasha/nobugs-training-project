package org.example.module.cleancode.designpatterns.task6_abstractinterfacefactory;

public class WindowsMacOS implements Windows {
    @Override
    public void paint() {
        System.out.println("Mac OS Windows");
    }
}
