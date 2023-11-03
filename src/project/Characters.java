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
    private String classification;


    // Characters JDoe = new Characters("John doe", 400, 2.0, 100, "warrior");
    public Characters(String name, double critical, double power, double dodge, int health, String classification){
        this.name = name;
        this.critical = critical;
        this.power = power;
        this.dodge = dodge;
        this.health = health;
        this.classification = classification;

    }

//    public String toString(){
//        if (this.classification.equals("Assassin")){
//            return( this.name + " is a " + this.classification + ", meaning they have ");
//        }
//        if (this.classification.equals("Warrior")){
//            return( this.name + " is a " + this.classification + ", meaning they have ");
//        }
//        if (this.classification.equals("Mage")){
//            return( this.name + " is a " + this.classification + ", meaning they have ");
//        }
//        if (this.classification.equals("Tank")){
//            return( this.name + " is a " + this.classification + ", meaning they have ");
//        }
//        return("");
//    }


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

    public void setPower(double power) {
        this.power = power;
    }

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

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
}
