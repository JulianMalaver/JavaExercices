package Kikke.ExerciseFour;
 import Kikke.ExerciseFour.Samsung;

public class App {

    public static void main(String[]args){


       Iphone6 iphone6 = new Iphone6();
       iphone6.turnOn();
       iphone6.takePictures();
       iphone6.turnOff();
       System.out.println(iphone6);

       Apple apple = (Apple) iphone6;
       apple.buy();
       apple.turnOn();
       apple.turnOff();
       System.out.println("apple = " + apple);

       CellPhone cellPhone = (CellPhone) iphone6; // Casting with same location in the memory
       cellPhone.turnOn();
       cellPhone.turnOff();
       System.out.println("cellPhone = " + cellPhone);

       Apple apple1 = new Iphone6();
       apple1.buy();
       apple.turnOn();
       apple.turnOff();
       System.out.println("apple1 = " + apple1);

       ((Iphone6)cellPhone).takePictures();











    }
}
