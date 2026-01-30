public class Computer {

    private String besitzer;
    private int speicherplatz;
    private final int SERIENNUMMER;
    private String farbe;
// Konstruktor
    public Computer ( String batman, int SERIENNUMMER){
        this.besitzer = batman;
        this.speicherplatz = 256;
        this.SERIENNUMMER = SERIENNUMMER;
        this.farbe = "schwarz";

    }

    public Computer( String besitzer, int speicherplatz, int SERIENNUMMER, String farbe){
        this.besitzer = besitzer;
        this.speicherplatz= speicherplatz;
        this.SERIENNUMMER = SERIENNUMMER;
        this.farbe = farbe;
    }
    // Methoden
    public void zeigeDetails(){
        System.out.println("Seriennummer ist: " + SERIENNUMMER );
        System.out.println("Besitzer ist : " + besitzer);
        System.out.println("Speicherplatz ist : " + speicherplatz);
        System.out.println("Die Farbe ist : " + farbe);
    }
    public void speicherHinzufuegen(int gb){
       this.speicherplatz = this.speicherplatz + gb;

    }
    public void speicherEntfernen(int gb){

        if (gb <= 0 ){

            System.out.println("Fehler! Speicherplatz bleibt immer noch gleich" );
        } else if (gb > speicherplatz ) {
            System.out.println("Nicht ausreichent Speicherplatz bleibt gleich.");

        } else{
            this.speicherplatz = this.speicherplatz - gb;
            System.out.println("Speicherplatz ist entfernt.");
        }
        



    }

    // Getter

    public String getBesitzer(){
        return besitzer;
    }
    public int getSpeicherplatz(){
        return speicherplatz;
    }
    public int getSERIENNUMMER(){
        return SERIENNUMMER;
    }
    public String getFarbe(){
        return farbe;

    }

    // Setter

    public void setNamenVeraendern(String eingabe){
     this.besitzer = eingabe;

    }
    public void setSpeicherplatz(int gb){
        this.speicherplatz = gb;
    }



    public boolean installiereProgramm(String Programmname, int datenGB){
        if (datenGB > speicherplatz){
            System.out.println("Fehler 1!: Nicht genug Speicherplatz.");
            return false ;

        }
        else if (datenGB <= 0){
            System.out.println("Fehler 2!: Kann nicht minus sein.");
            return false;

        }
        else{
            System.out.println("Installation erfolgreich!");
            speicherplatz = speicherplatz - datenGB;
            return true;
        }




    }
















}



