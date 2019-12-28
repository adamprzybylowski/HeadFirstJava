package OratorApp;

public class Orator {
    public static void main(String[] args) {

        //Array(s) of String
        String[] listslow1 = {"architektura wielowarstwowa", "30000 metrów", "rozwiązanie B-do-B", "aplikacja kliencka",
                " interfejs internetowy", " inteligentna karta", "rowiązanie dynamiczne", "sześć sigma", "przenikliwość"};

        String[] listslow2 = {"zwiększa możliwości", "poprawia atrakcyjność", "pomnażą wartość", "opracowana dla",
                " bazująca na", "siecowa", "skoncetrowan na", "udostępnia"};

        String[] listslow3 = {"procesu", "punktu wpisania", "rozwiąznia", "strategi", "paradykmatu", "portalu", "witryny"};

        int list1Size = listslow1.length;  // list1slow lenght
        int list2Size = listslow2.length;
        int list3Size = listslow3.length;

        int rand1 = (int) (Math.random() * list1Size); // generate random number (and type casting to "integer")
        int rand2 = (int) (Math.random() * list2Size);  // (int) - type casting
        int rand3 = (int) (Math.random() * list3Size);
        double rand4 = Math.random();

        String sentence = listslow1[rand1] + " " + listslow2[rand2] + " " + listslow3[rand3];

        System.out.println("This is what we need " + sentence);
        System.out.println(" rand1 = " + rand1 + " rand2 = " + rand3 + " rand3 = " + rand3 + " rand4 = " + rand4);


    }
}
