public class Konto {
    //Attribute (kontonummer, kontostand & pin)
    private int kontonummer;
    private int kontostand;
    private int pin;
    //Konstruktor
    public Konto(int kontonummer, int kontostand, int pin) {
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.pin = pin;
    }
    //Setter
    public void setKontonummer(int k) {
        this.kontonummer = k;
    }
    
    public void setKontostand(int k) {
        this.kontostand = k;
    }
    
    public void setPin(int p) {
        this.pin = p;
    }
    
    //Getter
    
    public int getKontonummer() {
        return this.kontonummer;
    }
    
    public int getKontostand() {
        return this.kontostand;
    }
    
    public int getPin() {
        return this.pin;
    }
    
    //Überschreiben der toString-Methode, damit das Objekt Konto in der Konsole lesbar wird
    @Override
    public String toString() {
        return this.kontonummer + ", " + this.kontostand + ", " + this.pin;
    }
}