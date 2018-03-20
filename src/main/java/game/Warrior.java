package game;

public class Warrior extends Personnage {
    Weapon[] armes = new Weapon[3];

    public Warrior() {
    
    }

    public Warrior(String name) {
        this.setName(name);
    }

    public Warrior(String name, String imageLink, int newLife, int newAttack) {
        this.setName(name);
        this.setImg(imageLink);
        this.setLife(newLife);
        this.setAttack(newAttack);
    }

    public String toString() {
        return "Type: Warrior\n" +  
        "Name : " + this.name + "\n" +
        "Image : " + this.img + "\n" +
        "Life : " + this.life + "\n" +
        "Attack : " + this.attack + "\n" +
        "Arme 1 nom: " + this.arme[0] + "\n" +
        "Arme 1 force: " + this.force[0];
    }
}