package Kikke.Theory.Classes;

public class Instance {
    public static void main(String[]args){

        Concrete concrete = new Concrete();

        concrete.setType("Concrete class");
        System.out.println("concrete = " + concrete.getType());
    }
}
