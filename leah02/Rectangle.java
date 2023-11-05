public class Rectangle extends Shape{
    Dimension size;
    String color;
    public Rectangle(Dimension position, Dimension size, String color){
        super(position, color);
        this.size = size;   
    }
    @Override
    public boolean equals(Object otherObject) {
        // TODO Auto-generated method stub
        boolean equal = false;

        if (super.equals(otherObject)){
            Shape otherShape = (Shape) otherObject;
            equal = otherShape.color.equals(color);
        }
        return equal;
    }

}
