package Kikke.Topic24;

public class Garage {
    private Motorcycle[] motorcycles;
    private int size;
    private int used;

    public Garage(int size) {
        this.motorcycles = new Motorcycle[size];
        this.used = 0;
        this.size = size;
    }

    public void AddMotorcycle(Motorcycle motorcycles){
        if(this.used<this.size){
            this.motorcycles[used] = motorcycles;
            this.used++;
        }else{
            System.out.println("Garage is full");
        }
    }

    public void takeOutMotorcycle(){
        if(this.used>this.size){
            this.motorcycles[-1] = null;
            this.used--;
        }else{
            System.out.println("Garage is empty");
        }
    }
}