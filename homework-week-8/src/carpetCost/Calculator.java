package carpetCost;

public class Calculator {
    Floor floor;
    Carpet carpet;

    // Constructor with parameters
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    // Method to get total cost
    public double getTotalCost() {
        double totalcost;
        totalcost = floor.getArea() * carpet.getCost();
        return totalcost;
    }
}
