public class Shapes {
private String shapeColor;

    public double calcArea() {
        return 0;
    }
    public Shapes(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ ", color is " + shapeColor;
    }
}
