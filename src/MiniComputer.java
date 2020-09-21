import java.util.Random;
import java.util.Scanner;
import java.lang.String;

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

            System.out.print("Hvilket miniprogram vil du køre [1..9]? ");

            Scanner input = new Scanner(System.in);
            int x = input.nextInt();

            if ( x == 1) { Terning.kast(); }
            // Dine if sætninger skal komme her
            // Bil.dyt();

            if ( x == 8) { Konverter.Rate(); }


        }

        System.out.println("Farvel!");

    }

}
