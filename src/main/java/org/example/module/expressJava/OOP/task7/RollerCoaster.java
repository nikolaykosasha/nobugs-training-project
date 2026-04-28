package org.example.module.expressJava.OOP.task7;

public class RollerCoaster extends Attraction {


    public RollerCoaster(String name) {
        super(name);
    }

    @Override
    public void properties() {
        System.out.println("Требуют регулярной проверки безопасности");
    }
}
