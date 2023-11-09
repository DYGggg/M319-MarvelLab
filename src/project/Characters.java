package project;

public class Characters {
    // ASSASSIN : A.K.I
    // WARRIOR : RYU
    // MAGE : JURI HAN
    // TANK : AKUMA
    private String name;
    private double health;

    private Abilities powers;

    private static String AKI_des = "1 - AKI * Assassin: higher damage, dodge chance, and critical chance at a cost of lower health";
    private static String RYU_des = "2 - RYU * Warrior: balanced between health, dodge, critical chance, and damage ";
    private static String JURI_des = "3 - JURI HAN * Mage: high damage,and critical chance at a cost of low health and low dodge chance";
    private static String AKUMA_des = "4 - AKUMA * Tank: increased health in exchange for low dodge chance, and critical chance";


    // Characters JDoe = new Characters("John doe", 400, 2.0, 100, "warrior");
    public Characters(String name, double health, Abilities anAbility){
        this.name = name;
        this.powers = anAbility;
        this.health = health;


    }

    public Abilities getPowers() {
        return powers;
    }

    public void setPowers(Abilities powers) {
        this.powers = powers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }


    public static String getAKI_des() {
        return AKI_des;
    }

    public static String getRYU_des() {
        return RYU_des;
    }

    public static String getJURI_des() {
        return JURI_des;
    }

    public static String getAKUMA_des() {
        return AKUMA_des;
    }
}
