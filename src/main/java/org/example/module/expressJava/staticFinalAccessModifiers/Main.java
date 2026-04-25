package org.example.module.expressJava.staticFinalAccessModifiers;

public class Main {
    public static void main(String[] args) {

        Company company1 = new Company(1, "Василий");
        Company company2 = new Company(2, "Максим");

        company1.printCompanyName();
        Company.companyName = "Моя компания";

        company1.printCompanyName();
        company2.printCompanyName();

        System.out.println(MathConstants.calculateCircleArea(6.2));
        System.out.println(MathConstants.calculateCircleArea(8.5));
        System.out.println(MathConstants.calculateCircumference(8.8));
        System.out.println(MathConstants.calculateCircumference(7.6));
        System.out.println(MathConstants.calculateExponentialGrowth(3.2, 5,25));

        University.universityName = "МГУ";
        University student1 = new University(1, "Петя");
        University student2 = new University(2, "Василий");

        student1.printStudentInfo();
        student2.printStudentInfo();

        University.changeUniversityName("ИТМО");

        student1.printStudentInfo();
        student2.printStudentInfo();

        GameSettings game1 = new GameSettings("Футбол", 12);
        GameSettings game2 = new GameSettings("Баскетбол", 5);

        GameSettings.setMaxPlayers(20);

        game1.printGameStatus();
        game2.printGameStatus();

        //создайте несколько объектов, измените имя у одного и выведите информацию.

        Person person1 = new Person("Иван", "Петров", "234-657");
        Person person2 = new Person("Михаил", "Васильевич", "654-13");

        person1.setFirstName("Евгений");

        person1.printPersonInfo();
        person2.printPersonInfo();
    }
}
