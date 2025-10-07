package OOP;

public class Controller {
    public static void main(String[] args){
     Inventory i = new Inventory();
     i.setWeapon("m1416");
     i.armory="armory";
     i.potiom="pootion";
     i.flash = "Flash-23";
        System.out.println(i.getWeapon());
    }
}
