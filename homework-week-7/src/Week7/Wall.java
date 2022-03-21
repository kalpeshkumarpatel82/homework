package Week7;

public class Wall {
    double width; //Instance variable
    double height;//Instance variable

    //main method
    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }

    //Constructor without any parameters (no-arg constructor)
    public Wall() {

    }

    //Constructor with parameters
    public Wall(double width, double height) {
        if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else if (width < 0 && height > 0) {
            this.width = 0.0;
            this.height = height;
        } else if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }

    }

    //Defining an instance method
    public double getWidth() {
        return width;
    }

    //Defining an instance method
    public double getHeight() {
        return height;
    }

    //Defining an instance method
    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    //Defining an instance method
    public void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    //Defining an instance method
    public double getArea() {
        return this.width * this.height;
    }
}

