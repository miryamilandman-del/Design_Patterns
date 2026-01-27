package exc1;

public class BasicRoom implements Room{

    public BasicRoom(){
        System.out.println("Decorator.BasicRoom made successfully 🏠🏠🏠🏠");
    }
    @Override
    public double GetPrice() {
        return 1000;
    }
}
