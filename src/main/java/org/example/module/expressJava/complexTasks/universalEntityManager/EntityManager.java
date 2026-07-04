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

    public synchronized List<T> getListEntity() {
        return List.copyOf(listEntity);
    }

    public synchronized List<T> filterByAge(int min, int max) {
      return listEntity.stream()
                .filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .toList();
    }

    public synchronized List<T> filterByName(String name) {
        return listEntity.stream()
                .filter(entity -> entity.getName().equals(name))
                .toList();
    }

    public synchronized List<T> filterByStatus(boolean status) {
        return listEntity.stream()
                .filter(entity -> entity.isActive() == status)
                .toList();
    }
}
