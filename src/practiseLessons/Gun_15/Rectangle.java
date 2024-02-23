package practiseLessons.Gun_15;

public class Rectangle implements Shape {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculorArea() {
        return lenght * width;
    }
}
