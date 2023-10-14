public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle();

        System.out.println("circle has radius of " + c1.getRadius() + " and area " + c1.getArea());

        Circle c2 = new Circle(2.0);
        System.out.println("circle has radius of " + c2.getRadius() + " and area " + c2.getArea());
    }
}