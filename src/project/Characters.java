package project;

public class Characters {
    // ASSASSIN : A.K.I
    // WARRIOR : RYU
    // MAGE : JURI HAN
    // TANK : AKUMA
    private String name;
    private int powerLevel;
    private double dodge;
    private int health;
    private String classification;


    // Characters JDoe = new Characters("John doe", 400, 2.0, 100, "warrior");
    public Characters(String name, int powerLevel, double dodge, int health, String classification){
        this.name = name;
        this.powerLevel = powerLevel;
        this.dodge = dodge;
        this.health = health;
        this.classification = classification;

    }
}
