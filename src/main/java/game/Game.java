package game;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        
        Scanner scannerInput = new Scanner(System.in);
        Personnage player;
        String userChoice;
        Boolean play = true;

        System.out.println("Choisissez un personnage !");
        System.out.println("1 -Warrior 2 -Magician");
        userChoice = scannerInput.nextLine();
        if(userChoice.equals("1") ) {
            player = new Warrior();
            System.out.println("new warrior created.");
        } else {
            player = new Magician();
            System.out.println("new magician created.");
        }
        while(play){
            System.out.println("Choisissez une option !");
            System.out.println("1-Voir 2-Modifier 3-Attaquer 4-ajouter une arme");
            userChoice = scannerInput.nextLine();
        
            if(userChoice.equals("1")){
                System.out.println(player.toString());
            } else if (userChoice.equals("2")) {
                System.out.println("Choisissez un nom:");
                userChoice = scannerInput.nextLine();
                player.setName(userChoice);
        
                System.out.println("Choisissez une image (lien Url):");
                userChoice = scannerInput.nextLine();
                player.setImg(userChoice);
        
                System.out.println("Choisissez votre niveau de vie:");
                userChoice = scannerInput.nextLine();
                player.setLife(Integer.parseInt(userChoice));
        
                System.out.println("Choisissez votre force d'attaque:");
                userChoice = scannerInput.nextLine();
                player.setAttack(Integer.parseInt(userChoice));

                System.out.println(player.toString());
            } else if(userChoice.equals("3")) {
                System.out.println("J'ai pas compris!");
            }  else if (userChoice.equals("4")) {
                System.out.println("Choisissez une arme ou sort:");
                String weaponName = scannerInput.nextLine();
                System.out.println("Choisissez sa force:");
                int weaponForce = Integer.parseInt(scannerInput.nextLine());
                player.addWeapon(weaponName, weaponForce);
                System.out.println(player.toString());
            }

            System.out.println("Continuer ? (exit pour quitter)");
            userChoice = scannerInput.nextLine();
            if(userChoice.equals("exit")) {
                play = false;
            }
        }
            
                 

        System.out.println("exit the game");
    }
}
