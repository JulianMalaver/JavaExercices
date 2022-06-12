package Kikke.Sessions.Fisica;

public class Fisica {
    public double calculateSpeed(double distance, double time){
        double speed = distance / time;
        return speed;
    }

    public double calculateSpeed(int distance, int time){
        double speed = (double)distance / time;
        return speed;
    }

    public double calculateTime(int distance, int speed){
        double time = (double) distance / speed; // casting it transforms the type of the value
        return time;
    }
}
