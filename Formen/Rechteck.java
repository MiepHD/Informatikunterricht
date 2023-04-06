
/**
 * Beschreiben Sie hier die Klasse Rechteck.
 * 
 * @author JonasD, Lia
 * @version 0.0001
 */
public class Rechteck{
    private int laenge;
    private int breite;
    private String farbe;
    /**
     * Konstruktor für Objekte der Klasse Rechteck
     */
    public Rechteck(int laenge, int breite, String farbe){
        this.laenge = laenge;
        this.breite = breite;
        this.farbe = farbe;
    }
    
    public int getFlaecheninhalt(){
        return this.laenge * this.breite;
    }
    
    public double getDiagonale() {
        return Math.sqrt(Math.pow(this.laenge, 2.0) + Math.pow(this.breite, 2.0));
    }
    
    public int getUmfang(){
        return this.laenge * 2 + this.breite * 2;
    }
    
    public int getLaenge(){
        return this.laenge;
    }
    
    public int getBreite(){
        return this.breite;
    }

    
    public void setLaenge(int laenge){
        this.laenge = laenge;
        return;
    }
    
    public void setBreite(int breite){
        this.breite = breite;
        return;
    }
    
    public void setFarbe(String farbe){
        this.farbe = farbe;
        return;
    }
}
