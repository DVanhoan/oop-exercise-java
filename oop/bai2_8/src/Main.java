
public class Main {
    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(3, 4, 5);
        MyCircle circle2 = new MyCircle(new MyPoint(1, 2), 3);
        MyCircle circle3 = new MyCircle();

        System.out.println("Circle 1:");
        System.out.println("Center: (" + circle1.getCenterX() + "," + circle1.getCenterY() + ")");
        System.out.println("Radius: " + circle1.getRadius());

        circle1.setCenterX(6);
        circle1.setCenterY(8);
        circle1.setRadius(10);
        System.out.println("_________");
        System.out.println("\nAfter modification:");
        System.out.println("Center: (" + circle1.getCenterX() + "," + circle1.getCenterY() + ")");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("_________");
        System.out.println("\nCircle 2: " + circle2.toString());
        System.out.println("_________");
        System.out.println("\nCircle 1 - Area: " + circle1.getArea());
        System.out.println("Circle 1 - Circumference: " + circle1.getCircumference());
        System.out.println("_________");
        System.out.println("\nDistance between Circle 1 and Circle 2: " + circle1.distance(circle2));
    }
}
