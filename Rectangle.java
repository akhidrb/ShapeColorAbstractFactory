
public class Rectangle extends Shape {

    public Rectangle(ColorType colorType) {
        super(ShapeType.Rectangle, colorType);
        this.draw();
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle " + this.colorType + " color.");
    }

}