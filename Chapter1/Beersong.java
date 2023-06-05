package Chapter1;

public class Beersong {
    public static void main(String[] args) {
        int Beernum = 99;
        String Word = "Bottles";

        while (Beernum > 0) {
            if (Beernum == 1) {
                Word = "bottle";
            }

            System.out.println(Beernum + " " + Word + " of beer on the wall.");
            System.out.println(Beernum + " " + Word + " of beer.");
            System.out.println("Take one down.");
            System.out.println("Pass it around.");
            Beernum -= 1;

            if (Beernum > 0) {
                System.out.println(Beernum + " " + Word + " of beer on the wall.");
            } else {
                System.out.println("no more bottles on the wall.");
            }

        }

    }
}