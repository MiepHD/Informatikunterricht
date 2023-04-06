
/**
 * Beschreiben Sie hier die Klasse Dreieck.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Dreieck
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private double x;
    private double y;
    private double laenge;
    private String farbe;

    /**
     * Konstruktor für Objekte der Klasse Dreieck
     */
    public Dreieck(double x, double y, double laenge, String farbe) {
        this.x = x;
        this.y = y;
        this.laenge = laenge;
        this.farbe = farbe;
    }

    public double getUmfang() {
        double links = Math.sqrt(this.x * 2 + this.y * 2);
        double rechts = Math.sqrt(Math.pow((this.x + this.laenge), 2.0) + this.y * 2);
        return links + rechts + this.laenge;
    }
    
    public double getFlaecheninhalt() {
        return (this.laenge * this.y) / 2;
    }
}
