import java.util.Random;
import java.util.Scanner;
import java.lang.String;

//Class written by Asta Overgaard-Sørensen


public class Jokes {
    public static void tellMeAJoke() {
        System.out.println("Please enter: joke");
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String inputLine = input.nextLine();
        try {
                int randomNumber = rand.nextInt(10);
                String randomJoke = GetJoke(randomNumber);
                System.out.println(randomJoke);
        }
        catch (Exception e){
            System.out.println("Something went wrong!");
        }
    }

    public static String GetJoke(int a) {
        String joke;
        switch (a) {
            case 0:
                joke = "Autocorrect can go straight to he'll.";
                break;
            case 1:
                joke = "How does a computer get drunk? It takes a screenshot!";
                break;
            case 2:
                joke = "My computer suddenly started belting out Someone Like You. It's a Dell.";
                break;
            case 3:
                joke = "Hardware: the part of the computer you can kick!";
                break;
            case 4:
                joke = "Programmer: a machine that turns caffeine into code";
                break;
            case 5:
                joke = "What's the object-oriented way to become wealthy? Inheritance.";
                break;
            case 6:
                joke = "What do you call a programmer from Scandinavia? A nerdic.";
                break;
            case 7:
                joke = "Why do java programmer wear glasses? Cause they don't C#";
                break;
            case 8:
                joke = "Real programmers count from 0";
                break;
            case 9:
                joke = "99 little bugs in the code, 99 little bugs in the code. 1 bug fixed... compile again. 100 little bugs in the code";
                break;
            default:
                joke = "Uh oh, this is a bug.";
        }
        return joke;
    }
}


