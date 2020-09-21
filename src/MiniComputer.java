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

            System.out.print("Hvilket miniprogram vil du køre [1..5]? 1:Terning  2:Jokes  3:Adventure Game  " +
                    "4:Fishmaster2020  5:Valutta omregner");

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
            if (x == 3) {
                Game.Middelearth();
            }
            //Fishmaster2020 Jens
            if ( x == 4) { Fishmaster2020.main(null);}

            //Valutta lukas
            if (x == 5) {
                // LUKASCLASS();
            }
        }

            System.out.println("Farvel!   ");

        }
}

