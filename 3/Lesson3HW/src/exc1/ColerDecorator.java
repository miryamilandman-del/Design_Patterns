package exc1;

public class ColerDecorator extends RoomDerecrator{
    public ColerDecorator(Room name) {
        super(name);
        System.out.println("Color added successfully 🎨🎨");
    }

    @Override
    public double GetPrice() {
        return Name.GetPrice()+80;
    }
}
