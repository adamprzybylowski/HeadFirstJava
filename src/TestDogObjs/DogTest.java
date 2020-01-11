package TestDogObjs;

public class DogTest {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.size = 11;
        Dog dog2 = new Dog();
        dog2.size = 12;
        Dog dog3 = new Dog();
        dog3.size = 6;
        dog3.name = "Rex";
        dog2.name = "Azor";
        dog1.bark(5);
        dog1.setName("Pluto"); //extra testing

        System.out.println(dog1.getName() + " Made Big Barking " + dog1.howManyBarks + " times ");  // extra testing
        System.out.println("");

        dog2.bark(3);
        System.out.println(dog2.name + " Barked " + dog2.howManyBarks);

        System.out.println("");
        System.out.print(dog3);  //testing what will happen
        System.out.println("  < -- Test what will be the output");
        System.out.println("");

        System.out.println(dog3.name);
        dog3.bark(2);

        System.out.println(dog3.name + " Barked " + dog3.howManyBarks);

    }
}
