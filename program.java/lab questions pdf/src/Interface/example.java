package Interface;

public class example {
}
interface Drawable{
    void draw();
}
class circle implements Drawable{
    int radius;
    circle(int radius){
        this.radius=radius;
    }
    public void draw(){
        System.out.println("drawing circle with radius"+radius);
    }
}
//class Rectangle
