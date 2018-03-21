package game;

public class Warrior extends Personnage {
    Weapon armes = new Weapon();

    public Warrior() {
    
    }

    public Warrior(String name) {
        this.setName(name);
    }

    public Warrior(String name, String url, int life, int attack, Weapon arme) {
        this.setName(name);
        this.setImg(url);
        this.setLife(life);
        this.setAttack(attack);
        this.setArmes(arme);
    }


    public void setArmes(Weapon arme) {
        this.armes = arme;
    }

    public String getArmes() {
        return this.armes.getName();
    }

    public String toString() {
        return "WARRIOR: \n" + super.toString() + this.armes.toString();
    }
}