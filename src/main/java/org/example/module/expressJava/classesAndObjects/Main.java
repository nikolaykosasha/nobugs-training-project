package org.example.module.expressJava.classesAndObjects;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car (1979, "Mustang");

        car1.print();

        car1.setYear(1978);

        car1.print();

        Rectangle rectangle = new Rectangle(4.5, 5.5);

        rectangle.setWidth(5.5);

        double S = rectangle.calculateArea();
        System.out.println(S);

        Book book = new Book("Есенин", "Книга");
        book.printInfo();

        BankAccount bankAccount = new BankAccount("Петров", 20000L);
        bankAccount.printBalance();
        bankAccount.deposit(15000L);
        bankAccount.printBalance();
        bankAccount.withdraw(bankAccount.getBalance());
        bankAccount.printBalance();

        Point point = new Point(5, 10);
        point.print();
        point.setX(10);
        point.print();

        StudentGroup studentGroup = new StudentGroup("345/01ИТ", 10);
        studentGroup.setStudentCount(20);
        studentGroup.printInfo();

        Circle circle = new Circle();

        circle.setRadius(3.8);

        circle.calculateArea();
        circle.calculateCircumference();

        Teacher teacher = new Teacher();

        teacher.setSubject("Биология");
        teacher.printInfo();

        Product product = new Product("Банан", 225);
        product.applyDiscount(150);
        product.printInfo();

        Laptop laptop = new Laptop("Apple", 545);
        laptop.setPrice(600);
        laptop.printInfo();
    }
}
