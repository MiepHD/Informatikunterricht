
/**
 * Ein Quader
 * 
 * @author Lia
 * @version 28.02.2023
 */
public class Quader {
    private double laenge;
    private double hoehe;
    private double tiefe;

    //1.Constructor
    Quader (double laenge, double hoehe, double tiefe) {
        this.laenge = laenge;
        this.hoehe = hoehe;
        this.tiefe = tiefe;
    }

    //2.Getter
    public double[] getLHT() {
        double[] lht = {this.laenge, this.hoehe, this.tiefe};
        return lht;
    }
    public double getDurchmesser() {
        return Math.sqrt(Math.pow(this.laenge, 2) + Math.pow(this.hoehe, 2) + Math.pow(this.tiefe, 2));
    }
    
    public double getGrundflaeche() {
        return this.laenge * this.tiefe;
    }
    
    public double getHoehe() {
        return this.hoehe;
    }
    
    public double getLaenge() {
        return this.laenge;
    }

    public double getTiefe() {
        return this.tiefe;
    }
    
    public double getMantelflaeche() {
        return this.laenge * this.hoehe * 2 + this.tiefe * this.hoehe * 2;
    }
    
    public double getOberflaeche() {
        return this.getGrundflaeche() * 2 + this.getMantelflaeche();
    }
    
    //Alle Kanten am Quader
    public double getUmfang() {
        return 4 * (this.laenge + this.hoehe + this.tiefe);
    }

    public double getUmfangGrundflaeche () {
        return this.laenge * 2 + this.tiefe * 2;
    }

    public double getVolumen() {
        return this.hoehe * this.getGrundflaeche();
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
    
    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }
    
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setTiefe(double tiefe) {
        this.tiefe = tiefe;
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
        if (options.contains("hoehe")) this.hoehe = this.hoehe * k;
        if (options.contains("laenge")) this.laenge = this.laenge * k;
        if (options.contains("tiefe")) this.tiefe = this.tiefe * k;
    }
}
