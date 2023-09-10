package especialidades;

import base.Pizza;
import base.Topping;

public class PizzaMargarita extends Pizza{

    private String fermento;

    public PizzaMargarita(String name, double price, String tam, String fermento, Topping... toppings) {
        super(name, price, tam, toppings);
        this.fermento = fermento;
    }

    public String getFermento() {
        return fermento;
    }

    public void setFermento(String fermento) {
        this.fermento = fermento;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing..... " + getName());
        System.out.println("Adding toppings:");
        for (Topping topping : getToppings()) {
            System.out.println("- " + topping.getNombre());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("se ha agregado "+fermento+" que es el fermento");
        System.out.println("The Pizza is ready!");
    }
}
