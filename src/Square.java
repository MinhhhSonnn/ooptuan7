public class Square extends Rectangle {

  public Square() {

  }

  public Square(double side) {
    super(side, side);
  }

  public Square(double side, String color, boolean filled) {
    super(side, side, color, filled);
  }

  public double getSide() {
    return width;
  }

  public void setSide(double side) {
    setWidth(side);
    setLength(side);
  }

  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    super.setLength(width);
  }

  @Override
  public void setLength(double side) {
    super.setLength(side);
    super.setWidth(width);
  }

  @Override
  public String toString() {
    return "Square[side=" + getSide() + ", color=" + getColor() + ", filled=" + isFilled() + "]";
  }


}
