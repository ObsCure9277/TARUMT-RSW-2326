// Demo 7.3: Circle.java

public class Circle{
  private double radius;

  public Circle() {
  }

  public Circle(double radius) {
    this.radius = radius;
  }
  
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getArea() {
    return radius * radius * Math.PI;
  }
  
  public double getDiameter() {
    return 2 * radius;
  }
  
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
}
