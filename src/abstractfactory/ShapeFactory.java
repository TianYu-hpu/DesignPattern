package abstractfactory;

public class ShapeFactory extends AbstractFactory {


    @Override
    public Color getColor(String colod) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        switch(shapeType) {
            case "circle":
                return new CircleShape();
            case "rectangle":
                return new RectangleShape();
            case "square":
                return new SquareShape();
            default:
                return null;
        }
    }

}
