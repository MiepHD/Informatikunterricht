
/**
 * Beschreiben Sie hier die Klasse Viereck.
 * 
 * @author Lia 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Quadrilateral {
    public Point A;
    public Point B;
    public Point C;
    public Point D;
    
    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    
    public Quadrilateral() {
        this.A = new Point(0, 0);
        this.B = new Point(1, 0);
        this.C = new Point(1, 1);
        this.D = new Point(0, 1);
    }
    
    public double getPerimeter() {
        Point[] points = {this.A, this.B, this.C, this.D, this.A};
        double laenge = 0;
        for (int i = 0; i < points.length - 1; i++) {
            laenge = coordinateSystem.calcDistance(points[i], points[i + 1]) + laenge;
        }
        return laenge;
    }
    
    public double getArea() {
        return coordinateSystem.calcTriangle(this.A, this.B, this.D) + coordinateSystem.calcTriangle(this.B, this.C, this.D);
    }
}
