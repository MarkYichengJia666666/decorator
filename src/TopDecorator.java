
public abstract class TopDecorator implements Pizzas {
    protected Pizzas tempPizza;
    public TopDecorator(Pizzas pizza){
        tempPizza = pizza;
    }

    public String getDesp() {
        return tempPizza.getDesp();
    }

    public double getCost() {
        return tempPizza.getCost();
    }
}
