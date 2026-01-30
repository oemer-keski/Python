public class Main_Computer {

   public  static void main(String[] args) {
        Computer computer1  = new Computer("Keski_Acer", 256, 1234567889, "rot" );
        Computer computer2 = new Computer("Josip", 300, 456785412, "grün"  );
        Computer computerMassimo = new Computer("Massimo", 128, 123454678, "gelb" );
        Computer computerRadikal = new Computer("ismail", 456123789);

        computer1.zeigeDetails();
        computerMassimo.zeigeDetails();
        computer2.zeigeDetails();

        computerMassimo.speicherHinzufuegen(122);
        computerMassimo.zeigeDetails();

        computer2.speicherEntfernen(780);
        computer2.zeigeDetails();

        System.out.println("Der Besitzer von Computer 1 : " + computer1.getBesitzer());

        System.out.println("Die Speicherplatz von Computer 2: "+ computer2.getBesitzer()  + " hat " + computer2.getSpeicherplatz() + " GB.");


        computer2.setNamenVeraendern("CHOBAN");
        System.out.println("Der Besitzer von Computer 2 : " + computer2.getBesitzer());


        computerMassimo.setSpeicherplatz(255);
        System.out.println("Massimo hat nur: " + computerMassimo.getSpeicherplatz() + " GB.");


        computer1.installiereProgramm("Bakterie", -100);
        System.out.println("Computer 1 hat nur : " + computer1.getSpeicherplatz() + " GB.");










   }
}





