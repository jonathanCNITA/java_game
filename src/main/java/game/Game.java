package game;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    
    public static void main(String[] args) {
        
        Scanner scannerInput = new Scanner(System.in);
        ArrayList<Personnage> player = new ArrayList<Personnage>();
        


        

        
    }

    static void ShowPlayers(ArrayList listOfObject) {
        System.out.println("//////////////////////");

        for(int i = 0; i < listOfObject.size(); i++) {
        System.out.println((listOfObject.get(i)).getClass().getName());
        System.out.println((listOfObject.get(i)).toString());
        System.out.println("-------------------------");
        }

        System.out.println("//////////////////////");
    }

}
