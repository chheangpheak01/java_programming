package oop.bankingSoftware.model;
import oop.bankingSoftware.abstraction.BankingService;

public class Account implements BankingService{
    private String userName;
    private Double userBalance = 0.0;
    public Account(String userName){
        this.userName = userName;
    }
    @Override
    public void deposit(Double dCrash){
        if(dCrash<0){
            System.out.println("Sorry, You entered invalid number");
            return;
        }
        userBalance+=dCrash;
        System.out.println("User Name : " + userName);
        System.out.println("Have deposited crash " + dCrash + " Successfully");
        System.out.println("Now you balance is " + userBalance);
    }

    @Override
    public void withdraw(Double wCrash){
        if(wCrash>userBalance){
            System.out.println("Sorry, you don't have enough money to withdraw");
            return;
        }
        userBalance-=wCrash;
        System.out.println("User Name : " + userName);
        System.out.println("Have withdraw crash " + wCrash + " successfully");
        System.out.println("Now your balance is " + userBalance);
    }

    @Override
    public void showBalance(){
        System.out.println("User Name : " + userName);
        System.out.println("Your current balance is " + userBalance);
    }

    @Override
    public void convertFromDollarToRiel(Double dollar){
        System.out.println(dollar + "$ " + " = " + (dollar*400) + "Riel");
    }

    @Override
    public void convertFromRielToDollar(Double riel){
        System.out.println(riel + "riel " + " = " + (riel/400) + "$");
    }
}
