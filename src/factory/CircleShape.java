package factory;

public class CircleShape implements Shape {
    @Override
    public void draw() {
        System.out.println("内部实现画圆 draw method");
    }
}
