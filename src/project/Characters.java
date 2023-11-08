package project;

public class Characters {
    // ASSASSIN : A.K.I
    // WARRIOR : RYU
    // MAGE : JURI HAN
    // TANK : AKUMA
    private String name;
    private double critical;
    private double power;
    private int dodge;
    private double health;
    private double isCritical;
//    private String classification;


    // Characters JDoe = new Characters("John doe", 400, 2.0, 100, "warrior");
    public Characters(String name, int dodge, double power, double critical, double health, double isCritical){
        this.name = name;
        this.dodge = dodge;
        this.power = power;
        this.critical = critical;
        this.health = health;
        this.isCritical = isCritical;

    }

    public double getIsCritical() {return isCritical;}

    public void setIsCritical(double isCritical) {this.isCritical = isCritical;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCritical() {
        return critical;
    }

    public void setCritical(double critical) {
        this.critical = critical;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {this.power = power;}

    public double getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }


    Characters aki = new Characters("A.K.I.", 40, 7.5, 20.0, 80, 3.5);
    Characters ryu = new Characters("Ryu", 20, 7.0, 15.0, 100, 1.5);
    Characters juri = new Characters("Juri Han", 20, 8.0, 25.0, 70, 4.0);
    Characters akuma = new Characters("Akuma", 10, 6.5, 15.0, 140, 1.0);
}
