package especialidades;

import base.Pizza;
import base.Topping;

public class PizzaItaliana extends Pizza {

    private String salsa;

    public PizzaItaliana(String name, double price,String tamano, String Salsa, Topping... toppings){
        super(name, price,tamano, toppings);
        this.salsa = Salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
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
        System.out.println("se ha agregado "+getSalsa()+" que es la salsa");
        System.out.println("The Pizza is ready!");
    }
}
