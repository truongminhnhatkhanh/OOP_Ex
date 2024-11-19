package chuong4.bai6;

public class Dog extends Mammal{
    public Dog(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Woof woof");
    }

    public void greets(Dog another){
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}
