package game;

public class Warrior extends Personnage {
    Weapon[] armes = new Weapon[3];

    public Warrior() {
    
    }

    public Warrior(String name) {
        this.setName(name);
    }

    public Warrior(String name, String url, int life, int attack) {
        this.setName(name);
        this.setImg(url);
        this.setLife(life);
        this.setAttack(attack);
    }

    public String toString() {
        return "WARRIOR: \n" + super.toString();
    }
}