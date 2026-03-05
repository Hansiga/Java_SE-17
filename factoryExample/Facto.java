package factoryExample;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class ShapeFactory {

    public static Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}

public class Facto {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        shape1.draw(); 

        
        Shape shape2 = ShapeFactory.getShape("square");
        shape2.draw();

        
        Shape shape3 = ShapeFactory.getShape("triangle");
        if (shape3 != null) {
            shape3.draw();
        } else {
            System.out.println("Unknown shape type!");
        }
    }
}