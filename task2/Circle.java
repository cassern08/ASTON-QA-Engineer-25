package lesson6.task2;

import java.text.DecimalFormat;

public class Circle implements Shapeinterface {
    private double radius;
    private DecimalFormat df = new DecimalFormat("#.##");

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculationPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculationArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void displayInfo() {
        System.out.println("Круг:");
        System.out.println("Периметр: " + df.format(calculationPerimeter()));
        System.out.println("Площадь: " + df.format(calculationArea()));
    }
}