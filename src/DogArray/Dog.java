package DogArray;

public class Dog {
    String name;

    public void bark() {
        System.out.println(name + " Barking : bark, bark!! ");
    }

    public static void main(String[] args) {
        //object dog
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Azor";

        // array with objects Dog

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // access to objects i reference to them by array
        myDogs[0].name = "Dzorcz";
        myDogs[1].name = "Meja";

        System.out.print("Last dog name is: ");
        System.out.println(myDogs[2].name);

        // all Dogs need to bark - loop

        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }





}
