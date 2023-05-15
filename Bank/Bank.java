public class Bank {
    public static void main(String[] args) {
        Bank wayerkart = new Bank();
        
        Adresse adresse1 = new Adresse("Sonnenring", 17, 12346, "Sonnhausen");
        Konto konto1 = new Konto(433652, 27.45, 4711);
        Kunde kunde1 = new Kunde("Dampf", "Hans", adresse1, konto1);
        
        Adresse adresse2 = new Adresse("Vulkan", 1, 66666, "Mordor");
        Konto konto2 = new Konto(1, 10000000.00, 6666);
        Kunde kunde2 = new Kunde("Sauron", "", adresse2, konto2);
        
        //Startkontostände
        System.out.println("Aktueller Kontostand Hans Dampf: " + String.format("%.2f", kunde1.getPrivatkonto().getKontostand()) + "€");
        System.out.println("Aktueller Kontostand Sauron: " + String.format("%.2f", kunde2.getPrivatkonto().getKontostand()) + "€");
        
        //Lohneinzahlung bei Hans Dampf
        kunde1.geldEinzahlen(433652, 827.17);
        System.out.println("Aktueller Kontostand Hans Dampf: " + String.format("%.2f", kunde1.getPrivatkonto().getKontostand()) + "€");
        
        //Zahlung an der Supermarktkasse via EC-Karte von Hans Dampf
        kunde1.geldAbheben(433652, 4711, 128.64);
        System.out.println("Aktueller Kontostand Hans Dampf: " + String.format("%.2f", kunde1.getPrivatkonto().getKontostand()) + "€");
        
        //Schutzgeldzahlung von Hans Dampf an Sauron
        wayerkart.geldUeberweisen(konto1, konto2, 500.02);
        System.out.println("Aktueller Kontostand Hans Dampf: " + String.format("%.2f", kunde1.getPrivatkonto().getKontostand()) + "€");
        System.out.println("Aktueller Kontostand Sauron: " + String.format("%.2f", kunde2.getPrivatkonto().getKontostand()) + "€");
    
        //Versuch eine rechtswidrigen Überweisung
        wayerkart.geldUeberweisen(konto2, konto1, -1000);   //Wer wird hier angezeigt?
    }
    
    //Geld von einem Konto auf das andere überweisen
    public void geldUeberweisen(Konto kontoA, Konto kontoB, double betrag) {
        if (betrag > 0) {
            kontoA.setKontostand(kontoA.getKontostand() - betrag);
            kontoB.setKontostand(kontoB.getKontostand() + betrag);
        } else {
            System.out.println("Anzeige ist raus!");
        }
    }
}