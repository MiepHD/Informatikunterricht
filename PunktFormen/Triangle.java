
/**
 * Beschreiben Sie hier die Klasse Dreieck.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Triangle
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    public Point A;
    public Point B;
    public Point C;

    /**
     * Konstruktor für Objekte der Klasse Dreieck
     */
    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public double getPerimeter() {
        return coordinateSystem.calcDistance(this.A, this.B) + coordinateSystem.calcDistance(this.B, this.C) + coordinateSystem.calcDistance(this.C, this.A);
    }
    
    public double getArea() {
        return (coordinateSystem.calcDistance(this.A, this.B) * coordinateSystem.calcDistance(this.B, this.C)) / 2;
    }
}
