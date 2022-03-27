package poolArea;

public class Rectangle {
    double width;
    double length;

    // defining a constructor
    public Rectangle(double width, double length) {
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

    //Defining a method to get width
    public double getWidth(){
        return width;
    }

    //Defining a method to get length
    public double getLength(){
        return length;
    }

    //Defining a method to get Area
    public double getArea(){
        return width*length;
    }
}
