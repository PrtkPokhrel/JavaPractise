package Practise1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();

//    String usrInput;

        Scanner sc = new Scanner(System.in);
        System.out.println("Your car name is:"+car.carName);
        System.out.println("Your car model is: "+ car.backName);
        System.out.println("Your car just: "+car.start());
        System.out.println("Your car just: "+car.brake());
        System.out.println("Your car just: "+car.repair());

        System.out.println();

        System.out.println("Your car name is: "+ car2.carName);
        System.out.println("Your car model is: "+ car2.backName);
        System.out.println("Your car just: "+car2.start());
        System.out.println("Your car just: "+car2.brake());
        System.out.println("Your car just: "+car2.repair());

        //    System.out.println(car);
//    System.out.print("Enter anything: ");
//    usrInput=sc.nextLine();
//    System.out.println(usrInput);


        sc.close();










    }

}
