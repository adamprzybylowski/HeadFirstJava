package FilmTest;

public class Film {
    String tytul;
    String rodzaj;
    int ocena;

    void odtworz() {
        System.out.println("Odtwarzamy film");
    }

    void play() {
        System.out.println(tytul + " " + rodzaj + " " + ocena);
    }
}
