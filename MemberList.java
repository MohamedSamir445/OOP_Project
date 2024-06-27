package oop;

import java.util.Scanner;

public class MemberList {

    Scanner input = new Scanner(System.in);
    private Member[] member = new Member[50];
    static int i = 0;
    int id = 1;

    public void AddMember() {

        System.out.print(" Enter member name : ");
        String name = input.next();
        System.out.print(" Enter member age : ");
        int age = input.nextInt();
        System.out.print(" Enter member phone number : ");
        int phone = input.nextInt();
        System.out.print("Enter member type p (Pay as you go) or o (Open membership) or t (Term membership) : ");
        char type = input.next().charAt(0);

        member[i] = new Member(name, phone, age, id, type);
        if (member[i].id < 3) {
            member[i].Class = 1;
        } else if (member[i].id < 5) {
            member[i].Class = 2;
        } else if (member[i].id < 7) {
            member[i].Class = 3;
        }
        id++;

        i++;
    }

    public void remove_members() {
        System.out.println("Enter the index of the member you want to  remove : ");
        int index = input.nextInt();
        if (i > 0) {
            if (index < i) {
                member[index].Class = 0;
                member[index].age = 0;
                member[index].id = 0;
                member[index].name = " ";
                member[index].phone_num = 0;
                member[index].type = 0;
                System.out.println("The member has been removed");
            } else {
                System.out.println("The member of that index is not added yet");
            }
        } else {
            System.out.println("no one added");
        }
    }

    public void display_members() {
        if (i > 0) {
            for (int j = 0; j < i; j++) {
                member[j].display();
            }
        } else {
            System.out.println("no one added");
        }
    }

    public void displayMembersUnderSpecificTypeOfMembership() {
        System.out.println("Enter the type :");
        char type = input.next().charAt(0);
        if (i > 0) {
            for (int j = 0; j < i; j++) {
                if (member[j].type == type) {
                    member[j].display();
                }
            }
        } else {
            System.out.println("no one added");
        }
    }

    public void displayMembersInSpecificClass() {
        System.out.println("Enter the class :");
        int num = input.nextInt();
        if (i > 0) {
            for (int j = 0; j < i; j++) {
                if (member[j].Class == num) {
                    member[j].display();
                }
            }
        } else {
            System.out.println("no one added");
        }
    }
}
