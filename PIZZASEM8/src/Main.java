import base.Pizza;
import base.Topping;
import especialidades.PizzaHawaina;
import especialidades.PizzaItaliana;
import especialidades.PizzaMargarita;
import especialidades.PizzaPepperoni;

public class Main {
    public static void main(String[] args) {

        PizzaItaliana pizza = new PizzaItaliana( "Pizza Italiana",100,"medium", "Tous Isl");
        pizza.addTopping(new Topping("Tomato"));
        pizza.addTopping(new Topping("Mozzarella"));
        pizza.addTopping(new Topping("Champinon"));
        pizza.prepare();
        double precio=pizza.calculatePrice();
        System.out.println("El precio de la piza es "+precio);

        PizzaHawaina pizza2 = new PizzaHawaina( "Pizza Hawaina",200,"small", "tapenade");
        pizza2.addTopping(new Topping("Tomato"));
        pizza2.addTopping(new Topping("Mozzarella"));
        pizza2.addTopping(new Topping("Champinon"));
        pizza2.prepare();
        double precio2=pizza2.calculatePrice();
        System.out.println("El precio de la piza es "+precio2);


        PizzaMargarita pizza3 = new PizzaMargarita( "Pizza Margarita",300,"large", "Fermento");
        pizza3.addTopping(new Topping("Tomato"));
        pizza3.addTopping(new Topping("Mozzarella"));
        pizza3.addTopping(new Topping("Champinon"));
        pizza3.prepare();
        double precio3=pizza3.calculatePrice();
        System.out.println("El precio de la piza es "+precio3);

        PizzaPepperoni pizza4 = new PizzaPepperoni( "Pizza Pepperoni",100,"medium", "Chia");
        pizza4.addTopping(new Topping("Tomato"));
        pizza4.addTopping(new Topping("Mozzarella"));
        pizza4.addTopping(new Topping("Champinon"));
        pizza4.prepare();
        double precio4=pizza4.calculatePrice();
        System.out.println("El precio de la piza es "+precio4);

    }
}