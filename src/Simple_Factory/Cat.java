package Simple_Factory;

public class Cat implements IAnimal{
    @Override
    public void speak() {
        System.out.println("Mew");
    }

    @Override
    public void preferredAction() {
        System.out.println("Cat prefers sleeping");
    }
}
