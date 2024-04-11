package Constructor;

public class Pizza {
    //overloaded constructor: multiple constructor within the class with the same name , but have differnt parameters
//name+parameters=signature
    String bread;
    String topping;
    String flavour;
    double price;

    Pizza(String bread, String toppings, String flavour, double price) {
        this.bread = bread;
        this.topping = toppings;
        this.flavour = flavour;
        this.price = price;


    }
    Pizza(String bread, String toppings, String flavour) {
        this.bread = bread;
        this.topping = toppings;
        this.flavour = flavour;
    }
    Pizza(String bread, String toppings) {
        this.bread = bread;
        this.topping = toppings;
    }
    Pizza(String bread) {
        this.bread = bread;
    }

}


//This is overloaded constructor whihch have same name but different parameters
