package oop.bankingSoftware;
import oop.bankingSoftware.model.Account;

public class Application {
    public static void main(String[] args) {
        System.out.println("*".repeat(20) + " Saving Account " + "*".repeat(20));
        Account savingAccount = new Account("Chheang pheak");
        savingAccount.deposit(4.9);
        savingAccount.convertFromRielToDollar(4.9);
        System.out.println("*".repeat(20) + " Credit Card Account " + "*".repeat(20));
        Account creditCardAccount = new Account("Kim tola");
        creditCardAccount.showBalance();
    }
}
