package especialidades;

import base.Pizza;
import base.Topping;

public class PizzaHawaina extends Pizza{

    private String crema;

    public PizzaHawaina(String name, double price,String tamano, String crema, Topping... toppings){
        super(name, price,tamano, toppings);
        this.crema = crema;
    }

    public String getCrema() {
        return crema;
    }

    public void setCrema(String crema) {
        this.crema = crema;
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
        System.out.println("se ha agregado "+getCrema()+" que es la salsa");
        System.out.println("The Pizza is ready!");
    }
}
