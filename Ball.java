public class Ball {
  private String make;
  private String color;

  public Ball(String make, String color) {
    this.make = make;
    this.color = color;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Ball copy() {
    return new Ball(make, color);
  }
}