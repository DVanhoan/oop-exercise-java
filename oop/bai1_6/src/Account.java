

import java.util.Scanner;

public class Account {
    private
    String id;
    String Name;
    int balance = 0;

    public Account(String id, String Name, int balance){
        this.id = id;
        this.Name = Name;
        this.balance = balance;
    }
    public String getID(){
        return id;
    }
    public String getName(){
        return Name;
    }
    public int getBalance(){
        return balance;
    }
    public int credit(int amount){
        this.balance += amount;
        return balance;
    }
    public int debit(int amount) {
        if (balance >= amount){
            this.balance -= amount;
        }
        else {
            System.out.println("amount exceeded ");
        }
        return balance;

    }
    public int transfer(String another, int amount){
        if (amount <=balance){
            this.balance -= amount;
        }
        else {
            System.out.println("amount exceeded ");
        }
        return balance;
    }
    public String toString(){
        return "Account[id= "+ id + ", name= "+ Name + ", balance= " + balance + "]";
    }
}
