package exc1;

public class BedDecorator extends RoomDerecrator{

    public BedDecorator(Room name) {
        super(name);
        System.out.println("Bed added successfully🛏️🛏️🛏️");
    }

    @Override
    public double GetPrice() {
        return Name.GetPrice()+150;
    }
}
