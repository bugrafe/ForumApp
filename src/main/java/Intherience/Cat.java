package Intherience;

public class Cat extends Mammel{
    public void meow(){
        System.out.println("Cat meow");
    }
    @Override
    public void eat(){
        System.out.println("Cat eat");
    }
    @Override
    public void drink(){
        System.out.println("Cat drink");
    }
}
