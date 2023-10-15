public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    public int getX() {
        return x1;
    }

    public void setX1(int x) {
        this.x1 = x;
    }

    public int getY() {
        return y1;
    }

    public void setY1(int y) {
        this.y1 = y;
    }

    public int getWidth() {
        return x2 - x1 +1;
    }

    public int getHeight() {
        return y2- y1 + 1;
    }

    public boolean collidesWith(Ball ball) {
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() - ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            return true;

        }
        return false;
    }
    public String toString(){
        return "Container[("+x1+","+y1+"),"+"("+x2+","+y2+")]";
    }
}
