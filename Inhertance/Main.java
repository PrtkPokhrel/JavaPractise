package Inhertance;

public class Main {

    public static void main(String[] args) {
        //Inheritance: the process where one class acquires the attribute and methods of another class
        Car mycar=new Car();
        Bicycle cycle=new Bicycle();

        mycar.start();
        cycle.stop();
        System.out.println(mycar.speed);
        System.out.println(cycle.speed);
        System.out.println("There are "+ mycar.seat +" number of seats in car");
        System.out.println("There are "+ cycle.seat+ " number of seats in bicycle");


    }
}
