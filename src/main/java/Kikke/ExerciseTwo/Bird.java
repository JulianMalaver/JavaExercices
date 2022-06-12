package Kikke.ExerciseTwo;

public abstract class Bird extends Vertebrate{
    @Override
    public void wayOfMove(){
        System.out.println("It flies");
    }

    @Override
    public void reproduction(){
        System.out.println("Sexual");
    }

    @Override
    public void born(){
        System.out.println("Oviparous");
    }
}
