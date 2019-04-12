
public abstract class Shape {

    ShapeType shapeType;
    ColorType colorType;

    public Shape(ShapeType shapeType, ColorType colorType) {
        this.colorType = colorType;
        this.shapeType = shapeType;
    }

    abstract void draw();

}
