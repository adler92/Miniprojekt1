

import java.util.Scanner ;

public class Fishmaster2020 {


    public static void main(String[] args) {
        pickUpRod();
        fishNow();
        tug();




    }

    public static void pickUpRod() {

        System.out.println("You see a great lake before you. " +
                "At your feet lies a fishing-rod. Do you wish to engage? [yes/no] ");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if ( choice.equals("yes")){ System.out.println("It feels strong in your hands. Mighty even.. "); }
        else if ( choice.equals("no")){ System.out.println("You walk away to never look back again.");
        MiniComputer.main(null);}
    }
    public static void fishNow() {

        System.out.println("Do you wish to fish? [yes/no]");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if ( choice.equals("yes")){ System.out.println("*Swoosh* You swing around the mighty rod and let its " +
                "line shoot out over the unbroken surface of the lake. *Plop* "); tug(); }
        else if ( choice.equals("no")){ System.out.println("Standing completely still, for a breef moment, " +
                "you feel at peace. You leave.");
                MiniComputer.main(null);}

    }
    public static void tug() {

        System.out.println("While starring at the clouds you feel a slight tug in your pole. You look and see the line flex for the " +
                "slightest of moments. Pull the rod back " +
                "hard or ... wait for it? [pull/wait]");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if ( choice.equals("pull")){ System.out.println("You pull at full force, trying to hook an unsuspecting bait-nippler");
            System.out.println("After a few short moments of ripples in the water and wild suspense the lake yet again seems untouched. " +
                    "No tugging nor nippling detected.");
            fishNow();
        }
        else if ( choice.equals("wait")){ System.out.println("Something is clearly at the bait. Nippling. Having its way.");

        System.out.println("Pull or wait??!!! [pull/wait]");
            Scanner input2 = new Scanner(System.in);
            String choice2 = input2.nextLine();

            if ( choice2.equals("pull")){ System.out.println("You pull back your rod, hooking ... something ... and franticly start to reel it in.");
                randomCatch();
            }
            else if ( choice2.equals("wait")){ System.out.println("You lost your chance at a great catch... Maybe. Could also have been an old boot.");
                MiniComputer.main(null);
                }
        }


    }
    public static void randomCatch() {

        double resultat = Math.random() * (6 - 1 + 1) + 1;
        int res2 = (int) resultat;
        if (res2 == 1) { System.out.println("You caught an old boot. Yey!"); }
        else if (res2 == 2) { System.out.println("You caught an old a carwheel. Catching!"); }
        else if (res2 == 3) { System.out.println("You caught an old a boyfriend. No returns."); }
        else if (res2 == 4) { System.out.println("You caught an old a man-child. Living large."); }
        else if (res2 == 5) { System.out.println("You caught an old a coupon for a re-fish."); fishNow();}

        else if (res2 == 6) { System.out.println("You caught a fish");
        double kg = Math.random() * (6 - 1 + 1) + 1;
        System.out.println("It weighs" + kg + "kg! Keep it (.. to devour later) or release it back into the lake? [keep/release]");
            Scanner input = new Scanner(System.in);
            String choice = input.nextLine();

            if ( choice.equals("keep")){ System.out.println("It fits perfectly in your back pocket.");
            }
            else if ( choice.equals("release")){ System.out.println("As the fish swims away it feel as though you both learned something.");
                fishNow();
            }
        }
        System.out.println("This concludes your stay at the lake. Bye!");
        MiniComputer.main(null);
    }


}
