package BankAccount2;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int[][] preBuiltOptions = new int[2][2];
        preBuiltOptions[1][1]= 100;
        preBuiltOptions[1][2]=1000;
        preBuiltOptions[2][1]=-100;
        preBuiltOptions[2][2]=-1000;

        User user = new User("emad","shiran","emad534624@gamil.com");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter your info to login\n" +
                "Hint: Key senstive");
        System.out.println("Plese enter your user name");
        String userName= scanner.nextLine();
        System.out.println("Please enter your lastName");
        String userGender = scanner.nextLine();
        System.out.println("Please enter your email");
        String userEmail = scanner.nextLine();



        if (userName.equals(user.getName())&&userGender.equals(user.getLastName())&&userEmail.equals(user.getEmail())) {

            loginText();
            System.out.println("Hello "+ user.getName()+"!");



            int randomeBalance;
            Random moneyInAccount = new Random();

            randomeBalance= moneyInAccount.nextInt(50000);


            double withDraw=0;

            double deposit = 0;

            double userinfo[] ={randomeBalance,deposit,withDraw};


            boolean logOut=false;

            System.out.println("currentBalance: " +userinfo[0]);
            while (!logOut) {

                infoText();


                int userAction = scanner.nextInt();
                scanner.nextLine();

                switch (userAction) {
                    case 0:
                        System.out.println("Logging out...");
                        logOut = true;
                        break;


                    case 1:

                        System.out.println("How much would you like to add to your account?");
                        double depositNum = scanner.nextDouble();
                        scanner.nextLine();
                        userinfo[1] = depositNum;
                        userinfo[0] += userinfo[1];
                        System.out.println("currentBalance: " + userinfo[0]);

                        break;


                    case 2:
                        System.out.println("How much would you like to withdraw?");
                        System.out.println("Press 1 for 100$\n" +
                                "press 2 for 1000$\n" +
                                "Press 3 for custom ");

                        int userChoicenum = scanner.nextInt();




                        double withdrawNum = scanner.nextDouble();
                        scanner.nextLine();
                        userinfo[2] = withdrawNum;
                        userinfo[0] -= userinfo[2];
                        System.out.println("currentBalance: " + userinfo[0]);

                        break;





                }


            }
        }
        else {
            System.out.println("Login failed try again");
        }



    }
    private static void loginText() {
        System.out.println("Loging in...");

    }
    private static void infoText() {
        System.out.println("\nPlese presss\n" +
                "0 to logout\n" +
                "1 to add deposit\n" +
                "2 to withdraw\n");


    }


}
