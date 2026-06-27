package org.example.module.expressJava.complexTasks.universalEntityManager;

import java.util.ArrayList;
import java.util.List;

public class EntityManager <T extends Entity> {
    //Так же для обеспечения безопасности можно использовать готовую коллекцию.
    private List<T> listEntity = new ArrayList<>();

    public synchronized void add(T entity) {
        listEntity.add(entity);
    }

    public synchronized boolean remove(T entity) {
        return listEntity.remove(entity);
    }

    public List<T> getListEntity() {
        return List.copyOf(listEntity);
    }

    public List<T> filterByAge(int min, int max) {
      return listEntity.stream()
                .filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .toList();
    }

    public List<T> filterByName(String name) {
        return listEntity.stream()
                .filter(entity -> entity.getName().equals(name))
                .toList();
    }

    public List<T> filterByStatus(boolean status) {
        return listEntity.stream()
                .filter(entity -> entity.isActive() == status)
                .toList();
    }
}
