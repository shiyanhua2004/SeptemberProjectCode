package BankAccount2;

import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        int[][] preBuiltOptions = new int[2][2];
        preBuiltOptions[0][0]= 100;
        preBuiltOptions[0][1]=1000;
        preBuiltOptions[1][0]=-100;
        preBuiltOptions[1][1]=-1000;

        User user = new User("1","1","1");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the following information to login\n" +
                "Hint: Case sensitive");
        System.out.println("Please enter your fist name");
        String firstName = scanner.nextLine();
        System.out.println("Please enter your last name");
        String lastName = scanner.nextLine();
        System.out.println("Please enter your email address");
        String userEmail = scanner.nextLine();


        if (firstName.equals(user.getName())&&lastName.equals(user.getLastName())&&userEmail.equals(user.getEmail()))
        {
            loginText();
            System.out.println("Hello "+ user.getName()+"!");

            int randomBalance;
            Random moneyInAccount = new Random();

            randomBalance = moneyInAccount.nextInt(50000);

            double withdraw = 0;

            double deposit = 0;

            double[] userInfo = {randomBalance,deposit,withdraw };

            boolean logOut=false;

            System.out.println("currentBalance: " + userInfo[0]);
            while (!logOut)
            {
                infoText();

                int userAction = scanner.nextInt();
                scanner.nextLine();

                switch (userAction)
                {
                    case 0:
                        System.out.println("Logging out...");

                        logOut = true;

                        break;

                    case 1:

                        System.out.println("How much would you like to add to your account?");
                        System.out.println("Press 1 for 100$\n" +
                                "press 2 for 1000$\n" +
                                "Press 3 for custom ");

                        int userChoiceNum1 = scanner.nextInt();
                        scanner.nextLine();

                        if (userChoiceNum1 == 1)
                        {
                            userInfo[0] += preBuiltOptions[0][0];
                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                        else if (userChoiceNum1 == 2)
                        {
                            userInfo[0]+=preBuiltOptions[0][1];
                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                        else if (userChoiceNum1 == 3)
                        {
                            System.out.println("Please enter amount!");
                            double depositNum = scanner.nextDouble();
                            scanner.nextLine();

                            userInfo[1] = depositNum;
                            userInfo[0] += userInfo[1];
                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }

                    case 2:

                        System.out.println("How much would you like to withdraw?");
                        System.out.println("Press 1 for 100$\n" +
                                "press 2 for 1000$\n" +
                                "Press 3 for custom ");

                        int userChoiceNum2 = scanner.nextInt();
                        scanner.nextLine();

                        if (userChoiceNum2==1)
                        {
                            userInfo[0]+=preBuiltOptions[1][0];

                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
                        else if (userChoiceNum2 == 2)
                        {
                            userInfo[0]+=preBuiltOptions[1][1];

                            System.out.println("currentBalance: " + userInfo[0]);

                            break;
                        }
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
        else
        {
            System.out.println("Login failed try again");
        }
    }
    private static void loginText()
    {
        System.out.println("Logging in...");
    }
    private static void infoText()
    {
        System.out.println("\nPlease press\n" +
                "0 to logout\n" +
                "1 to add deposit\n" +
                "2 to withdraw\n");
    }
}
