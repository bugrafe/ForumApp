package Intherience;

public class Bird extends Animal{
    public void twit(){
        System.out.println("Birds twit");
    }
    @Override
    public void eat(){
        System.out.println("Bird eat");
    }
}
