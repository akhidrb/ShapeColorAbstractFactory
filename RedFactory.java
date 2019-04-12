
public class RedFactory {

    public static Shape drawShape(ShapeType shapeType) {

        switch(shapeType) {
            case Circle:
                return new Circle(ColorType.Red);
            case Rectangle:
                return new Rectangle(ColorType.Red);
            default:
                return null;
        }

    }

}