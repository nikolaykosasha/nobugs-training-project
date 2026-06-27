package org.example.module.expressJava.complexTasks.warehouseInventory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class InventoryManagement implements InventoryService{
    private Map<String, List<Product>> storage;
    private boolean isInventoryOpen;

    public void setInventoryOpen(boolean inventoryOpen) {
        isInventoryOpen = inventoryOpen;
    }

    @Override
    public synchronized void addingProduct(String category, Product product) {

        if (isInventoryOpen){
            storage.computeIfAbsent(category, c -> new ArrayList<>());
            storage.get(category).add(product);
        }
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        List<Product> productList = storage.get(category);

        if (productList == null || productList.isEmpty()) {
            throw new OutOfStockException("Категория: " + category + " пуста");
        }

        return productList;
    }

    public List<Product> getProductSorted(List<Product> productList) {
        return productList.stream()
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .toList();
    }
}
