
public class Circle {
    private
    double radius = 1.0;
    void Circle(){
        return;
    }
    float Circle(double radius){
        this.radius = radius;
        return 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference(){
        return radius * 2 * Math.PI;
    }
    public String toString(){
        return "circle[radius=?]";
    }

}
