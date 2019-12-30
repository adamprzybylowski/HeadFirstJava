package QuizBasic;

public class Quiz {
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int typep1 = 0;
        int typep2 = 0;
        int typep3 = 0;

        boolean p1guessed = false;
        boolean p2guessed = false;
        boolean p3guessed = false;

        int numberToGuess = (int) (Math.random() * 10);
        System.out.println(" I think about number from 0 to 9");

        while (true) {
            System.out.println("Need to guess the number: " + numberToGuess);

            p1.guess();
            p2.guess();
            p3.guess();
            System.out.println("");

            typep1 = p1.number;
            System.out.println("1 Player bet number : " + typep1);

            typep2 = p2.number;
            System.out.println("2 Player bet number : " + typep2);


            typep3 = p3.number;
            System.out.println("3 PLayer bet number : " + typep3);


            if (typep1 == numberToGuess) {
                p1guessed = true;
            }
            if (typep2 == numberToGuess) {
                p2guessed = true;
            }
            if (typep3 == numberToGuess) {
                p3guessed =true;
            }

            if (p1guessed || p2guessed || p3guessed) {
                System.out.println("");
                System.out.println("We have the winner! ");
                System.out.println(" whether 1 player selected correctly? " + p1guessed);
                System.out.println(" whether 2 player selected correctly? " + p2guessed);
                System.out.println(" whether 3 player selected correctly? " + p3guessed);
                System.out.println("Game is finished");
                break;
            } else {
                System.out.println("Players need to try again");
                System.out.println(" ");
            }


        }

    }
}
