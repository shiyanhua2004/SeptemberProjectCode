package BankAccount2;

import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {

        //2D array built for automation of the ammount
        int[][] preBuiltOptions = new int[2][2];
        preBuiltOptions[0][0]= 100;
        preBuiltOptions[0][1]=1000;
        preBuiltOptions[1][0]=-100;
        preBuiltOptions[1][1]=-1000;

        //pulls data from the class that is used as a login
        User user = new User("1","1","1");

        Scanner scanner = new Scanner(System.in);
        //a notification system that tells the user to login
        System.out.println("Please enter the following information to login\n" +
                "Hint: Case sensitive");
        // the scanner takes user input
        System.out.println("Please enter your fist name");
        String firstName = scanner.nextLine();
        // the scanner takes user input
        System.out.println("Please enter your last name");
        // the scanner takes user input
        String lastName = scanner.nextLine();
        System.out.println("Please enter your email address");
        String userEmail = scanner.nextLine();

        //Checks to see if the entered information is correct other wise it fails
        if (firstName.equals(user.getName())&&lastName.equals(user.getLastName())&&userEmail.equals(user.getEmail()))
        {

            //calls the login messege method and welcomes the suer by their first name
            loginText();
            System.out.println("Hello "+ user.getName()+"!");
            // builds a randome number for each user to simulate the bank account
            int randomBalance;
            Random moneyInAccount = new Random();
            // the amount is up to 50000
            randomBalance = moneyInAccount.nextInt(50000);

            double withdraw = 0;

            double deposit = 0;
            // creating an array for each imprtent value that we have
            double[] userInfo = {randomBalance,deposit,withdraw};


            // setting up for a switch case that a user will intract with
            boolean logOut=false;
            // shows user the amount of money in their account
            System.out.println("currentBalance: " + userInfo[0]);
            while (!logOut)
            {
                //gives menu info
                infoText();
                // setting up user inputs
                int userAction = scanner.nextInt();
                scanner.nextLine();
                //switch begains
                switch (userAction)
                {
                    //if user enters 0 they will log out
                    case 0:
                        System.out.println("Logging out...");

                        logOut = true;

                        break;

                    case 1:
                        //informs the user of their options
                        System.out.println("How much would you like to add to your account?");
                        System.out.println("Press 1 for 100$\n" +
                                "press 2 for 1000$\n" +
                                "Press 3 for custom ");

                        int userChoiceNum1 = scanner.nextInt();
                        scanner.nextLine();
                        // if users enters 1 the ammount of money will be added to the preset of the 2D array
                        if (userChoiceNum1 == 1)
                        {
                            userInfo[0] += preBuiltOptions[0][0];
                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                        // if users enters 2 the ammount of money will be added to the preset of the 2D array
                        else if (userChoiceNum1 == 2)
                        {
                            userInfo[0]+=preBuiltOptions[0][1];
                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                        // if users enters 3 the ammount of money will be added with the custome amount of money
                        else if (userChoiceNum1 == 3)
                        {
                            // takes user number and uses the array that we built to added to it
                            System.out.println("Please enter amount!");
                            double depositNum = scanner.nextDouble();
                            scanner.nextLine();

                            userInfo[1] = depositNum;
                            userInfo[0] += userInfo[1];
                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                    // if the user presses 2 it will start the withdraw procses
                    case 2:
                        //informs the user
                        System.out.println("How much would you like to withdraw?");
                        System.out.println("Press 1 for 100$\n" +
                                "press 2 for 1000$\n" +
                                "Press 3 for custom ");
                        // setting up of the user input
                        int userChoiceNum2 = scanner.nextInt();
                        scanner.nextLine();
                        //if users presses 1 the preset amount will be redused from the account from the 2D array
                        if (userChoiceNum2==1)
                        {
                            userInfo[0]+=preBuiltOptions[1][0];

                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                        //if users presses 2 the preset amount will be redused from the account from the 2D array
                        else if (userChoiceNum2 == 2)
                        {
                            userInfo[0]+=preBuiltOptions[1][1];

                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                        //if users presses 3 they can enter a custome account that will be redused from their account
                        else if (userChoiceNum2 == 3)
                        {
                            System.out.println("Please enter amount!");
                            double withdrawNum = scanner.nextDouble();
                            scanner.nextLine();
                            userInfo[2] = withdrawNum;
                            userInfo[0] -= userInfo[2];
                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                }
            }
        }
        //here if the login fails this messege will show and the program will termnates
        else
        {
            System.out.println("Login failed try again");
        }
    }
    // user login text method
    private static void loginText()
    {
        System.out.println("Logging in...");
    }
    // user text menu to show options
    private static void infoText()
    {
        System.out.println("\nPlease press\n" +
                "0 to logout\n" +
                "1 to add deposit\n" +
                "2 to withdraw\n");
    }
}
