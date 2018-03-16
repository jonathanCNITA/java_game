package game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("It works");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Name of the warrior: ");
        String warriorName = sc.nextLine();
        Personnage warrior1 = new Warrior();
        warrior1.setName(warriorName);
        System.out.println("the warrior is " + warrior1.getName());
        
        System.out.println("------------------------------");

        System.out.println("Name of the magician: ");
        warriorName = sc.nextLine();
        Personnage magician1 = new Magician();
        magician1.setName(warriorName);
        System.out.println("the magician is " + magician1.getName());
        
        System.out.println("");
        System.out.println("--------------> Ready to fight! <--------------");
        System.out.println("");
        System.out.println("//////////////////////////////////////");
        System.out.println("");
        System.out.println(warrior1.getName() + " VERSUS " + magician1.getName());
        System.out.println("");
        System.out.println("//////////////////////////////////////");
    
    }
}
