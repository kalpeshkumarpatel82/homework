package carpetCost;

public class Floor {
    double width;
    double length;

    // Constructor with parameters
    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }

    }

    //method to get area
    public double getArea() {
        return this.length * this.width;
    }
}
