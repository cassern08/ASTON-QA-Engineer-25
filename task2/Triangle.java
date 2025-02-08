package lesson6.task2;

import java.text.DecimalFormat;

public class Triangle implements Shapeinterface {
    private double sideA;
    private double sideB;
    private double sideC;
    private DecimalFormat df = new DecimalFormat("#.##");

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculationPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculationArea() {
        double p = calculationPerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public void displayInfo() {
        System.out.println("Треугольник:");
        System.out.println("Периметр: " + df.format(calculationPerimeter()));
        System.out.println("Площадь: " + df.format(calculationArea()));
    }
}