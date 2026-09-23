package org.example.module.cleancode.designpatterns.task11_facade;

public class LightGadget {
    String state;

    public LightGadget(String state) {
        this.state = state;
    }

    void swithLightGadget() {
        if (state.equals("ВКЛ")) {
            state = "ВЫКЛ";
        } else {
            state = "ВКЛ";
        }
    }
}
