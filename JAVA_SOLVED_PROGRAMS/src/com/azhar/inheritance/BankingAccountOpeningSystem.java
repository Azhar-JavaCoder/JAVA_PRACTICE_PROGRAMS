package com.azhar.inheritance;


class Account {

    String name;
    double deposit;

    Account(String name, double deposit) {
        this.name = name;
        this.deposit = deposit;
    }
}


class SavingsAccount extends Account {

    int interestRate;

    SavingsAccount(String name, double deposit, int interestRate) {
        super(name, deposit);  
        this.interestRate = interestRate;
    }

    void display() {
        System.out.println("Account{name='" + name + "', deposit=" + deposit + ", interestRate=" + interestRate + "%}");
    }
}

public class BankingAccountOpeningSystem {

    public static void main(String[] args) {

       
        String name = IO.readln("Enter your name : ");
        double deposit = Double.parseDouble(IO.readln("Enter the amount you want to deposit : "));
        int interestRate = Integer.parseInt(IO.readln("Enter Interest Rate Amount :  "));

        SavingsAccount acc = new SavingsAccount(name, deposit, interestRate);

        acc.display();
    }
}