import java.util.Scanner;
public class Bankautomat {

        // Bankautomat Methoden (Kurzversion)
        public static void showBalance(double balance) {
            System.out.printf("Kontostand: %.2f €\n", balance);
        }

        public static double deposit(Scanner scanner) {
            System.out.print("Einzahlungsbetrag: ");
            double betrag = scanner.nextDouble();
            return (betrag > 0) ? betrag : 0; // Rückgabe nur bei positivem Betrag
        }

        public static double withdraw(Scanner scanner, double balance) {
            System.out.print("Auszahlungsbetrag: ");
            double betrag = scanner.nextDouble();
            if (betrag > 0 && betrag <= balance) {
                return betrag;
            } else {
                System.out.println("Fehler: Ungültiger Betrag oder nicht genug Guthaben.");
                return 0;
            }
        }

        public static void main(String[] args) {
            double balance = 10.00;
            Scanner scanner = new Scanner(System.in);
            boolean running = true;

            while (running) {
                System.out.println("\n1. Kontostand | 2. Einzahlen | 3. Abheben | 4. Exit");
                System.out.print("Wahl: ");

                if (!scanner.hasNextInt()) {
                    scanner.next(); // Ungültige Eingabe verwerfen
                    continue;
                }
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1: showBalance(balance); break;
                    case 2: balance += deposit(scanner); break;
                    case 3: balance -= withdraw(scanner, balance); break;
                    case 4: running = false; break;
                    default: System.out.println("Ungültige Wahl.");
                }
            }
            System.out.println("Auf Wiedersehen!");
            scanner.close();
        }

}
