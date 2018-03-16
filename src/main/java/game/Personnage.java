package game;

public abstract class Personnage {
    protected String name = "none";
    protected String img = "url";
    protected int life = 100;
    protected int attack = 10;
    

    public void setName(String userName) {
        this.name = userName;
    }

    public void setImg(String imageLink) {
        this.img = imageLink;
    }

    public String getName() {
        return this.name;
    }

    public int getLife() {
        return this.life;
    }

    public void decreaseLife(int attackPower) {
        this.life -= attackPower;
        if (this.life < 0) {
            this.life =  0;
        } 
    }

    public void increaseLife(int energy) {
        this.life += energy; 
        if (this.life > 100) {
            this.life = 100;
        }
    }
}