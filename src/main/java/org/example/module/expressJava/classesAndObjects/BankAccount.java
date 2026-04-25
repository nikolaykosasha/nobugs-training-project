package org.example.module.expressJava.classesAndObjects;
/*
Создайте класс BankAccount с полями owner и balance.
Реализуйте конструктор, геттеры, сеттер для владельца,
 методы deposit(amount) и withdraw(amount) и метод printBalance().
 В main внесите деньги, снимите и выведите баланс.
 */
public class BankAccount {
    private String onwer;
    private long balance;

    public BankAccount(String onwer, long balance) {
        this.onwer = onwer;
        this.balance = balance;
    }

    public String getOnwer() {
        return onwer;
    }

    public long getBalance() {
        return balance;
    }

    public void setOnwer(String onwer) {
        this.onwer = onwer;
    }

    public void deposit(long amount) {
        balance = balance + amount;
    }

    public void withdraw(long amount) {
        balance = balance - amount;
    }

    public void printBalance() {
        System.out.println("Баланс: " + balance);
    }
}
