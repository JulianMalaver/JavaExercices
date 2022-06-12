package Kikke.Topic23;

public class LoadingOperator extends Operator{
    private double loadingCapacity;

    public LoadingOperator(String name, String lastName, String cellNumber, String address, String uniform) {
        super(name, lastName, cellNumber, address, uniform);
    }

    public LoadingOperator(String name, String lastName, String cellNumber, String address, String uniform, double loadingCapacity) {
        super(name, lastName, cellNumber, address, uniform);
        this.loadingCapacity = loadingCapacity;
    }

    public Double getLoadingCapacity(){
        return loadingCapacity;
    }

    public void setLoadingCapacity(Double loadingCapacity){
        this.loadingCapacity = loadingCapacity;
    }
}
