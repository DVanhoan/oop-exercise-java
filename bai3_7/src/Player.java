

public class Player{
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.x = x;
        this.y = y;
        this.number = number;

    }
    public void move(float xDisp, float yDisp){
        x += xDisp;
        y += yDisp;

    }
    public void jump(float zDisp){
        this.z = zDisp;

    }
    public boolean near(Ball ball){
        float distance = (float) Math.sqrt(x*x+y*y);
        if (distance < 8){
            return true;
        }
        return false;


    }
    public void kick(Ball ball){
        float distance = (float) Math.sqrt(x*x+y*y);
        if (distance != 0){
            System.out.println("kick");
        }
        else {
            System.out.println("kick again");
        }
    }
}
