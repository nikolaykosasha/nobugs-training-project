package org.example.module.cleancode.designpatterns.task6_abstractinterfacefactory;

public interface GUIFactory {
    Button createButton();
    Menu createMenu();
    Windows createWindows();
}
