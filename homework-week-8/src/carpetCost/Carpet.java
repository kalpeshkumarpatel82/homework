package carpetCost;

public class Carpet {
    double cost;

    // Constructor with parameters
    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    //method to get cost
    public double getCost() {
        return this.cost;
    }
}
