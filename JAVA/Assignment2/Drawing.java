abstract class Shape {
  public abstract void draw ();
}
class Line extends Shape{

  public void draw() {
      System.out.println("drawing line");
  }
}
class Rectangle extends Shape{

  public void draw() {
      System.out.println(" drawing rectangle ");

  }

}
class Cubes extends Shape{

  public void draw() {
      System.out.println(" drawing Cubes");

  }
}

public class Drawing {
  public static void main(String[] args) {
      Line line = new Line();
      Rectangle rect = new Rectangle();
      Cubes cube = new Cubes();

      line.draw();
      rect.draw();
      cube.draw();

      }
}
