package Kikke.ExerciseTwo;

public abstract class Mammals extends Vertebrate{
    @Override
    public void born(){
        System.out.println("Viviparous");
    }
    @Override
    public void eat(){
        System.out.println("Omnivore");
    }
    @Override
    public void reproduction(){
        System.out.println("Sexual");
    }
}
