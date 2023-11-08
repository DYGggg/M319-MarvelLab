package project;

public class Abilities {
    //     set a character1 and a character2 variable to whom the user wants to fight
//     Characters character1 = new Characters("John doe", 400, 2.0, 100, "warrior");
//     take into account the characters' dodge, powerlevel, and health for math-ing the battles



    private static String AKI_des = "1 - AKI * Assassin: higher damage, dodge chance, and critical chance at a cost of lower health";
    private static String RYU_des = "2 - RYU * Warrior: balanced between health, dodge, critical chance, and damage ";
    private static String JURI_des = "3 - JURI HAN * Mage: high damage,and critical chance at a cost of low health and low dodge chance";
    private static String AKUMA_des = "4 - AKUMA * Tank: increased health in exchange for low dodge chance, and critical chance";


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

    public Characters getAki() {
        return aki;
    }

    public void setAki(Characters aki) {
        this.aki = aki;
    }

    public Characters getRyu() {
        return ryu;
    }

    public void setRyu(Characters ryu) {
        this.ryu = ryu;
    }

    public Characters getJuri() {
        return juri;
    }

    public void setJuri(Characters juri) {
        this.juri = juri;
    }

    public Characters getAkuma() {
        return akuma;
    }

    public void setAkuma(Characters akuma) {
        this.akuma = akuma;
    }
}
