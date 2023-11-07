package project;

public class Abilities {
    //     set a character1 and a character2 variable to whom the user wants to fight
//     Characters character1 = new Characters("John doe", 400, 2.0, 100, "warrior");
//     take into account the characters' dodge, powerlevel, and health for math-ing the battles
    Characters aki = new Characters("A.K.I.", 0.4, 7.5, 20.0, 80, 3.5);
    Characters ryu = new Characters("Ryu", 0.2, 7.0, 15.0, 100, 1.5);
    Characters juri = new Characters("Juri Han", 0.2, 8.0, 25.0, 70, 4.0);
    Characters akuma = new Characters("Akuma", 0.1, 6.5, 15.0, 140, 1.0);

    private static String AKI_des = "1 - AKI * Assassin: higher damage, dodge chance, and critical chance at a cost of lower health";
    private static String RYU_des = "2 - RYU * Warrior: balanced between health, dodge, critical chance, and damage ";
    private static String JURI_des = "3 - JURI HAN * Mage: high damage,and critical chance at a cost of low health and low dodge chance";
    private static String AKUMA_des = "4 - AKUMA * Tank: increased health in exchange for low dodge chance, adn critical chance";


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
