public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public  void creatPizzaWithToppings(){
        builder.setNumOfSlice(8);
        builder.setSize(40);
        builder.settoppings("🧅");
    }

    public  void  creatPizzaWithOutToppings(){
        builder.setSize(8.5);
       builder.setNumOfSlice(2);
    }
}
