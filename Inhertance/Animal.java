package Inhertance;

public class Animal {

    Boolean life = true;

    public void breathe() {
        System.out.println("breathe");
    }

    public static void main(String[] args) {

        Cats cats = new Cats();
        Tiger tiger=new Tiger();
        cats.breathe();
        tiger.breathe();
        System.out.println(tiger.paw);

    }
}

class Cats extends Animal {
  int paw=4;
}

class Tiger extends Cats {


}

