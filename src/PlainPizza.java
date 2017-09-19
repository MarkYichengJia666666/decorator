
public class PlainPizza implements Pizzas{

    public PlainPizza(){
        System.out.println("add Dough");
    }
    @Override
    public String getDesp() {
        return "thin Dough";
    }

    @Override
    public double getCost() {
        return 4.00;
    }
}
