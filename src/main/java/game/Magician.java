package game;

public class Magician extends Personnage {
     
    public Magician() {
        
    }
    
    public Magician(String name) {
        
    }
    
    public Magician(String name, String url, int life, int attack) {
            
    }

    public String toString() {
        return "Type: Magician\n" +  
        "Name : " + this.name + "\n" +
        "Image : " + this.img + "\n" +
        "Life : " + this.life + "\n" +
        "Attack : " + this.attack + "\n" +
        "Arme 1 nom: " + this.arme[0] + "\n" +
        "Arme 1 force: " + this.force[0];
    }
}