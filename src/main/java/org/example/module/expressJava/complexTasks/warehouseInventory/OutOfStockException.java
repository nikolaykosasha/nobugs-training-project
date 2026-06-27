package org.example.module.expressJava.complexTasks.warehouseInventory;

public class OutOfStockException extends RuntimeException {
    public OutOfStockException(String message) {
        super(message);
    }
}
