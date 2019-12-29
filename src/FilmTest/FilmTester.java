package FilmTest;

public class FilmTester {
    public static void main(String[] args) {

        Film pierwszy = new Film();
        pierwszy.tytul = "Hossa";
        pierwszy.rodzaj = "Tragedia";
        pierwszy.ocena = -2;

        Film drugi = new Film();
        drugi.tytul = "Matrix";
        drugi.rodzaj = "Komedia";
        drugi.ocena = 5;
        drugi.odtworz();

        Film trzeci = new Film();
        trzeci.tytul = "Byte";
        trzeci.rodzaj = "Horror";
        trzeci.ocena = 127;


        System.out.println("");
        System.out.println(trzeci);
        System.out.println(trzeci.tytul);
        System.out.println(trzeci.rodzaj);
        System.out.println(trzeci.ocena);

        System.out.println("");
        pierwszy.play();
        drugi.play();
        trzeci.play();

        System.out.println(pierwszy.equals(drugi));
    }
}
