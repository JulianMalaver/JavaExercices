package Kikke.Topic25;

public class App {
    public static void main(String []args){

        FormalPants formalPants = new FormalPants();
        formalPants.bottom();
        formalPants.open();
        formalPants.setPrice(100000);

        System.out.println(formalPants.getPrice());

        Pants pants = (Pants) formalPants; // casting
        pants.open();
        pants.setPrice(500000);
        System.out.println(pants.getPrice());

        System.out.println(formalPants.getPrice());

        Clothes pant1 = new FormalPants();

        FormalPants formalPants1 = new FormalPants();
        Pants pants2 = formalPants1;
        Clothes clothes = pants2;
        Pants pants1 = (Pants) clothes;
    }
}
