public class Pizza {
    private double size;
    private int numOfSlice;
    private String toppings;

    public Pizza() {

    }
    public Pizza(double size, int numOfSlice, String toppings) {
        this.size = size;
        this.numOfSlice = numOfSlice;
        this.toppings = toppings;
    }
    public Pizza(double size, int numOfSlice) {
        this.size = size;
        this.numOfSlice = numOfSlice;
        this.toppings = null;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getNumOfSlice() {
        return numOfSlice;
    }

    public void setNumOfSlice(int numOfSlice) {
        this.numOfSlice = numOfSlice;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numOfSlice=" + numOfSlice +
                ", toppings='" + toppings + '\'' +
                '}';
    }
}
