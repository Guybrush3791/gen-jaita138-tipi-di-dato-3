import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AppFiori {
    public static void main(String[] args) throws Exception {

        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        while (cont) {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            System.out.println("Com'e' il tuo fiore preferito?");

            System.out.println("Nome:");
            String nome = sc.nextLine();

            System.out.println("Tipologia:");
            System.out.println("0 - ANNUALE");
            System.out.println("1 - PERENNE");
            System.out.println("2 - BULBOSO,");
            System.out.println("3 - ARBUSTIVO");
            System.out.println("4 - TREPPIANTE");
            System.out.println("5 - ACQUATICO");
            byte tipologiaNum = sc.nextByte();
            TipologiaFiore tipologiaFiore = TipologiaFiore.values()[tipologiaNum];

            System.out.println("Prezzo:");
            double prezzo = sc.nextDouble();

            System.out.println("Quantita':");
            short quantita = sc.nextShort();
            sc.nextLine();

            System.out.println("Colore principale:");
            String colorePrincipale = sc.nextLine();

            System.out.println("Inizio disponibilita':");
            String inizioDisponibilitaStr = sc.nextLine();
            LocalDate inizioDisponibilita = LocalDate.parse(inizioDisponibilitaStr, formatter);

            System.out.println("Fine disponibilita':");
            String fineDisponibilitaStr = sc.nextLine();
            LocalDate fineDisponibilita = LocalDate.parse(fineDisponibilitaStr, formatter);

            System.out.println("Profumo (true/false):");
            boolean profumo = sc.nextBoolean();

            System.out.println("Artificiale (true/false):");
            boolean artificiale = sc.nextBoolean();

            System.out.println("Fine disponibilita':");

            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");
            System.out.println("Ecco il tuo fiore");

            System.out.println("Nome: " + nome);
            System.out.println("Tipologia: " + tipologiaFiore);
            System.out.println("Prezzo: " + prezzo + "€");
            System.out.println("Quantita': " + quantita);
            System.out.println("Colore principale: " + colorePrincipale);
            System.out.println("Inizio disponibilita': " + inizioDisponibilita.format(formatter));
            System.out.println("Fine disponibilita': " + fineDisponibilita.format(formatter));
            System.out.println("Profumo: " + profumo);
            System.out.println("Artificiale: " + artificiale);

            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("");

            System.out.println("Vuoi continuare a inserire un altro super-fiore!? (true/false):");
            cont = sc.nextBoolean();
            sc.nextLine();
        }

        sc.close();
        System.out.println("Grazie per aver usato il nostro servizio!");
    }
}
