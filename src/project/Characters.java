package project;

public class Characters {
    // ASSASSIN : A.K.I
    // WARRIOR : RYU
    // MAGE : JURI HAN
    // TANK : AKUMA
    private String name;
    private double critical;
    public double power;
    private double dodge;
    private int health;
    private double isCritical;
//    private String classification;


    // Characters JDoe = new Characters("John doe", 400, 2.0, 100, "warrior");
    public Characters(String name, double dodge, double power, double critical, int health, double isCritical){
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

    public void setDodge(double dodge) {
        this.dodge = dodge;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



}
