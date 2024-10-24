package oop.bankAccount.modules;

import oop.bankAccount.exception.NoBabloException;

public class BankAccount {

    private String accountNumber;
    private int balance;
    private Person owner;

    public BankAccount(String accountNumber, int balance, Person owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(int amount) throws NoBabloException {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Счет пополнен на " + amount + ", текущий баланс: " + balance);
        } else {
            throw new NoBabloException("Сумма не может быть отрицательной");
        }
    }

    public void withdraw(int amount) throws NoBabloException {
        if (amount > 0) {
            if (amount <= balance) {
                this.balance -= amount;
                System.out.println("Со счета снято " + amount + ", текущий баланс: " + balance);
            } else {
                throw new NoBabloException("На вашем счете недостаточно средств");
            }
        } else {
            throw new NoBabloException("Сумма не может быть отрицательной");
        }
    }

    public void transfer(BankAccount targetAccount, int amount) throws NoBabloException {
        if (amount > 0) {
            if (amount <= balance) {
                this.balance -= amount;
                targetAccount.balance += amount;
                System.out.println("Сумма " + amount + " переведена на счет: " + targetAccount.accountNumber);
            } else {
                throw new NoBabloException("Недостаточно средств для перевода");
            }
        } else {
            throw new NoBabloException("Сумма не может быть отрицательной");
        }
    }

    public String getAccountInfo() {
        return "Номер счета: " + accountNumber + ", баланс: " + balance + ", владелец: " + owner.getFullName();
    }
}