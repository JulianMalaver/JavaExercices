package Kikke.Topic24;

public class App {
    public static void main(String[]args){

        ElectricMotorcycle electricMotorcycle = new ElectricMotorcycle();
        functionsMotorcycle(electricMotorcycle);
        FuelMotorcycle fuelMotorcycle = new FuelMotorcycle();
        functionsMotorcycle(fuelMotorcycle);
        DieselMotorcycle dieselMotorcycle = new DieselMotorcycle();
        functionsMotorcycle(dieselMotorcycle);

        Garage mainGarage = new Garage(6);
        mainGarage.AddMotorcycle(new ElectricMotorcycle());
        mainGarage.AddMotorcycle(new FuelMotorcycle());


    }

    public static void functionsMotorcycle(Motorcycle motorcycle){
        motorcycle.accelerate();
        if(motorcycle instanceof ElectricMotorcycle){
            ((ElectricMotorcycle)motorcycle).charging();
        }else if(motorcycle instanceof FuelMotorcycle){
            ((FuelMotorcycle)motorcycle).fuelTank();
        }
    }

}
