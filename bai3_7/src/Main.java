public class Main {
    public static void main(String[] args) {

        Player p = new Player(10, 3,4);
        Ball ball1 = new Ball(3, 4,3);
        Ball ball2 = new Ball(0, 0,7);

        if (ball1.near(ball2)) {
            System.out.println("The balls are near each other.");
        } else {
            System.out.println("The balls are not near each other.");
        }



    }
}