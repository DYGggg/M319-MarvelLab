package project;

import java.util.Scanner;

public class Battle {

    public String mainBattle() {
        //methods of the battles go here, like the Start battle method that takes 2 characters,
        //a method to do turns of damage
        return "char1 wins! Battle stats:"; // two columns of char1 and char2 damage delt, attacks dodged, etc
    }

    public void turn(Characters mainChar, Characters attacking) {
        //mainChar is the character getting attacked/damage dealt to
        //attacking is the attacking character, required for their damage and critical stats
        double mainDamage = ((Math.random() * 5) + 6) * attacking.getPower();
        double critical_damage = attacking.getCritical();
        if ((attacking.getIsCritical() * 10) <= (Math.random() * 10) + 1) {

            mainDamage = mainDamage * critical_damage/10;
            System.out.println(attacking.getName() + "Dealt " + mainDamage + " damage to " + mainChar.getName());
        }
        double is_dodged = (int)(Math.random()*101);
        if(mainChar.getName().equals("A.K.I.") && is_dodged <= 40){
            mainDamage = 0;
            System.out.println("Hit dodged");
        }
        else if (mainChar.getName().equals("Ryu") && is_dodged <= 20) {
            mainDamage = 0;
            System.out.println("Hit dodged");
        }
        else if (mainChar.getName().equals("Juri Han") && is_dodged <= 20) {
            mainDamage = 0;
            System.out.println("Hit dodged");
        }
        else if (mainChar.getName().equals("Akuma") && is_dodged <= 10) {
            mainDamage = 0;
            System.out.println("Hit dodged");
        }

        double health_main = mainChar.getHealth() - mainDamage;
        mainChar.setHealth(health_main);
        System.out.println(mainChar.getName() + " Remaining health: " + mainChar.getHealth());
        System.out.println(attacking.getName() + "Remaining health: " + attacking.getHealth());
        System.out.println("Round Over");
    };


    // ASSASSIN : A.K.I
    // WARRIOR : RYU
    // MAGE : JURI HAN
    // TANK : AKUMA

//    ASSASSIN   DODGE: 40   POWER: 7.5  CRITICAL: 20 HEALTH: 80   CRITICAL CHANCE: 3.5
//    WARRIOR    DODGE: 20   POWER: 7.0  CRITICAL: 15 HEALTH: 100  CRITICAL CHANCE: 1.5
//    MAGE       DODGE: 20   POWER: 8.0  CRITICAL: 25 HEALTH: 70   CRITICAL CHANCE: 4.0
//    TANK       DODGE: 10   POWER: 6.5  CRITICAL: 15 HEALTH: 140  CRITICAL CHANCE: 1.0

}
