package chuong4.bai6;

public class Cat extends Mammal{
    public Cat(String name){
        super(name);
    }

    public void greets(){
        System.out.println("Meow meow");
    }

    public String toString(){
        return "Cat[" + super.toString() + "]";
    }
}
