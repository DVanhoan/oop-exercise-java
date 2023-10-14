public class Main {
    public static void main(String[] args) {
       MyPoint p = new MyPoint(23,21);
       MyTriangle t = new MyTriangle(3,4,2,5,4,6);

        System.out.println(t.toString());
        System.out.println(p);
        System.out.println("chu vi của tam giác là: " + t.getPrimeter());
        System.out.println("day la " + t.getType());


    }
}