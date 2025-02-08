package lesson6.task2;

public class Result {
    public static void main(String[] args) {
        Shapeinterface[] shapes = {
                new Triangle(10, 15, 20),
                new Circle(15),
                new Rectangle(15, 25)
        };

        for (Shapeinterface shape : shapes) {
            shape.displayInfo();
        }
    }
}