package Constructor;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("James", 21, 72.5); //Passig the value to the Human method
        Human human1 = new Human("Levinpaul", 58, 141.1); //Passing the value to the Human method

//System.out.println(human.Human());
        System.out.println(human.name);
        System.out.println(human.age);
        System.out.println(human.weight);
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);
        System.out.println();
        human1.eat();
        human.sleep();



    }
}
