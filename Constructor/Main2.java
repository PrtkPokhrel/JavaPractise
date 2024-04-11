package Constructor;

public class Main2 {

    public static void main(String[] args) {
   Pizza pizza =new Pizza("Brown","Chicken","Chilli",500);
   System.out.println("The ingredients of the pizza are:");
   System.out.println(pizza.bread);
   System.out.println(pizza.flavour);
   System.out.println(pizza.topping);
   System.out.println(pizza.price);

   System.out.println("The ingredients of the second pizza are: ");
   Pizza Pizza2 =new Pizza("White","Panner","Salty");
   System.out.println(Pizza2.bread);
   System.out.println(Pizza2.flavour);
   System.out.println(Pizza2.topping);

   System.out.println("The ingredients of the third pizza are: ");
   Pizza pizza3 =new Pizza("Garlic","Mayonnaise");
   System.out.println(pizza3.bread);
   System.out.println(pizza3.topping);


    }
}
