package game;

public class Warrior extends Personnage {
    Weapon arme = new Weapon();

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


    public void setArmes(Weapon newWeapon) {
        this.arme = newWeapon;
    }

    public String getArmes() {
        return this.arme.getName();
    }

    public String toString() {
        return "WARRIOR: \n" + super.toString() + this.arme.toString();
    }
}