package oop;

public class Trainer extends Person {

    public int phone_num;
    public int age;
    public int id;
    public String Adress;
    public String Working_day;
    public int Class;

    public Trainer(int phone_num, int age, int id, String Adress, String Working_day, String name) {
        super(name);
        this.phone_num = phone_num;
        this.age = age;
        this.id = id;
        this.Adress = Adress;
        this.Working_day = Working_day;
    }

    @Override
    public void display() {

        System.out.println("Trainer id : " + id);
        System.out.println(" Trainer Name is : " + name);
        System.out.println(" Trainer phone number is : " + phone_num);
        System.out.println(" Trainer age is : " + age);
        System.out.println(" Trainer Adress is : " + Adress);
        System.out.println(" Trainer Working day is : " + Working_day);
        System.out.println(" Trainer Class is : " + Class);
        System.out.println("*******************************************");
        System.out.println("\n");

    }

}
