import java.util.Scanner;

public class Game {

    //Miniprojekt - Tekstbaseret spil

    Scanner in = new Scanner(System.in);
    String playerNavn;
    String våben = "et sværd";
    int valgmulighed;
    int playerHP = 10;
    int monsterHP = 8;
    int guldArmbånd;

    public static void main(String[] args) {

        Game Middelearth;
        Middelearth = new Game();

        Middelearth.playerSetup();
        Middelearth.byPort();

    }
    public void playerSetup() {

        System.out.println("VELKOMMEN!");
        System.out.println(" ");

        System.out.println("Hvad er dit navn? ");
        playerNavn = in.nextLine();

        System.out.println("Hello " + playerNavn + ", velkommen og lads os begynde!");
        System.out.println("Din HP er " + playerHP);
        System.out.println("Dit våben er " + våben);
    }
    public void ending() {
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Vagten: Oh Du dræbte monsteret!?? Fantastisk!");
        System.out.println("Vagten: Det ser ud til du er værdig nok. Velkommen til vores by!");
        System.out.println("\n\n        Velkommen hjem                    ");
        System.out.println("\n\n           THE END                    ");
        System.out.println("\n———————————————————————————————————————\n");
    }
    public void død() {
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Du døde");
        System.out.println("GAME OVER");
        System.out.println("\n———————————————————————————————————————\n");
    }

    public void byPort() {

        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Du er ankommet til by porten");
        System.out.println("Foran porten står der en vagt");
        System.out.println(" ");
        System.out.println("Hvad gør du?");
        System.out.println("1: Snakker med vagten");
        System.out.println("2: Angriber vagten");
        System.out.println("3: Gå");
        System.out.println("\n———————————————————————————————————————\n");

        valgmulighed = in.nextInt();
        if (valgmulighed==1) {
            if(guldArmbånd==1) {
                ending ();
            }
            else{
                System.out.println("Vagten: Hallo fremmed. Så dit navn er " + playerNavn);
                System.out.println("Vagten: Vi tillader ikke fremmed i byen. Kom tilbage når du er mere værdig");
                in.nextLine();
                byPort();
            }
        }
        else if (valgmulighed==2) {
            if (playerHP<1) {død();}
            else playerHP = playerHP - 1;{
                System.out.println("Din HP er nu på " + playerHP);
                byPort();
            }
        }
        else if (valgmulighed==3) {
            Krydsvej();

        }

    }
    public void Krydsvej() {
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Du er endt ved en krydsvej");
        System.out.println("Hvad gør du nu?");
        System.out.println("1: Øst mod floden");
        System.out.println("2: Vest mod skoven");
        System.out.println("3: Tilbage til byen");
        System.out.println("\n———————————————————————————————————————\n");

        valgmulighed = in.nextInt();
        if (valgmulighed==1) {
            Øst();
        }
        else if (valgmulighed==2) {
            Vest();
        }
        else if (valgmulighed==3) {
            byPort();
        }
    }
    public void Øst() {
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Du er nået op til floden");
        System.out.println("Du vælger at drikke af vandet og hvile dig");
        playerHP = playerHP + 4;
        System.out.println("Din HP er nu på " + playerHP);
        System.out.println("Tag nu tilbage til krydsvejen");
        System.out.println("\n———————————————————————————————————————\n");
        valgmulighed = in.nextInt();
        Krydsvej();
    }
    public void Vest() {
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Du er nået dybt ind i skoven og er nået frem til en grotte");
        System.out.println("En minotauros kommer ud af grotten");
        System.out.println("Hvad gør du?");
        System.out.println("1: Angrib");
        System.out.println("2: Løb");
        System.out.println("\n———————————————————————————————————————\n");

        valgmulighed = in.nextInt();
        if (valgmulighed==1) {
            Angrib();
        }
        else if (valgmulighed==2) {
            Krydsvej();
        }
    }
    public void Angrib() {
        playerHP = playerHP - 2;
        monsterHP = monsterHP - 1;
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Din HP er nu på " + playerHP);
        System.out.println("Minotauros' HP er nu på " + monsterHP);
        System.out.println("\n———————————————————————————————————————\n");

        if (monsterHP<1) {
            Vind();
        }
        else if (playerHP < 1){
            død();
        }
        else if (playerHP > 0) {
            System.out.println("Hvad vil du gøre nu?");
            System.out.println("1: Angrib igen");
            System.out.println("2: Løb");

            valgmulighed = in.nextInt();
            if (valgmulighed==1) {
                Angrib();
            }
            else if (valgmulighed==2) {
                Krydsvej();
            }
        }
    }
    public void Vind() {
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("Du dræbte minotauros og den tabte en guld armbånd");
        System.out.println("Du har nu fået et guld armbånd");
        System.out.println("1: Du kan vende tilbage til krydsvejen og tage hjem");
        System.out.println("2: Eller du kan fortsætte nordpå");
        System.out.println("\n———————————————————————————————————————\n");
        guldArmbånd = 1;

        valgmulighed = in.nextInt();
        if (valgmulighed==1) {
            Krydsvej();
        }
        else if (valgmulighed==2) {
            Nord();
        }

    }
    public void Nord() {
        System.out.println("\n———————————————————————————————————————\n");
        System.out.println("TO BE CONTINUED");
        System.out.println("Tak for at have spillet med");
        System.out.println("\n———————————————————————————————————————\n");
    }
}
