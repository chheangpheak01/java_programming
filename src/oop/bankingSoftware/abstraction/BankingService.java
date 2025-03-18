package oop.bankingSoftware.abstraction;

public interface BankingService{
    void deposit(Double dCrash);
    void withdraw(Double wCrash);
    void showBalance();
    void convertFromDollarToRiel(Double dollar);
    void convertFromRielToDollar(Double riel);
}
