package BankAccount2;

public class Bank {

    // method to subtract 100 from account balance
    public static double subHundred(double balance) {

        balance += UserInterface.preBuiltOptions[1][0];
        return balance ;
    }

    // method to subtract 1000 from account balance
    public static double subThousand(double balance) {

        balance += UserInterface.preBuiltOptions[1][1];
        return balance;
    }

    // method to subtract specific amount from account balance
    public static double subSpecific(double balance, double amount) {

        balance = (balance - amount);
        return balance;
    }
    // method to add 100 to account balance
    public static double addHundred(double balance) {

        balance += UserInterface.preBuiltOptions[0][0];
        return balance;
    }

    // method to add 1000 to account balance
    public static double addThousand(double balance) {

        balance += UserInterface.preBuiltOptions[0][1];
        return balance;
    }

    // method to add specific amount to account balance
    public static double addSpecific(double balance, double amount) {

        balance = (balance + amount);
        return balance;
    }


}
