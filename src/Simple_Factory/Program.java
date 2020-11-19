package Simple_Factory;

public class Program {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        IAnimal dog = animalFactory.createAnimal("dog");
        if (dog != null) {
            dog.preferredAction();
            dog.speak();
        }
        IAnimal cat = animalFactory.createAnimal("cat");
        if (cat != null) {
            cat.preferredAction();
            cat.speak();
        }

    }
}
