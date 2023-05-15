public class Adresse {
    //Attribute (strasse, hausnummer, postleitzahl & ort)
    private String strasse;
    private int hausnummer;
    private int postleitzahl;
    private String ort;
    //Konstruktor
    public Adresse(String strasse, int hausnummer, int postleitzahl, String ort) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.ort = ort;
    }
    //Setter
    
    public void setStrasse(String s) {
        this.strasse = s;
    }

    public void setHausnummer(int h) {
        this.hausnummer = h;
    }
    
    public void setPostleitzahl(int p) {
        this.postleitzahl = p;
    }
    
    public void setOrt(String o) {
        this.ort = o;
    }
    //Getter
    
    public String getStrasse() {
        return this.strasse;
    }
    
    public int getHausnummer() {
        return this.hausnummer;
    }
    
    public int getPostleitzahl() {
        return this.postleitzahl;
    }
    
    public String getOrt() {
        return this.ort;
    }
    
    //Überschreiben der toString-Methode, damit das Objekt Adresse in der Konsole lesbar wird
    @Override
    public String toString() {
        return this.strasse + " " + this.hausnummer + ", " + this.postleitzahl + " " + this.ort;
    }
}