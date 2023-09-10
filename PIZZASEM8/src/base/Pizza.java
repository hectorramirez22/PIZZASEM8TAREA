package base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    private String name;
    private double price;

    private String tamanio;
    private List<Topping> toppings = new ArrayList<>();


    public Pizza(String name, double price,String tam, Topping... toppings) {
        this.name = name;
        this.tamanio=tam;
        this.price=price;
        Collections.addAll(this.toppings, toppings);

        }


    public double calculatePrice() {
        double total=this.price;
         // Comenzamos con el precio base de la pizza

        // Sumamos el precio de cada topping
        for (Topping topping : toppings) {
            total += topping.getPrice();
        }

        if(this.tamanio.equals("small")){
            total=total;
        }else if(this.tamanio.equals("medium")){
            total=total+(total*0.2);
        }else if(this.tamanio.equals("large")){
            total=total+(total*0.35);
        }

        return total;
    }

    public void addTopping(Topping topping) {
//        this.toppings.add(topping);
        toppings.add(topping);

    }

    public void removeTopping(int index) {
        if (index >= 0 && index < toppings.size())
            toppings.remove(index);
    }

    public List<Topping> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    public String getName() {
        return name;
    }




    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", price=" + price + ", toppings=" + toppings + '}';
    }

    public void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
    }
}
