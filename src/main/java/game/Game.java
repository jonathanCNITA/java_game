package game;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        
        Scanner scannerInput = new Scanner(System.in);
        ArrayList<Personnage> player = new ArrayList<Personnage>();
        String userChoice;

        Boolean custom = true;
        int itemNum = 0;

        while(true) {
            custom = true; 
            System.out.println("Choisissez un personnage !" +"(" + itemNum + ")");
            System.out.println("1 -Warrior 2 -Magician");
            userChoice = scannerInput.nextLine();

            if(userChoice.equals("1") ) {
                player.add(new Warrior());
                System.out.println("new warrior created.");
            } else {
                player.add(new Magician());
                System.out.println("new magician created.");
            }
            while(custom){
                System.out.println("Choisissez une option !");
                System.out.println("1-Voir 2-Modifier 3-Attaquer 4-ajouter une arme");
                userChoice = scannerInput.nextLine();
            
                if(userChoice.equals("1")){
                    System.out.println(player.get(itemNum).toString());
                } else if (userChoice.equals("2")) {
                    System.out.println("Choisissez un nom:");
                    userChoice = scannerInput.nextLine();
                    player.get(itemNum).setName(userChoice);
            
                    System.out.println("Choisissez une image (lien Url):");
                    userChoice = scannerInput.nextLine();
                    player.get(itemNum).setImg(userChoice);
            
                    System.out.println("Choisissez votre niveau de vie:");
                    userChoice = scannerInput.nextLine();
                    player.get(itemNum).setLife(Integer.parseInt(userChoice));
            
                    System.out.println("Choisissez votre force d'attaque:");
                    userChoice = scannerInput.nextLine();
                    player.get(itemNum).setAttack(Integer.parseInt(userChoice));

                    System.out.println(player.get(itemNum).toString());
                } else if(userChoice.equals("3")) {
                    System.out.println("J'ai pas compris!");
                }  else if (userChoice.equals("4")) {
                    System.out.println("Choisissez une arme ou sort:");
                    String weaponName = scannerInput.nextLine();
                    System.out.println("Choisissez sa force:");
                    int weaponForce = Integer.parseInt(scannerInput.nextLine());
                    player.get(itemNum).addWeapon(weaponName, weaponForce);
                    System.out.println(player.get(itemNum).toString());
                }

                System.out.println("1-Creer un autre personnage 2-Voir la liste des personnages 3-Editer ce personnage");
                userChoice = scannerInput.nextLine();
                if(userChoice.equals("1")) {
                    itemNum++;
                    custom = false;
                } else if(userChoice.equals("2")){
                    System.out.println("//////////////////////");
                    for(int perso = 0; perso < player.size(); perso++){
                        System.out.println((player.get(perso)).toString());
                        System.out.println("-------------------------");
                    }
                    System.out.println("//////////////////////");
                }
            }
        } 
    }
}
