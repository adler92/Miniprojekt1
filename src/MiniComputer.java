import java.util.Scanner;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class MiniComputer {

    public static void main(String[] args) {

        System.out.println("Velkommen til minicomputer!");

        for (int i = 0; i < 3; i++) {

            System.out.println("Hvilket miniprogram vil du køre?");
            System.out.println("[1] Terning");
            System.out.println("[2] Jokes");
            System.out.println("[3] Adventure Game");
            System.out.println("[4] Fishmaster2020");
            System.out.println("[5] Valuta Omregner");
            System.out.println("[6] Sten, Saks, Papir");
            System.out.println("[7] Heads or Tails?");
            System.out.println("[8] Lottery");

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();

            if (x == 1) {
                Terning.kast();
            }
            // Dine if sætninger skal komme her

            //Jokes Asta
            if (x == 2) {
                Jokes.tellMeAJoke();
            }
            // Middleearth Game Delal
            if (x == 3) { Game.Middelearth(); }
            //Fishmaster2020 Jens
            if ( x == 4) { Fishmaster2020.main(null);}

            //Valuta lukas
            if (x == 5) {
                // LUKASCLASS();
            }
            if (x==6) { Sten_Saks_Papir.StenSaksPapir(); }
            if (x==7) { HeadsorTails.HeadsorTails(); }
            if (x==8) {Lottotal.Lottery(); }
        }

            System.out.println("Farvel!   ");

        }
}

