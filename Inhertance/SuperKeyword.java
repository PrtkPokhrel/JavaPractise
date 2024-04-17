package Inhertance;
public class SuperKeyword {
    public static void main(String[] args) {

        Hero hero =new Hero("RDJ",50,"Iron");
        System.out.println(hero.name);
        System.out.println(hero.power);

        Hero hero1 =new Hero("Tobey",25,"Spidey");
        System.out.println(hero1.toString());


    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return this.name+this.age;
    }
}

class Hero extends Person{
    String power;
    Hero(String name,int age,String power){
        super(name,age);
        this.power=power;
    }
    public String toString(){
        return super.toString()+this.power;
    }
}