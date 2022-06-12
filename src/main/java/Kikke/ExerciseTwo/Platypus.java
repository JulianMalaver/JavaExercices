package Kikke.ExerciseTwo;

public class Platypus extends Mammals{

    @Override
    public void wayOfMove(){
        System.out.println("Swims and can walk too");
    }

    @Override
    public void born(){
        System.out.println("Oviparous");
    }

    @Override
    public void reproduction(){
        System.out.println("Sexual");
    }

}
