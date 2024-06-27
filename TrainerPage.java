package oop;

import java.util.Scanner;

public class TrainerPage {

    TrainerList t = new TrainerList();

    public void Trainer_info() {
        Scanner n = new Scanner(System.in);

        int x, y;
        char choice = 'y';
        while (choice == 'y' || choice == 'Y') {

            System.out.println("1.add new Trainer");
            System.out.println("2.remove Trainer");
            System.out.println("3.display");
            System.out.println("4.Check availibility");
            x = n.nextInt();
            if (x == 1) {
                t.Add_Trainer();
            } else if (x == 2) {
                t.remove_Trainer();
            } else if (x == 3) {
                t.display_Trainer();

            } else if (x == 4) {

                t.Checkavailiability();

            }
            System.out.println("Do you want to continue(y/n)?");
            choice = n.next().charAt(0);
            if (choice == 'N' || choice == 'n') {
                FirstPage f = new FirstPage();
                f.call_First_Page();
            }

        }
    }
}
