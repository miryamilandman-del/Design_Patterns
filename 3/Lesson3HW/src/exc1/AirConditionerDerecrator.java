package exc1;

public class AirConditionerDerecrator extends  RoomDerecrator{
    public AirConditionerDerecrator(Room name) {
        super(name);
        System.out.println("Air conditioner added successfully☁️☁️☁️");
    }

    @Override
    public double GetPrice() {
        return Name.GetPrice()+200;
    }
}
