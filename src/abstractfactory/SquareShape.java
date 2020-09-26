package abstractfactory;

public class SquareShape implements Shape {
    @Override
    public void draw() {
        System.out.println("内部实现画正方形 draw method");
    }
}
