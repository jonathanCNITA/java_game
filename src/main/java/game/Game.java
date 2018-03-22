package game;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

       private static Scanner scannerInput = new Scanner(System.in);
       private static ArrayList<Personnage> players = new ArrayList<Personnage>();
       private static Boolean playGame = true;
       private static Boolean updatePersonnage = false;
       private static int indexPersonnage = 0;
       private static int life, attack, type = 0;
       private static String nom, img;
       private static Weapon w;
       private static Sort s;

    public static void main(String[] args) 
    {
        
        while ( playGame ) 
        {
            createPersonnage();
            if (updatePersonnage) 
            {
                modifPersonnage();
            }
            suite();
        }
    }

    private static void showPlayers(ArrayList listOfObject) 
    {
        System.out.println("//////////////////////");
        System.out.println("Nombre de personnages: " + listOfObject.size());
        for(int i = 0; i < listOfObject.size(); i++) 
        {
            System.out.println("Numero ref: " + i);
            System.out.println((listOfObject.get(i)));
            System.out.println("-------------------------");
        }

        System.out.println("//////////////////////");
    }

    private static void suite()
    {
        Boolean options = true;
        while ( options ) 
        {
            System.out.println("Que voulez vous faire ensuite?\n1 Creér un autre personnage\n2 Lister tous les personnages\n3 Modifier un personnage\n4 Quitter le jeu");
            int choice = Integer.parseInt(scannerInput.nextLine());
            if (choice == 1) 
            {
                options = false;
            } 
            else if (choice == 2) 
            {
                showPlayers(players);
            } 
            else if (choice == 3) 
            {
                System.out.println("Saisir le numero du personnage à modifier:");
                indexPersonnage = Integer.parseInt(scannerInput.nextLine());
                if(players.get(indexPersonnage) instanceof Warrior) 
                {
                    type = 1;
                } 
                else 
                {
                    type = 2;
                }
                if (indexPersonnage < players.size()) {
                    updatePersonnage = true;
                    options = false;
                }
            } 
            else if (choice == 4) 
            {
                System.out.println("A bientot!");
                options  = false;
                playGame = false;
            }
        }
    }

    private static void createPersonnage()
    {
        if (!updatePersonnage) 
        {
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

        if(type == 1) 
        {
            System.out.println("Choisissez un nom d'arme:");
            String nomArme = scannerInput.nextLine();
            
            System.out.println("Choisissez un power de l'arme :");
            int power = scannerInput.nextInt();
            scannerInput.nextLine();
    
            w = new Weapon(nomArme, power);
            if (!updatePersonnage) 
            {
                players.add(new Warrior(nom, img, life, attack, w));
            }
        } 
        else if (type == 2)
        {
            System.out.println("Choisissez un nom de sort:");
            String nomSort = scannerInput.nextLine();
            
            System.out.println("Choisissez un power de l'arme :");
            int powerSort = scannerInput.nextInt();
            scannerInput.nextLine();
    
            s = new Sort(nomSort, powerSort);
            if (!updatePersonnage) 
            {
                players.add(new Magician(nom, img, life, attack, s));
            }
        }
    }

    private static void modifPersonnage()
    {
        players.get(indexPersonnage).setName(nom);
        players.get(indexPersonnage).setImg(img);
        players.get(indexPersonnage).setLife(life);
        players.get(indexPersonnage).setAttack(attack);
        if(type == 1) 
        {
           ((Warrior)players.get(indexPersonnage)).setArmes(w);
            updatePersonnage = false;
            System.out.println("Votre personnage à été modifié");
        }
    }
}
