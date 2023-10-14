

public class Rectangle {
    private
    float length ;
    float width ;
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getArea(){
        return length * length;
    }
    public double getPerimeter(){
        return (length + width)*2;
    }
    public String toString(){
        return "Rectangle[length="+ length+", width=" + width+"]";
    }

}