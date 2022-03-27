package poolArea;

public class Cuboid extends Rectangle {
    double height;

    //Defining a constructor
    public Cuboid(double width, double length, double height) {
        super(width, length);
        if (height < 0) {
            this.height = 0;
        } else
            this.height = height;

    }

    //    Defining a method to get Height
    public double getHeight() {
        return height;
    }

    //Defining a method to get Height
    public double getVolume() {
        return getArea() * height;
    }
}

