package oop;

import java.util.Scanner;

public class Admin extends Person {

    TrainerPage k = new TrainerPage();
    private String password;

    public Admin(String password, String name) {
        super(name);
        this.password = password;
    }

    @Override
    public void signIn() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter Admin User name : ");
        String username = input.next();
        System.out.println("                ");
        System.out.print(" Enter your Password : ");
        String password = input.next();
        System.out.println("                ");

        if (username.equals(name) && password.equals(this.password)) {
            System.out.println("***** Succesfully loged in ********");
            System.out.println("                         WELCOME    " + name);
            k.Trainer_info();
        } else {
            System.out.println("*******************************************");
            System.out.println(" Wrong username or password ");
            System.out.println(" Please try again ");
            signIn();
        }
    }

}
