package Chapter2.GuessGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    public void StartGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

    
        boolean p1isRigt = false;
        boolean p2isRigt = false;
        boolean p3isRigt = false;

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 an 9...");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if (guessp1 == targetNumber) {
                p1isRigt = true;
            }

            if (guessp2 == targetNumber) {
                p2isRigt = true;
            }

            if (guessp3 == targetNumber) {
                p3isRigt = true;
            }

            if (p1isRigt || p2isRigt || p3isRigt) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRigt);
                System.out.println("Player two got it right? " + p2isRigt);
                System.out.println("Player three got it right? " + p3isRigt);
                System.out.println("Game is over.");
                break;
            } else {
                System.out.println("Players wil try again.");
                System.out.println("");
            }
        }
    }
}
