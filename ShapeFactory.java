
public class ShapeFactory {

    private ShapeFactory() {}

    public static Shape drawShape(ShapeType shapeType, ColorType colorType) {

        switch(colorType) {
            case Blue:
                return BlueFactory.drawShape(shapeType);
            case Red:
                return RedFactory.drawShape(shapeType);
            default:
                return null;
        }

    }


}