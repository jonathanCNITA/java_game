package game;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {
        
        Scanner scannerInput = new Scanner(System.in);
        ArrayList<Personnage> players = new ArrayList<Personnage>();
        Boolean playGame = true;
        Boolean modifyPlayer = false;
        int playerToModify = 0;
        int life, attack, type = 0;
        String nom, img;
        
        while ( playGame ) {
            if (!modifyPlayer) {
                System.out.println("Créer un type de personnage:\n1 Guerrier\n2 Magicien");
                type = Integer.parseInt(scannerInput.nextLine());
            }
            
            System.out.println("Choisissez un nom:");
            nom = scannerInput.nextLine();
            
            System.out.println("Choisissez une image:");
            img = scannerInput.nextLine();

            System.out.println("Choisissez vos points de vie:");
            life = Integer.parseInt(scannerInput.nextLine());

            System.out.println("Choisissez votre force d'attaque:");
            attack = Integer.parseInt(scannerInput.nextLine());

            if (modifyPlayer) {
                players.get(playerToModify).setName(nom);
                players.get(playerToModify).setImg(img);
                players.get(playerToModify).setLife(life);
                players.get(playerToModify).setAttack(attack);
                System.out.println("Votre personnage à été modifié");
            } else if(type == 1) {
                players.add(new Warrior(nom, img, life, attack));
            } else if (type == 2) {
                players.add(new Magician(nom, img, life, attack));
            }

            Boolean options = true;
            while ( options ) {
                System.out.println("Que voulez vous faire ensuite?\n1 Creér un autre personnage\n2 Lister tous les personnages\n3 Modifier un personnage\n4 Quitter le jeu");
                int choice = Integer.parseInt(scannerInput.nextLine());
                if (choice == 1) {
                    options = false;
                } else if (choice == 2) {
                    showPlayers(players);
                } else if (choice == 3) {
                    modifyPlayer = true;
                    options = false;
                    System.out.println("Saisir le numero du personnage à modifier:");
                    playerToModify = Integer.parseInt(scannerInput.nextLine());
                } else if (choice == 4) {
                    System.out.println("A bientot!");
                    options  = false;
                    playGame = false;
                }
            }
        }
    }

    static void showPlayers(ArrayList listOfObject) {
        System.out.println("//////////////////////");
        System.out.println("Nombre de personnages: " + listOfObject.size());
        for(int i = 0; i < listOfObject.size(); i++) {
        System.out.println((listOfObject.get(i)).toString());
        System.out.println("-------------------------");
        }

        System.out.println("//////////////////////");
    }

}
