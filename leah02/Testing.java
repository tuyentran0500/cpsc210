public class Testing {
    public static void main(String[] args) {
        Dimension pos1 = new Dimension(1, 2);
        Dimension size1 = new Dimension(2, 3);

        Rectangle rec1 = new Rectangle(pos1, size1, "blue");
        Shape shape1 = new Shape(pos1, "blue");
        System.err.println(shape1.equals(rec1));

    }
}
