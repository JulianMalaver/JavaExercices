package Kikke.ExerciseTwo;

public abstract class   Reptile extends Vertebrate{

    @Override
    public void wayOfMove(){
        System.out.println("It depends");
    }

    @Override
    public void reproduction(){
        System.out.println("Sexual");
    }

    @Override
    public void born (){
        System.out.println("Oviparous");
    }

}
