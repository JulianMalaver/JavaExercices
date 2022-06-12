package Kikke.Topic16;

public class App {
    public static void main(String[]args){

        ElectricCar electricCar = new ElectricCar();
        electricCar.turnOn();
        electricCar.setNameplate("D85S46");
        electricCar.getNameplate();
        FuelCar fuelCar = new FuelCar();

        fuelCar.setNameplate("DS5666");
        System.out.println("fuelCar = " + fuelCar.getNameplate());
    }
}
