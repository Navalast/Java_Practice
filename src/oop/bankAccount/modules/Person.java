package oop.bankAccount.modules;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return "ФИО владельца счета: " + firstName + " " + lastName;
    }

    public String getAge() {
        return "Возраст владельца счета: " + age;
    }
}