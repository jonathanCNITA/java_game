package game;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
    public static void main(String[] args) {
        System.out.println("It works");
        int randomNum = 0;
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
        

        // the fight area
        System.out.println(warrior1.getName() + "Life : " + warrior1.getLife());

        while(warrior1.getLife() > 0) {
            System.out.println("Press enter to fight");
            String readyToFight = sc.nextLine();
    
            randomNum = ThreadLocalRandom.current().nextInt(10, 30 + 1);
            warrior1.decreaseLife(randomNum);
            System.out.println(warrior1.getName() + "Life : " + warrior1.getLife());
        }
        
        System.out.println("looser!");

    
    }
}
