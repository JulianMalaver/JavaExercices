package Kikke.ExerciseTwo;

public abstract class Fish extends Vertebrate{

    @Override
    public void wayOfMove(){
        System.out.println("It swims");
    }

    @Override
    public void reproduction(){
        System.out.println("Sexual reproduction");
    }

    @Override
    public void born(){
        System.out.println("oviparous and viviparous");
    }

}
