package Kikke.ExerciseThree;

public class App {
    public static void main(String []args){
        Play1Fat play1Fat = new Play1Fat(2,"enabled","enabled");
        Play1Slim play1Slim = new Play1Slim(2,"Enable","Enable");
        Play2Fat play2Fat = new Play2Fat(2,"Enable","Enable");
        Play2Slim play2Slim = new Play2Slim(2,"Enable","Enable");
        Play3Fat play3Fat = new Play3Fat(2,"Enable","Enable");
        Play4Fat play4Fat = new Play4Fat(2,"Enable","Enable");
        PSVitaFat psVitaFat = new PSVitaFat(2,"Enable","Enable");
        PSvitaSlim psVitaSlim = new PSvitaSlim(2,"Enable","Enable");
        Snes snes = new Snes(2,"Enable","Enable");
        Switch switch1 = new Switch(2,"Enable","Enable");
        Wii wii = new Wii(2,"Enable","Enable");
        Wiiu wiiu = new Wiiu(2,"Enable","Enable");
    }
}
