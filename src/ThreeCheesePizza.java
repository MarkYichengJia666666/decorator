
public class ThreeCheesePizza extends Pizza{

    @Override
    public void setDescrip(String des) {
        System.out.print("This is Three...Pizza");
    }

    @Override
    public String getDesp() {
        return "M, F, P, Cheese Pizza";
    }

    @Override
    public double cost() {
        return 10.00;
    }

    @Override
    public boolean hasF() {
        return false;
    }
}
