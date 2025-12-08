package tests.richtig.f2kategorie;

public class Geometry {

      // Name und Typ passen semantisch perfekt zusammen
      private Point center;

      public Geometry(Point center) {
            this.center = center;
      }

      public Point getCenter() {
            return center;
      }

      public void setCenter(Point center) {
            this.center = center;
      }
}
