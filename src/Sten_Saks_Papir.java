import java.util.Random;
import java.util.Scanner;

public class Sten_Saks_Papir {


    public static void StenSaksPapir() {
        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("ROCK, PAPER, SCISSOR");
        System.out.println("Which do you choose?");
        System.out.println("0: Rock");
        System.out.println("1: Paper");
        System.out.println("2: Scissor");

        int choice = in.nextInt();
        String Choice = "";
        switch (choice) {
            case 0: Choice = "Rock"; break;
            case 1: Choice = "Paper"; break;
            case 2: Choice = "Scissor"; break;

        }

        int choicePC = rd.nextInt(3 + 1);
        String ChoicePC = "";
        switch (choicePC) {
            case 0: ChoicePC = "Rock"; break;
            case 1: ChoicePC = "Paper"; break;
            case 2: ChoicePC = "Scissor";break;
        }

        if (choice == choicePC) {
            System.out.println("Your are " + Choice);
            System.out.println("The computer are " + ChoicePC);
            System.out.println("It is a draw");
        } else if (choice == 0 && choicePC == 1) {
            System.out.println("Your are " + Choice);
            System.out.println("The computer are " + ChoicePC);
            System.out.println("YOU LOSE! A paper can wrap a rock");
        } else if (choice == 0 && choicePC == 2) {
            System.out.println("Your are " + Choice);
            System.out.println("The computer are " + ChoicePC);
            System.out.println("YOU WIN! A rock can knock a scissor");
        } else if (choice == 1 && choicePC == 0) {
            System.out.println("Your are " + Choice);
            System.out.println("The computer are " + ChoicePC);
            System.out.println("YOU WIN! A paper can wrap a rock");
        } else if (choice == 1 && choicePC == 2) {
            System.out.println("Your are " + Choice);
            System.out.println("The computer are " + ChoicePC);
            System.out.println("YOU LOSE! A scissor can cut a paper");
        } else if (choice == 2 && choicePC == 0) {
            System.out.println("Your are " + Choice);
            System.out.println("The computer are " + ChoicePC);
            System.out.println("YOU LOSE! A rock can knock a scissor");
        } else if (choice == 2 && choicePC == 1) {
            System.out.println("Your are " + Choice);
            System.out.println("The computer are " + ChoicePC);
            System.out.println("YOU WIN! A scissor can cut a paper");
        }
    }
}
