public class Shape {
    Dimension position;
    String color;
    public Shape(Dimension pos, String color){
        position = pos;
        this.color = color;
    }
    @Override
    public boolean equals(Object otherObject){
        boolean equal = false;
        if (otherObject instanceof Shape){
            Shape otherShape = (Shape) otherObject;
            equal = otherShape.position.equals(position);
        }
        return equal;
    }
}
