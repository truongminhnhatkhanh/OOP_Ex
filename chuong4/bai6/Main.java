package chuong4.bai6;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dong");
        System.out.println(animal.toString());

        Mammal mammal = new Mammal("Mammal");
        System.out.println(mammal.toString());

        Cat cat = new Cat("Cat");
        System.out.println(cat.toString());

        Dog dog = new Dog("Dog");
        System.out.println(dog.toString());
    }
}
