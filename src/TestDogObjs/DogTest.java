package TestDogObjs;

public class DogTest {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.size =30;
        Dog dog2 = new Dog();
        dog2.size = 12;
        Dog dog3 = new Dog();
        dog3.size = 6;
        dog3.name = "Rex";
        dog1.bark(5);
        dog1.setName("Pluto"); //extra testing
        System.out.println(dog1.getName() + " Made Big Barking");  // extra testing
        dog2.bark(3);
        System.out.println(dog3);  //testing what will happen
        System.out.print(dog3.name + " ");
        dog3.bark(1); // dog3 now matter how big argument will be result will be the same -no loop

    }
}
