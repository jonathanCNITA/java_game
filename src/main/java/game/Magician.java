package game;

public class Magician extends Personnage {
    Sort sort = new Sort();

    public Magician() {
        
    }
    
    public Magician(String name) {
        this.setName(name);
    }
    
    public Magician(String name, String url, int life, int attack) {
        this.setName(name);
        this.setImg(url);
        this.setLife(life);
        this.setAttack(attack);
    }

    public String toString() {
        return "MAGICIAN: \n" + super.toString() + this.sort.toString();
    }
}