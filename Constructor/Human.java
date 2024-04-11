package Constructor;

public class Human {
    String name;
    int age;
    double weight;

    Human(String name, int age, double weight) {
        //This is the human constructor;
        this.name = name;
        this.weight = weight;
        this.age = age;

    }
    public void eat(){
        System.out.println(this.name+" is eating");

    }
    public void sleep(){
        System.out.println(this.name+" is sleeping");
    }

}

// Why we need constructor?
//because we have written in previous code that we can only use the same value the class provide for different objects.
// For example car object in Practise1 package. So for different value for different object we use constructor

//Construtor allow us to use different attribute to the object from same class

