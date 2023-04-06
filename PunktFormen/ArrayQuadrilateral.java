
/**
 * Beschreiben Sie hier die Klasse Viereck.
 * 
 * @author Lia 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ArrayQuadrilateral
{
    public double[] A = new double[2];
    public double[] B = new double[2];
    public double[] C = new double[2];
    public double[] D = new double[2];
    
    public ArrayQuadrilateral(double[] A, double[] B, double[] C, double[] D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }
    public ArrayQuadrilateral() {
        this(new double[] {0, 0}, new double[] {1, 0}, new double[] {1, 1}, new double[] {0, 1});
    }
    public double getPerimeter() {
        double[][] Punkte = {this.A, this.B, this.C, this.D, this.A};
        double laenge = 0;
        for (int i = 0; i < Punkte.length - 1; i++) {
            laenge = coordinateSystem.calcDistance(Punkte[i], Punkte[i + 1]) + laenge;
        }
        return laenge;
    }
    public double getArea() {
        return coordinateSystem.calcTriangle(this.A, this.B, this.D) + coordinateSystem.calcTriangle(this.B, this.C, this.D);
    }
}
