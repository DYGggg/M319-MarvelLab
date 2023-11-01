package U5_Classes.MarvelEx;

public class MarvelCharacter {
    private String name;
    private Power specialPower;

    private boolean isHero;
    private int health;

    public MarvelCharacter(String aname, Power apower, boolean ahero){
        name = aname;
        specialPower = apower;
        isHero = ahero;
        health = 100;
    }

    public String toString() {
        //spiderman, Slings webs: 7, hero
        if (isIsHero()){
            return (getName() + ", " + specialPower.getPowername() + ": " + specialPower.getPowerlevel() + ", Hero");
        }
        else{
            return (getName() + ", " + specialPower.getPowername() + ": " + specialPower.getPowerlevel() + ", Villain");
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(Power specialPower) {
        this.specialPower = specialPower;
    }

    public boolean isIsHero() {
        return isHero;
    }

    public void setIsHero(boolean isHero) {
        this.isHero = isHero;
    }
}
