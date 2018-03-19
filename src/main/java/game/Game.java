package game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        Personnage player;

        System.out.println("Choisissez un personnage !");
        System.out.println("1 -Warrior 2 -Magician");
        String userChoice = userInput.nextLine();
        if(userChoice.equals("1") ) {
            player = new Warrior();
            System.out.println("new warrior created.");
        } else {
            player = new Magician();
            System.out.println("new magician created.");
        }

    }
}
