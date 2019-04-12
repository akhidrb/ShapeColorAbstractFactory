
public class BlueFactory {

    public static Shape drawShape(ShapeType shapeType) {

        switch(shapeType) {
            case Circle:
                return new Circle(ColorType.Blue);
            case Rectangle:
                return new Rectangle(ColorType.Blue);
            default:
                return null;
        }

    }

}