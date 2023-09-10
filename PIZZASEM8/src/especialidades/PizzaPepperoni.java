package especialidades;

import base.Pizza;
import base.Topping;

public class PizzaPepperoni extends Pizza {
    private String fruto;

    public PizzaPepperoni(String name, double price, String tam, String fruto, Topping... toppings) {
        super(name, price, tam, toppings);
        this.fruto = fruto;
    }

    public String getFruto() {
        return fruto;
    }

    public void setFruto(String fruto) {
        this.fruto = fruto;
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
        System.out.println("se ha agregado "+getFruto()+" que es la salsa");
        System.out.println("The Pizza is ready!");
    }
}
