
/**
 * Beschreiben Sie hier die Klasse Rechteck.
 * 
 * @author Lia
 * @version 0.0001
 */
public class Rectangle {
    public Point pivot;
    public double rotation;
    public double width;
    public double height;
    /**
     * Konstruktor für Objekte der Klasse Rechteck
     */
    public Rectangle(Point pivot, double rotation, double width, double height){
        this.pivot = pivot;
        this.rotation = rotation;
        this.width = width;
        this.height = height;
    }
    
    public double getArea(){
        return this.width * this.height;
    }
    
    public double getDiagonal() {
        return Math.sqrt(Math.pow(this.width, 2.0) + Math.pow(this.height, 2.0));
    }
    
    public double getPerimeter(){
        return this.width * 2 + this.height * 2;
    }
}
