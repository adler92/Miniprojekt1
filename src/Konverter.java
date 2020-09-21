import java.util.Scanner;

public class Konverter {

    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public static void Rate() {

        System.out.println("Hej og velkommen! \nHer kan du se den nuværende kurs på alle valutaer!");
        wait(3000);

        while (true) {
            System.out.println("***************** \nIndtast venligst den øsnkede valuta");

            Scanner scanner = new Scanner(System.in);
            String x0 = scanner.nextLine();

            if (x0.equalsIgnoreCase("USD")) {
                System.out.println("USD kursen ligger på: \t-> 6,6296");
                wait(2000);
                System.out.println("Ønsker du at beregne et beløb med den valgte Valuta?");
            }

            String x1 = scanner.nextLine();

            if (x1.equalsIgnoreCase("JA")) {
                while (true) {
                    System.out.println("Hvad er beløbet?");
                    double y = scanner.nextDouble();
                    System.out.println(y * 6.6296);
                    wait(2000);
                    System.out.println("Vil du indtaste et nyt beløb?");
                    String y1 = scanner.nextLine();
                    if (y1.equalsIgnoreCase("JA")) {
                    }

                    if (y1.equalsIgnoreCase("NEJ")) {
                        break;
                    }

                }
            }


                if (x1.equalsIgnoreCase("NEJ")) {
                    System.out.println("Ønsker du at se en anden valuta?");
                }

                String x2 = scanner.nextLine();

                if (x2.equalsIgnoreCase("JA")) {

                }


                if (x2.equalsIgnoreCase("NEJ")) {
                    System.out.println("Forlader Konverter");
                    break;


                }


            }
        }

    }
