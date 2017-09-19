/**
 * Created by zjx_pc on 2/27/2017.
 */
public class TomatoPizaa extends TopDecorator {
    public TomatoPizaa(Pizzas pizza) {
        super(pizza);

        System.out.println("add Tomato ");

    }
    public String getDesp() {
        return tempPizza.getDesp()+ " Tomato";
    }

    public double getCost() {
        return tempPizza.getCost()+0.50;
    }
}
