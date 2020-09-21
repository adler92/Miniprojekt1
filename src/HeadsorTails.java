import java.util.Random;
import java.util.Scanner;

public class HeadsorTails {

    public static void HeadsorTails() {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("HEADS OR TAILS");
        System.out.println("0 for heads");
        System.out.println("1 for tails");
        System.out.println("Heads or tails? ");
        int guess = in.nextInt();

        int answer = rd.nextInt(3-1);
        String Answer = "";
        switch (answer) {
            case 0: Answer = "heads"; break;
            case 1: Answer = "tails"; break;
        }

        if (guess==0) {
            if (guess==answer) {
                System.out.println("Your guess is correct");
                System.out.println("The answer is " + Answer);
            }
            else {
                System.out.println("Your guess is wrong");
                System.out.println("The answer is " + Answer);
            }
        }
        if (guess==1) {
            if (guess==answer) {
                System.out.println("Your guess is correct");
                System.out.println("The answer is " + Answer);
            }
            else {
                System.out.println("Your guess is wrong");
                System.out.println("The answer is " + Answer);
            }
        }
    }
}
