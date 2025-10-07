package club;

import java.util.Scanner;

public class SalamB {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String backet = "";
        int sum = 0;
        System.out.println("                    SALAMBRO MENU                ");

        System.out.println("       Welcome to the menu of SalamBro fast food station");
        System.out.println("Here you can see our menu below" +" -");


        while (true){
            System.out.println(" 1.BURGERS");
            System.out.println(" 2.DRINKS");
            System.out.println(" 3.SAUCE");
            System.out.println(" 4.THE CHECK/BACKET");
            System.out.print("Choose one :");
            int a =scanner.nextInt();
            if (a==1) {
                System.out.println("  HUMBURGERS - ");
                System.out.println("1.Chicken Hamburger - 590 KZT");
                System.out.println("2.Beef Burger - 890 KZT");
                System.out.println("3.Mixed Hamburger - 1090 KZT");
                System.out.print("Choose the Burger -");
                int q = scanner.nextInt();
                if (q == 1) {
                    sum += 590;
                    backet+="Chicken Hamburger - 590 KZT\n";
                } else if (q == 2) {
                    backet+="Beef Hamburger - 890 KZT\n";
                    sum += 890;
                } else {
                    sum += 1090;
                    backet +="Mixed Hamburger - 1090 KZT\n";
                }
            }
             if (a==2) {
                 System.out.println("  DRINKS - ");
                 System.out.println("1.Fuse tea - 250 KZT");
                 System.out.println("2.Coca Cola - 250 KZT");
                 System.out.println("3.Predator - 300 KZT");
                 System.out.print("Choose Drinks -");
                 int w = scanner.nextInt();
                 if (w == 1) {
                     sum += 250;
                     backet+="Fuse tea - 250 KZT\n";
                 } else if (w == 2) {
                     sum += 250;
                     backet+="Coca Cola - 250 KZT\n";
                 } else {
                     sum += 300;
                     backet+="Predator - 300 KZT\n";
                 }
             }
                 if (a ==3){
                     System.out.println("1.Ketchup` - 290 KZT");
                     System.out.println("2.Cheese - 290 KZT");
                     System.out.print("Choose the souse - ");
                     int e = scanner.nextInt();
                     if (e==1){
                         sum+=290;
                         backet+="Ketchup - 290 KZT\n";
                     }
                     else {
                         sum+=290;
                         backet+="Cheese - 290 KZT\n";
                     }
                 }
                 if (a == 4){
                     System.out.println();
                     System.out.println();
                     System.out.println("THE BACKET - \n"+backet);
                     System.out.println();
                     System.out.println("TOTAL PRICE/CHECK : "+sum+" KZT");
                     System.out.println("MADE BY @qaanag_at");
                 }
             }
            }
        }


