package org.example.module.cleancode.designpatterns.task6_abstractinterfacefactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new ButtonWindows();
    }

    @Override
    public Menu createMenu() {
        return new MenuWindows();
    }

    @Override
    public Windows createWindows() {
        return new WindowsWindows();
    }
}
