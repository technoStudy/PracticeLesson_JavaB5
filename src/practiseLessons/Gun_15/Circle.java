package practiseLessons.Gun_15;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculorArea() {
        return Math.PI * radius * radius; // pi*r2
    }
}
