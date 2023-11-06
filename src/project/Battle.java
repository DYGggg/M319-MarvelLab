package project;

import java.util.Scanner;

public class Battle {

    public String mainBattle() {
        //methods of the battles go here, like the Start battle method that takes 2 characters,
        //a method to do turns of damage
        return "char1 wins! Battle stats:"; // two columns of char1 and char2 damage delt, attacks dodged, etc
    }

    public String turn(Characters mainChar, Characters attacking){
        //mainChar is the character getting attacked/damage delt to
        //attacking is the attacking character, required for their damage and critical stats

        double mainDamage = (Math.random() * (attacking.power)+1);
        if ((Math.random() * 10)+1){

            boolean isCritical = true;
        }
        return ("test attack");
    };


    // ASSASSIN : A.K.I
    // WARRIOR : RYU
    // MAGE : JURI HAN
    // TANK : AKUMA

//    ASSASSIN   DODGE: 0.4   POWER: 5.5  CRITICAL: 20 HEALTH: 80   CRITICAL CHANCE: 3.5
//    WARRIOR    DODGE: 0.2   POWER: 5.0  CRITICAL: 15 HEALTH: 100  CRITICAL CHANCE: 1.5
//    MAGE       DODGE: 0.2   POWER: 6.0  CRITICAL: 25 HEALTH: 70   CRITICAL CHANCE: 4.0
//    TANK       DODGE: 0.1   POWER: 4.5  CRITICAL: 15 HEALTH: 140  CRITICAL CHANCE: 1.0

}
