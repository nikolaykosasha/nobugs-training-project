package org.example.module.cleancode.designpatterns.task11_facade;

public class AirConditionerGadget {
    String state;

    public AirConditionerGadget(String state) {
        this.state = state;
    }

    void swithAirConditionerGadget() {
        if (state.equals("ВКЛ")) {
            state = "ВЫКЛ";
        } else {
            state = "ВКЛ";
        }
    }
}
