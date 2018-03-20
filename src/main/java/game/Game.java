package game;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    public static void main(String[] args) {
        
        Scanner scannerInput = new Scanner(System.in);
        ArrayList<Personnage> player = new ArrayList<Personnage>();
        String userChoice;
        
        Boolean game = true;
        Integer itemNum = 0;


        while(game) {
            
            System.out.println("Choisissez un personnage !" +"(" + player.size() + ")");
            System.out.println("1 -Warrior 2 -Magician");
            userChoice = scannerInput.nextLine();

            if(userChoice.equals("1") ) {
                player.add(new Warrior());
                System.out.println("new warrior created.");
            } else if(userChoice.equals("2") ){
                player.add(new Magician());
                System.out.println("new magician created.");
            } else {
                System.out.println("Aucun type de personnage selectioné");
            }
            Boolean customPerso = true;
            while(customPerso){
                System.out.println("Choisissez une option !\n1-Voir 2-Modifier 3-Attaquer 4-ajouter une arme");
                userChoice = scannerInput.nextLine();
            
                if(userChoice.equals("1")){
                    System.out.println(player.get(itemNum).toString());
                } else if (userChoice.equals("2")) {

                    System.out.println("Choisissez un nom:");
                    player.get(itemNum).setName(scannerInput.nextLine());
            
                    System.out.println("Choisissez une image (lien Url):");
                    player.get(itemNum).setImg(scannerInput.nextLine());
            
                    System.out.println("Choisissez votre niveau de vie:");
                    player.get(itemNum).setLife(Integer.parseInt(scannerInput.nextLine()));
            
                    System.out.println("Choisissez votre force d'attaque:");
                    player.get(itemNum).setAttack(Integer.parseInt(scannerInput.nextLine()));

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
                    customPerso = false;
                } else if(userChoice.equals("2")) {
                    ShowPlayers(player);
                }
            }
        } 
    }


    static void ShowPlayers(ArrayList playerList) {
        System.out.println("//////////////////////");

        for(int i = 0; i < playerList.size(); i++) {
            System.out.println((playerList.get(i)).getClass().getName());
            System.out.println((playerList.get(i)).toString());
            System.out.println("-------------------------");
        }

        System.out.println("//////////////////////");
    }

}
