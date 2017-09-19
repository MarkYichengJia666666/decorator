/**
 * Created by zjx_pc on 2/27/2017.
 */
public class PizzaMaker {
    public static void main(String[] args){
        Pizzas piz = new TomatoPizaa(new MPizza(new PlainPizza()));

        System.out.println("ingredient "+piz.getDesp());
        System.out.println("ingredient "+piz.getCost());
    }
}
