package TestDogObjs;

public class Dog {

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

    void bark() {
        if (size > 20) {
            System.out.println("Big Barking");
    }   else if (size > 10) {
        System.out.println("Medium Barking");

    }  else {
        System.out.println("Small Barking");
    }
}

}

