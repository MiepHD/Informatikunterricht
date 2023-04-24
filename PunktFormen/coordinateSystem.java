
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
    public static Quadrilateral castToQuadrilateral(Rectangle rectangle) {
        return new Quadrilateral(
            new Point(0, 0),
            new Point(rectangle.width, 0),
            new Point(rectangle.width, rectangle.height),
            new Point(0, rectangle.height)
        );
    }
    
    public static Quadrilateral castToQuadrilateral(ArrayQuadrilateral quadrilateral) {
        return new Quadrilateral(
            new Point(quadrilateral.A),
            new Point(quadrilateral.B),
            new Point(quadrilateral.C),
            new Point(quadrilateral.D)
        );
    }
    
    public static ArrayQuadrilateral castToArrayQuadrilateral(Rectangle rectangle) {
        return new ArrayQuadrilateral(
            new double[] {0, 0},
            new double[] {rectangle.width, 0},
            new double[] {rectangle.width, rectangle.height},
            new double[] {0, rectangle.height}
        );
    }
    
    public static ArrayQuadrilateral castToArrayQuadrilateral(Quadrilateral quadrilateral) {
        return new ArrayQuadrilateral(
            new double[] {quadrilateral.A.getX(), quadrilateral.A.getY()},
            new double[] {quadrilateral.B.getX(), quadrilateral.B.getY()},
            new double[] {quadrilateral.C.getX(), quadrilateral.C.getY()},
            new double[] {quadrilateral.D.getX(), quadrilateral.D.getY()}
        );
    }
}
