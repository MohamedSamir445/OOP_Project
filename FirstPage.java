package oop;

import java.util.Scanner;

public class FirstPage {

    int x;
    Employee e;
    Admin a;
    Scanner input = new Scanner(System.in);

    public void call_First_Page() {

        System.out.println("          WELCOME       ");
        System.out.println(" 1. Go to employee page ");
        System.out.println(" 2. Go to admin page");
        System.out.println(" 3. Exit");
        x = input.nextInt();

        if (x == 1) {
            e = new Employee("Ahmed", "123456");
            e.signIn();
        } else if (x == 2) {
            a = new Admin("Admin", "Admin");
            a.signIn();
        } else if (x == 3) {
            return;
        }
    }
}
