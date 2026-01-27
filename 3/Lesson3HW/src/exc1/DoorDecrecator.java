package exc1;

public class DoorDecrecator extends RoomDerecrator{
    public DoorDecrecator(Room name) {
        super(name);
        System.out.println("Steel door added successfully🚪🚪🚪");
    }

    @Override
    public double GetPrice() {
        return Name.GetPrice()+95;
    }
}
