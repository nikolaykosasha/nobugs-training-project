package org.example.module.cleancode.designpatterns.task6_abstractinterfacefactory;

public class ButtonWindows implements Button {
    @Override
    public void paint() {
        System.out.println("OS Windows Button");
    }
}
