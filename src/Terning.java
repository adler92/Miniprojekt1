/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 18/09/2020
 */

public class Terning {

    public static int kast() {

        double resultat = Math.random() * (6 - 1 + 1) + 1;
        System.out.println("Terningen viser: " + (int) resultat);
        return (int) resultat;
    }

}
