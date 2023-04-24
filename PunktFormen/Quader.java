
/**
 * Ein Quader
 * 
 * @author Lia
 * @version 28.02.2023
 */
public class Quader {
    public Point pivot;
    public double width;
    public double height;
    public double depth;

    //1.Constructor
    Quader (double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.depth = length;
    }

    //2.Getter
    public double[] getLHT() {
        double[] lht = {this.width, this.height, this.depth};
        return lht;
    }
    public double getDurchmesser() {
        return Math.sqrt(Math.pow(this.width, 2) + Math.pow(this.height, 2) + Math.pow(this.depth, 2));
    }
    
    public double getGrundflaeche() {
        return this.width * this.depth;
    }
    
    public double getMantelflaeche() {
        return this.width * this.height * 2 + this.height * this.depth * 2;
    }
    
    public double getOberflaeche() {
        return this.getGrundflaeche() * 2 + this.getMantelflaeche();
    }
    
    //Alle Kanten am Quader
    public double getUmfang() {
        return 4 * (this.width + this.height + this.depth);
    }

    public double getUmfangGrundflaeche () {
        return this.width * 2 + this.height * 2;
    }

    public double getVolumen() {
        return this.height * this.getGrundflaeche();
    }

    //3.Setter
    /**
     * Eigenschaften: Verlängert alle Längen so, dass die gesetzte Diagonale erreicht wird. Dabei werden die Proportionen zwischen den Längen beibehalten.
     * Ablauf: Berechnet aus das Verhältnis und wendet dieses auf die anderen Längen an.
     */
    public void setDurchmesser(double durchmesser) {
        scale(durchmesser / this.getDurchmesser());
    }
    
    //Verlängert laenge und tiefe so, dass der gesetzte Umfang der Grundfläche entsteht. Dabei werden die Proportionen zwischen den Längen beibehalten.
    public void setGrundflaeche(double grundflaeche) {
        setGrundflaeche(grundflaeche, false);
    }
    
    /**
     * True: Verlängert alle Längen so, dass der gesetzte Umfang der Grundfläche entsteht. Dabei werden die Proportionen zwischen den Längen beibehalten.
     * False: Verlängert laenge und tiefe so, dass der gesetzte Umfang der Grundfläche entsteht. Dabei werden die Proportionen zwischen den Längen beibehalten.
     */
    public void setGrundflaeche (double grundflaeche, boolean all) {
        String axes = "laenge, tiefe";
        if (all) axes.concat("hoehe");
        scale(Math.sqrt(grundflaeche / this.getGrundflaeche()), axes);
    }
    
    public void setMantelflaeche(double mantelflaeche) {
        scale(Math.sqrt(mantelflaeche / this.getMantelflaeche()));
    }
    
    //Verlängert alle Längen so, dass die gesetzte Oberfläche erreicht wird. Dabei werden die Proportionen zwischen den Längen beibehalten.
    public void setOberflaeche(double oberflaeche) {
        scale(Math.sqrt(oberflaeche / this.getOberflaeche()));
    }
    
    //Verlängert alle Längen so, dass der gesetzte Umfang erreicht wird. Dabei werden die Proportionen zwischen den Längen beibehalten.
    public void setUmfang(double umfang) {
        scale(umfang / this.getUmfang());
    }
    
    //Verlängert laenge und tiefe so, dass der gesetzte Umfang der Grundfläche entsteht. Dabei werden die Proportionen zwischen den Längen beibehalten.
    public void setUmfangGrundflaeche (double umfang) {
        setUmfangGrundflaeche(umfang, false);
    }
    
    /**
     * True: Verlängert alle Längen so, dass der gesetzte Umfang der Grundfläche entsteht. Dabei werden die Proportionen zwischen den Längen beibehalten.
     * False: Verlängert laenge und tiefe so, dass der gesetzte Umfang der Grundfläche entsteht. Dabei werden die Proportionen zwischen den Längen beibehalten.
     */
    public void setUmfangGrundflaeche (double umfang, boolean all) {
        String axes = "laenge, tiefe";
        if (all) axes.concat("hoehe");
        scale(umfang / this.getUmfangGrundflaeche(), axes);
    }
    
    /**
     * Eigenschaften: Verlängert alle Längen so, dass das gesetzte Volumen erreicht wird. Dabei werden die Proportionen zwischen den Längen beibehalten.
     * Ablauf: Zieht dritte Wurzel aus (Zielvolumen durch DerzeitigesVolumen), um den Faktor zu erhalten, mit dem jede Seite multipliziert wird.
     */
    public void setVolumen(double volumen) {
        scale(Math.pow(volumen / this.getVolumen(), 1.0 / 3.0));
    }
    
    //4.Andere Methoden
    public void scale(double k) {
        scale(k, "hoehe, laenge, tiefe");
    }
    
    public void scale(double k, String options) {
        if (options.contains("hoehe")) this.height = this.height * k;
        if (options.contains("laenge")) this.width = this.width * k;
        if (options.contains("tiefe")) this.depth = this.depth * k;
    }
}
