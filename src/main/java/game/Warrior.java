package game;

public class Warrior extends Personnage {
  
    Warrior(String newName) {
        System.out.println("New warrior created");
        this.setName(newName);
        System.out.println("New warrior name created");
    }
}