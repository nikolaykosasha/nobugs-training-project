package module.expressJava.complexTasks;

import org.example.module.expressJava.complexTasks.movieRatings.Movie;
import org.example.module.expressJava.complexTasks.userDataValidator.InvalidUserException;
import org.example.module.expressJava.complexTasks.warehouseInventory.InventoryManagement;
import org.example.module.expressJava.complexTasks.warehouseInventory.OutOfStockException;
import org.example.module.expressJava.complexTasks.warehouseInventory.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WarehouseInventoryTests {

    @Test
    @DisplayName("Добавления продукта в склад")
    void addingProductTest() {
        Product product = new Product("Ручка", 10, "КанцТовары");
        Product product2 = new Product("Карандаш", 10, "КанцТовары");
        InventoryManagement inventoryManagement = new InventoryManagement();
        inventoryManagement.setInventoryOpen(true);

        int instanceSize = inventoryManagement.getStorage().size();
        inventoryManagement.addingProduct("КанцТовары", product);
        inventoryManagement.addingProduct("КанцТовары", product2);

        assertEquals(instanceSize + 1, inventoryManagement.getStorage().size());
        assertEquals(2, inventoryManagement.getStorage().get("КанцТовары").size());
    }

    @Test
    @DisplayName("Проверка флага на добавление")
    void isInventoryOpenTest() {
        Product product = new Product("Ручка", 10, "КанцТовары");
        Product product2 = new Product("Карандаш", 10, "КанцТовары");
        InventoryManagement inventoryManagement = new InventoryManagement();
        inventoryManagement.setInventoryOpen(false);

        int instanceSize = inventoryManagement.getStorage().size();
        inventoryManagement.addingProduct("КанцТовары", product);
        inventoryManagement.addingProduct("КанцТовары", product2);
        int actualResult = inventoryManagement.getStorage().size();

        assertEquals(instanceSize, actualResult);
    }

    @Test
    @DisplayName("Проверка пустой категории")
    void nullCategoryTest() {
        Product product = new Product("Ручка", 10, "КанцТовары");
        Product product2 = new Product("Карандаш", 10, "КанцТовары");
        InventoryManagement inventoryManagement = new InventoryManagement();
        inventoryManagement.setInventoryOpen(true);

        inventoryManagement.addingProduct("КанцТовары", product);
        inventoryManagement.addingProduct("КанцТовары", product2);

        assertThrows(OutOfStockException.class, () -> {
            inventoryManagement.getProductByCategory("Автомобиль");
        });
    }

    @Test
    @DisplayName("Проверка сортировки")
    void sortedTest() {
        Product product = new Product("Ручка", 10, "КанцТовары");
        Product product2 = new Product("Карандаш", 20, "КанцТовары");
        InventoryManagement inventoryManagement = new InventoryManagement();
        inventoryManagement.setInventoryOpen(true);

        inventoryManagement.addingProduct("КанцТовары", product);
        inventoryManagement.addingProduct("КанцТовары", product2);

        Product actualResult = inventoryManagement.getProductSorted(inventoryManagement.getProductByCategory("КанцТовары")).getFirst();
        assertEquals(product2.getName(), actualResult.getName());
    }
}
