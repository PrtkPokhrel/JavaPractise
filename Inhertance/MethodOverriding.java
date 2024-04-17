package Inhertance;

public class MethodOverriding {
    public static void main(String[] args) {
//method overriding: declaring a method in subclass which is already present in parent class.
//        done so that a child class can give its own implementation
        Animals animal=new Animals();
        Dog dog =new Dog();
        dog.speak();
        animal.speak();
    }
}

class Animals {
public void speak(){
    System.out.println("I'm speaking");
}
}

class Dog  extends Animals{
    @Override
 public void speak(){
     System.out.println("Dogs cannot speak");

 }
 

}