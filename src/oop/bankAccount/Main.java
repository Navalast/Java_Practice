package oop.bankAccount;

import oop.bankAccount.exception.NoBabloException;
import oop.bankAccount.exception.NoCorrectAgeException;
import oop.bankAccount.modules.BankAccount;
import oop.bankAccount.modules.Person;

public class Main {
    public static void main(String[] args) throws NoBabloException, NoCorrectAgeException {

        Person victor = new Person(22, "Виктор", "Колюшев");
        System.out.println(victor.getFullName());
        System.out.println(victor.getAge());

        System.out.println("--------------------");

        Person alex = new Person(28, "Алекс", "Сметанов");
        System.out.println(alex.getFullName());
        System.out.println(alex.getAge());

        System.out.println("--------------------");

        BankAccount victorBankAccount = new BankAccount("5455", 10000, victor);
        BankAccount alexBankAccount = new BankAccount("6666", 5000, alex);

        System.out.println(victorBankAccount.getAccountInfo());
        victorBankAccount.deposit(5000);
        victorBankAccount.withdraw(7000);

        System.out.println("--------------------");

        System.out.println(alexBankAccount.getAccountInfo());
        alexBankAccount.transfer(victorBankAccount, 500);
        System.out.println(alexBankAccount.getAccountInfo());
        System.out.println(victorBankAccount.getAccountInfo());
    }
}