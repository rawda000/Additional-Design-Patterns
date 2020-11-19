package Simple_Factory;

public class AnimalFactory {
    IAnimal createAnimal(String type) {
        switch (type.toLowerCase()) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                return null;
        }
    }
}
