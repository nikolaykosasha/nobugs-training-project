package org.example.module.cleancode.designpatterns.task12_facadeDoor;

public class FacadeDoor {
    private OpenDoor openDoor;
    private CloseDoor closeDoor;
    private BlockDoor blockDoor;

    public FacadeDoor(CloseDoor closeDoor, OpenDoor openDoor, BlockDoor blockDoor) {
        this.closeDoor = closeDoor;
        this.openDoor = openDoor;
        this.blockDoor = blockDoor;
    }

    public void controlDoor() {
        openDoor.openDoor();
        closeDoor.closeDoor();
        blockDoor.blockDoor();
    }
}
