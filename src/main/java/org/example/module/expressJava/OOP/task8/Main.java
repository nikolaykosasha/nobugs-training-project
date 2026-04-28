package org.example.module.expressJava.OOP.task8;

public class Main {
    public static void main(String[] args) {

        Exhibit ancientManuscript = new AncientManuscript("Экспонат", 36.7, 80);
        Exhibit sculpture = new Sculpture("Скульптура", true);

        Museum museum = new Museum("Ночной музей", sculpture);
        museum.printHistory();
        museum.storageConditions();
    }
}
