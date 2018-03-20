/**
 * Personnage est une classe 'abstract' elle defifinit les attributs commun 
 * des personnages du jeu :
 * <ul>
 * <li>name: nom du personnage</li>
 * <li>img: lien vers l'image du personnage</li>
 * <li>life: nombre de points de vie du personnage</li>
 * <li>attack: Puissance d'attaque du personnage</li>
 * </ul>
 * 
 * </p>
 * Le setter setLife prend soin de mettre des valeurs cohérentes afin d'éviter des combats impossibles
 * </p>
 * @author jonathanCNITA
 * @version 1
 */

package game;

public abstract class Personnage {
    protected String name = "none";
    protected String img = "No image ref";
    protected int life = 100;
    protected int attack = 10;
    protected String[] arme = new String[3];
    protected int[] force = new int[3];
    protected int armIndex = 0;
    
    /** 
     * method 'setter' qui modifie le nom du personnage 
     */
    public void setName(String userName) {
        this.name = userName;
    }

    /** 
     * method 'getter' qui retourne le nom du personnage 
     */
    public String getName() {
        return this.name;
    }

    public void setImg(String imageLink) {
        this.img = imageLink;
    }

    public String getImage() {
        return this.img;
    }
    
    public void setLife(int newLife) {
        if (newLife > 100) {
            newLife = 100;
        } else if (newLife < 1) {
            newLife = 1;
        }
        this.life = newLife;
    }

    public int getLife() {
        return this.life;
    }

    public void setAttack(int newAttack) {
        this.attack = newAttack;
    }

    public int getAttack() {
        return this.attack;
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

    public String toString() {
        return "Name : " + this.name + "\n" +
        "Image : " + this.img + "\n" +
        "Life : " + this.life + "\n" +
        "Attack : " + this.attack + "\n" +
        "Arme 1 nom: " + this.arme[0] + "\n" +
        "Arme 1 force: " + this.force[0];
    }

    public void addWeapon(String weaponName, int weaponPower) {
        this.arme[armIndex] = weaponName;
        this.force[armIndex] = weaponPower;
        armIndex++;
        if (armIndex > 3) {
            armIndex = 0;
            System.out.println("Vous avez Ateint le maximum d'armes");
        }
    }

}