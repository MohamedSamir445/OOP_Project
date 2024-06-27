package oop;

import java.util.*;

public class MemberPage {

    MemberList m = new MemberList();

    public void Member_info() {
        Scanner n = new Scanner(System.in);

        int x, y;
        char choice = 'y';
        while (choice == 'y' || choice == 'Y') {

            System.out.println("1.add new member");
            System.out.println("2.remove member");
            System.out.println("3.display");
            x = n.nextInt();
            if (x == 1) {
                m.AddMember();

            } else if (x == 2) {
                m.remove_members();
            } else if (x == 3) {
                System.out.println("1.display all members");
                System.out.println("2.display members under a specific type of membership ");
                System.out.println("3.display members in a specific class");
                y = n.nextInt();
                if (y == 1) {
                    m.display_members();

                } else if (y == 2) {
                    m.displayMembersUnderSpecificTypeOfMembership();
                } else if (y == 3) {
                    m.displayMembersInSpecificClass();
                }
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
