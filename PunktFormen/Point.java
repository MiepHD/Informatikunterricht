
/**
 * Beschreiben Sie hier die Klasse Punkt.
 * 
 * @author Lia
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(double[] array) {
        this.x = array[0];
        this.y = array[1];
    }
    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
}
