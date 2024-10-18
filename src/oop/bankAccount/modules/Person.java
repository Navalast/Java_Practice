package oop.bankAccount.modules;

import oop.bankAccount.exception.NoCorrectAgeException;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(int age, String firstName, String lastName) throws NoCorrectAgeException {
        if (age >= 14) {
            this.age = age;
        } else {
            throw new NoCorrectAgeException("Пользователи младше 14 лет не могут создать счет в банке");
        }
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