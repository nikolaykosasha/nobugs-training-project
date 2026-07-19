package org.example.module.expressJava.complexTasks.warehouseInventory;

import java.util.List;

public interface InventoryService {

    void addingProduct(String category, Product product);

    List<Product> getProductByCategory(String category);
}
