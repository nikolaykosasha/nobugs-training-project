package org.example.module.cleancode.designpatterns.task6_abstractinterfacefactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new ButtonMacOS();
    }

    @Override
    public Menu createMenu() {
        return new MenuMacOS();
    }

    @Override
    public Windows createWindows() {
        return new WindowsMacOS();
    }
}
