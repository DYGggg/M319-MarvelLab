package project;

public class Abilities {
    //     set a character1 and a character2 variable to whom the user wants to fight
//     Characters character1 = new Characters("John doe", 400, 2.0, 100, "warrior");
//     take into account the characters' dodge, powerlevel, and health for math-ing the battles


    private double critical;
    private double power;
    private int dodge;
    private double isCritical;

    public Abilities(int dodge, double power, double critical, double isCritical){
        this.dodge = dodge;
        this.power = power;
        this.critical = critical;
        this.isCritical = isCritical;

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

    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }

    public double getIsCritical() {
        return isCritical;
    }

    public void setIsCritical(double isCritical) {
        this.isCritical = isCritical;
    }
}
