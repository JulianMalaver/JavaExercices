package Kikke.Topic23;

public class Employee {

    private String name;
    private String lastName;
    private String cellNumber;
    private String address;

    // Constructor aren't able to inherit
    public Employee(String name, String lastName, String cellNumber, String address){
        this.name = name;
        this.lastName = lastName;
        this.cellNumber = cellNumber;
        this.address = address;
    }

}
