package Simple_Factory;

public class Dog implements IAnimal {
    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public void preferredAction() {
        System.out.println("Dog prefers barking");
    }
}
