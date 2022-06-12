package Kikke.ExerciseTwo;

public abstract class Dog extends Mammals{
    private int legs = 4;
    private String race;

    public void wayOfMove(){
        System.out.println("Runs, walk and jump");
    }

    public String getRace(){
        return race;
    }

    public void setRace(String race){
        this.race = race;
    }
}
