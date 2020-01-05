package TestDogObjs;

public class Dog {

    public int howManyBarks;

    // getter i setter only to testing my scenario
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    int size;
    String name;

    void bark(int numbersOfBarks) {

        if (size > 20) {
            howManyBarks = numbersOfBarks;
            while (numbersOfBarks > 0) {
                System.out.println("Big Barking");
                numbersOfBarks = numbersOfBarks - 1;
            }
            System.out.println(howManyBarks + " Big Barks");

        } else if (size > 10) {
            howManyBarks = numbersOfBarks;
            while (numbersOfBarks > 0) {
                numbersOfBarks = numbersOfBarks - 1;
                System.out.println("Medium Barking");
            }
            System.out.println(howManyBarks + " Medium Barks");
        } else {
            System.out.println("Small Barking");

        }

    }

}

