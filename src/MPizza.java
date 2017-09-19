/**
 * Created by zjx_pc on 2/27/2017.
 */
public class MPizza extends TopDecorator {

    public MPizza(Pizzas pizza) {
        super(pizza);


        System.out.println("add M ");

    }
    public String getDesp() {
        return tempPizza.getDesp()+ " M";
    }

    public double getCost() {
        return tempPizza.getCost()+1.00;
    }
}
