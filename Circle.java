
public class Circle extends Shape {

    public Circle(ColorType colorType) {
        super(ShapeType.Circle, colorType);
        this.draw();
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with " + this.colorType + " color.");
    }

}