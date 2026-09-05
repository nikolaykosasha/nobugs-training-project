package org.example.module.cleancode.designpatterns.task11_facade;

public class FacadeHome {
    private AirConditionerGadget airConditionerGadget;
    private LightGadget lightGadget;
    private SecuritySystemGadget securitySystemGadget;

    public FacadeHome(AirConditionerGadget airConditionerGadget,
                      LightGadget lightGadget,
                      SecuritySystemGadget securitySystemGadget) {
        this.airConditionerGadget = airConditionerGadget;
        this.lightGadget = lightGadget;
        this.securitySystemGadget = securitySystemGadget;
    }

    public void controlHome() {
        airConditionerGadget.swithAirConditionerGadget();
        lightGadget.swithLightGadget();
        securitySystemGadget.swithSecuritySystemGadget();
    }
}
