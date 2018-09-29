import java.util.*;
import java.io.*;

public class Bank {

  final static String nameBank = "Your Bank";
  private String  nameDepositor, address;
  private int balance;
  private static int number = 0;

  Bank() {
    number++;
  }

  void setData(String name, int bal, String add) {
    nameDepositor = name;
    balance = bal; 
    address = add;
  }

  void getData() {
    System.out.println("Name : " + nameDepositor);
    System.out.println("Balance : " + balance);
    System.out.println("Address : " + address);
    System.out.println();
  }

  void deposit(int amount) {
     balance += amount;
  }

  void withdraw(int amount) {
     if(balance >= amount) {
        balance -= amount;
        System.out.println("Balance Available : " + balance);
     } else {
        System.out.println("Balance not available. Balance Available : " + balance);
     }
     System.out.println();
  }

  static void printName() {
    System.out.println("Name of Bank : " + nameBank);
    System.out.println();
  }

  static void printNumber() {
    System.out.println("Number of Depositors in Bank : " + number);
    System.out.println();
  }

  void exchangeAddress(Bank details) {
     String temp = this.address;
     this.address = details.address;
     details.address = temp;
  }

  static double average(Bank[] arrayObjects) {
    double avg = 0;
    for(int i = 0; i < arrayObjects.length; i++) {
      avg += arrayObjects[i].balance;
    }
    return (avg / arrayObjects.length);
  }

  public static void main(String args[]) {
     Bank[] depos = new Bank[5];
     for(int i = 0; i < 5; i++) {
       depos[i] = new Bank();
     }
     depos[0].setData("Guneet", 1000, "ABC");
     depos[1].setData("Ayush", 1010, "ABCD");
     depos[2].setData("Guneet", 1010, "ABC");
     depos[3].setData("Guneet", 1010, "ABC");
     depos[4].setData("Guneet", 1000, "ABC"); 
     Bank.printName();
     Bank.printNumber();
     depos[0].getData();
     depos[0].deposit(1000);
     depos[0].getData();
     depos[0].withdraw(500);
     depos[0].withdraw(20000);
     depos[0].getData();
     depos[1].getData();
     depos[0].exchangeAddress(depos[1]);
     depos[0].getData();
     depos[1].getData();
     System.out.println("Average Balance : " + average(depos));
  }
} 
