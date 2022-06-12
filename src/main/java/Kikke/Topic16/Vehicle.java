package Kikke.Topic16;

public abstract class Vehicle {

    private String nameplate;
    private int wheels;

    public abstract void brakes();
    public void turnOn(){
        System.out.println("The vehicle is on");
    }

    public String getNameplate(){
        return nameplate;
    }

    public void setNameplate(String nameplate){
        this.nameplate = nameplate;
    }
}
