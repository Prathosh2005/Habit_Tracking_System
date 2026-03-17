import Model.Habit;
import Service.Login;
import Service.UserService;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Login login=new Login();
       // Habit habit=new Habit();
        UserService userService=new UserService();
        boolean running=true;
         System.out.println("Welcome to the Habit_Tracking_System\n\n");

       while(running) {
           System.out.println("Enter 1 to sign up");
           System.out.println("Enter 2 to log in");
           System.out.println("Enter 3 to exit");

           int n = in.nextInt();
           in.nextLine();

           switch (n) {

               case 1 -> {
                   System.out.println("Enter your mail id");
                   String email=in.nextLine();
                   if(login.getLogin().containsKey(email))
                   {
                       System.out.println("Email already registered");
                   }
                   else {
                       System.out.println("Enter your password");
                       String password = in.nextLine();
                       System.out.println("Enter password again");
                       String checkPassword = in.nextLine();
                       if (!password.equals(checkPassword))
                           System.out.println("Password Mis-matched\n");
                       else {
                           login.registerUser(email, password);
                           System.out.println("\nSigned up Successfully");

                          System.out.println("Enter your username");
                           String username = in.nextLine();
                          userService.addUser(email,username);
                       }
                   }

               }

               case 2 -> {
                   System.out.println("Enter your mail id");
                   String email=in.nextLine();
                   if(!login.getLogin().containsKey(email))
                   {
                      System.out.println("\nThere is no email present in the database\n");
                   }
                   else {
                       String pass=login.getLogin().get(email);
                       System.out.println("Enter your password");
                       String password = in.nextLine();
                       if(pass.equals(password))
                       {
                           System.out.println("Logined Successfully");
                       }
                       else {
                           System.out.println("Invalid Password");
                       }

                   }
               }

               case 3 ->{
                   running=false;
               }

               default -> {
                   System.out.println("Enter a Valid Number");
               }
           }
       }

    }
}