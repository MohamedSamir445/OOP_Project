
package oop;


public class Member extends Person {

    protected int phone_num;
    protected int age;
    protected int id;
    protected char type;
    protected int Class;

    public Member(String name, int phone_num, int age, int id, char type) {
        super(name);
        this.phone_num = phone_num;
        this.age = age;
        this.id = id;
        this.type = type;
    }
    
    @Override
    public void display() {
        System.out.println("Member number : " + id);
        System.out.println(" Member Name is : " + name);
        System.out.println(" Member phone number is : " + phone_num);
        System.out.println(" Member age is : " + age);
        System.out.println(" Member Type is : " + type);
        System.out.println(" Member Class is : " + Class);
        System.out.println("*******************************************");
        System.out.println("\n");

    }

}
