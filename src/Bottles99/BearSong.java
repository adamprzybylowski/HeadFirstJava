package Bottles99;

public class BearSong {
    public static void main(String[] args) {
        int numberOfButtels = 99;
        String word = "bottles";
        while (numberOfButtels > 0) {
            if (numberOfButtels == 1) {
                word = "bottle";
            }
            System.out.println(numberOfButtels + " " + word + " of beer on the wall");
            System.out.println("Take one down");
            System.out.println(numberOfButtels + " " + word + " of beer");

            System.out.println("Pass it around");
            numberOfButtels = numberOfButtels - 1;
            if (numberOfButtels > 0) {
                if (numberOfButtels == 1) {
                    word = "bottle";
                }
                System.out.println(numberOfButtels + " " + word + " of beer on the wall");
                System.out.println("                                                   ");
            } else {
                System.out.println(" No more bottles of beer on the wall");
            }
        }
    }
}
