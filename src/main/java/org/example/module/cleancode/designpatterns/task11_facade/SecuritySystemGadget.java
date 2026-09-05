package org.example.module.cleancode.designpatterns.task11_facade;

public class SecuritySystemGadget {
    String state;

    public SecuritySystemGadget(String state) {
        this.state = state;
    }

    void swithSecuritySystemGadget() {
        if (state.equals("ВКЛ")) {
            state = "ВЫКЛ";
        } else {
            state = "ВКЛ";
        }
    }
}
