package lesson6.task2;

import java.text.DecimalFormat;

public class Rectangle implements Shapeinterface {
    private double length;
    private double width;
    private DecimalFormat df = new DecimalFormat("#.##");

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculationPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculationArea() {
        return length * width;
    }

    @Override
    public void displayInfo() {
        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + df.format(calculationPerimeter()));
        System.out.println("Площадь: " + df.format(calculationArea()));
    }
}
