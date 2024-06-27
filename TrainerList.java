package oop;

import java.util.Scanner;

public class TrainerList {

    Scanner input = new Scanner(System.in);
    private Trainer[] trainer = new Trainer[50];
    static int i = 0;
    int id = 1;

    public void Add_Trainer() {
        System.out.print(" Enter Trainer name : ");
        String name = input.next();
        System.out.print(" Enter Trainer age : ");
        int age = input.nextInt();
        System.out.print(" Enter Trainer phone number : ");
        int phone = input.nextInt();
        System.out.print(" Enter Trainer Adress : ");
        String adress = input.next();
        System.out.print(" Enter Trainer Working Day : ");
        String workingday = input.next();

        trainer[i] = new Trainer(phone, age, id, adress, workingday, name);
        if (trainer[i].id < 3) {
            trainer[i].Class = 1;
        } else if (trainer[i].id < 5) {
            trainer[i].Class = 2;
        } else if (trainer[i].id < 7) {
            trainer[i].Class = 3;
        }
        id++;

        i++;

    }

    public void remove_Trainer() {
        System.out.println("Enter the index of the Trainer you want to  remove : ");
        int index = input.nextInt();
        if (i > 0) {
            if (index < i) {
                trainer[index].Working_day = " ";
                trainer[index].age = 0;
                trainer[index].id = 0;
                trainer[index].name = " ";
                trainer[index].phone_num = 0;
                trainer[index].Class = 0;
                trainer[index].Adress = " ";
                System.out.println("The Trainer has been removed");
            } else {
                System.out.println("The Trainer of that index is not added yet");
            }
        } else {
            System.out.println("no one added");
        }

    }

    public void display_Trainer() {
        if (i > 0) {
            for (int j = 0; j < i; j++) {
                trainer[j].display();
            }
        } else {
            System.out.println("no one added");
        }
    }

    public void Checkavailiability() {
        System.out.println("Enter Trainer Working day:");

        String Workingday = input.next();

        if (i > 0) {
            for (int j = 0; j < i; j++) {
                if (trainer[j].Working_day.equals(Workingday)) {
                    trainer[j].display();
                }

            }
        } else {
            System.out.println("No Trainers are Available");
        }

    }
}
