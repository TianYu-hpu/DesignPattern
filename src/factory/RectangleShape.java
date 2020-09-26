package factory;

public class RectangleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("内部实现画矩形 draw method");
    }
}
