package Percussion;

public class PercussionTester {
    public static void main(String[] args) {

        Percussion p = new Percussion();
        p.playOnDrums();
        p.playOnDrumCymbals();

        p.drums = false;
        if (p.drums == true) {
            p.playOnDrums();
        }
    }

}
