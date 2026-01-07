public class PizzaBuilder implements Builder {
    Pizza pizza=new Pizza();
    @Override
    public void setSize(double size) {
        pizza.setSize(size);
    }

    @Override
    public void setNumOfSlice(int numOfSlice) {
        pizza.setNumOfSlice(numOfSlice);
    }

    @Override
    public void settoppings(String toppings) {
        pizza.setToppings(toppings);
    }

    public Pizza getResult() {
        return pizza;
    }
}
