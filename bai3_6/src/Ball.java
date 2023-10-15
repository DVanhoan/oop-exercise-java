public class Ball {
    private float x;
    private float y;
    private int xDelta;
    private int yDelta;
    private int radius;

    public Ball(float x, float y, int radius, double speed, double direction) {
        this.x = x;
        this.y = y;
        double radians = Math.toRadians(direction);
        this.xDelta = (int) Math.round(speed * Math.cos(radians));
        this.yDelta = (int) Math.round(-speed * Math.sin(radians));
        this.radius = radius;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getxDelta() {
        return xDelta;
    }

    public void setxDelta(int xDelta) {
        this.xDelta = xDelta;
    }

    public int getyDelta() {
        return yDelta;
    }

    public void setyDelta(int yDelta) {
        this.yDelta = yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball at ("+x+", "+y+")of velocity ("+xDelta+", "+yDelta+")";
    }
}

