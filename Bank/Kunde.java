public class Kunde {
    //Attribute (nchname, vorname, privatadresse & privatkonto)
    private String nachname;
    private String vorname;
    private Adresse privatadresse;
    private Konto privatkonto;
    
    //Konstruktor
    public Kunde(String nNachname, String nVorname, Adresse nPrivatadresse, Konto nPrivatkonto) {
        //to do
        this.nachname = nNachname;
        this.vorname = nVorname;
        this.privatadresse = nPrivatadresse;
        this.privatkonto = nPrivatkonto;
    }
    
    //Geld abheben
    public void geldAbheben(int kontonummer, int pin, double betrag) {
        if () { //Überprüfen, dass eingebene kontonummer und pin mit der im Objekt der Klasse Konto übereinstimmen
            //Kontostand ändern
        } else {
            System.out.println("Falsche Eingabe!");
        }
    }
    
    //Geld einzahlen
    public void geldEinzahlen(int kontonummer, double betrag) {
        if () { //Überprüfen, dass eingebene kontonummer mit der im Objekt der Klasse Konto übereinstimmt
            //Kontostand ändern
        } else {
            System.out.println("Falsche Eingabe!");
        }
    }
    
    //Setter
    public void setNachname(String n) {
        this.nachname = n;
    }

    public void setVorname(String v) {
        this.vorname = v;
    }

    public void setPrivatadresse(Adresse a) {
        this.privatadresse = a;
    }
    public void setPrivatkonto(Konto k) {
        this.privatkonto = k;
    }
    //Getter
    public String getNachname() {
        return this.nachname
    }
    public String getVorname () {
        return this.vorname;
    }
    public Adresse getPrivatadresse() {
        return this.privatadresse;
    }
    public Konto getPrivatkonto() {
        return this.privatkonto;
    }
}