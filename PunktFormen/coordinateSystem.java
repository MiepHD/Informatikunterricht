
/**
 * Beschreiben Sie hier die Klasse Koordinatensystem.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class coordinateSystem
{
    public static double calcDistance(Point A, Point B) {
        return Math.sqrt(Math.pow(B.getX() - A.getX(), 2.0) + Math.pow(B.getY() - A.getY(), 2.0));
    }
    public static double calcTriangle(Point A, Point B, Point C) {
        return ((B.getX() - A.getX()) * (C.getY() - A.getY()) - (B.getY() - A.getY()) * (C.getX() - A.getX())) / 2;
    }
    
    public static double calcDistance(double[] A, double[] B) {
        return Math.sqrt(Math.pow(B[0] - A[0], 2.0) + Math.pow(B[1] - A[1], 2.0));
    }
    public static double calcTriangle(double[] A, double[] B, double[] C) {
        return ((B[0] - A[0]) * (C[1] - A[1]) - (B[1] - A[1]) * (C[0] - A[0])) / 2;
    }
}
