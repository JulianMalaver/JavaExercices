package Kikke.Topic23;

public class Operator extends Employee{
    private String uniform;

    public Operator(String name, String lastName, String cellNumber, String address) {
        super(name, lastName, cellNumber, address);
    }
    public Operator(String name, String lastName, String cellNumber, String address, String uniform) {
        super(name, lastName, cellNumber, address);
        this.uniform = uniform;
    }
    public String getUniform(){
        return uniform;
    }

    public void setUniform(String uniform){
        this.uniform = uniform;
    }

    public void showUniform(){
        System.out.println(this.uniform); // It won't generate dependence from getUniform
        System.out.println(this.getUniform()); // It will generate dependence from getUniform
    }
}
