package Kikke.ExerciseTwo;

public abstract class Amphibian extends Vertebrate{

    @Override
    public void eat(){
        System.out.println("Eats insects");
    }

    @Override
    public void wayOfMove(){
        System.out.println("Swim and jump");
    }

    @Override
    public void reproduction(){
        System.out.println("Sexual and asexual");
    }

    @Override
    public void born(){
        System.out.println("Oviparous");
    }
}
