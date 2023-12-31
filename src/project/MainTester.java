package project;

import java.util.Scanner;

public class MainTester {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your fighter(1-4) ...");
        System.out.println(Characters.getAKI_des());
        System.out.println(Characters.getRYU_des());
        System.out.println(Characters.getJURI_des());
        System.out.println(Characters.getAKUMA_des());
        int selected_fighter = input.nextInt();



        Abilities assassin = new Abilities(40, 3.5, 20.0, 2.5);
        Abilities warrior = new Abilities(20, 3.0, 15.0, 1.5);
        Abilities mage = new Abilities(10, 4.0, 25.0, 3.0);
        Abilities tank = new Abilities(10, 1.5, 15.0, 1.0);

        Characters aki =  new Characters("AKI",80, assassin);
        Characters ryu =  new Characters("RYU", 100 ,warrior);
        Characters juri =  new Characters("JURI HAN", 70 , mage);
        Characters akuma =  new Characters("AKUMA", 140, tank);

        Characters bot_aki =  new Characters("AKI",80, assassin);
        Characters bot_ryu =  new Characters("RYU", 100 ,warrior);
        Characters bot_juri =  new Characters("JURI HAN", 70 , mage);
        Characters bot_akuma =  new Characters("AKUMA", 140, tank);


        Characters player = ryu;
        Characters bot = bot_ryu;

        int bot_select = (int)(Math.random() *4 +1);


        //BOT MODIFY
        //int bot_select = 3;

        if(selected_fighter == 1){
            player = aki;
        }
        else if (selected_fighter == 2){
            player = ryu;
        }
        else if (selected_fighter == 3){
            player = juri;
        }
        else if (selected_fighter == 4){
            player = akuma;
        }




        if(bot_select == 1){
            bot = bot_aki;
        }
        else if (bot_select == 2){
            bot = bot_ryu;
        }
        else if (bot_select == 3){
            bot = bot_juri;
        }
        else if (bot_select == 4){
            bot = bot_akuma;
        }

        System.out.println("your opponent is: " + bot.getName() + "\n\nPress the enter key to continue the battle");
        input.nextLine();
        input.nextLine();
        boolean isOver = false;
        while(!isOver){
            if (player.getHealth() > 0 && bot.getHealth() > 0){
                turn(player, bot);
                System.out.println();
                input.nextLine();
            }
            if (player.getHealth() > 0 && bot.getHealth() > 0){
                turn(bot, player);
                System.out.println();
                input.nextLine();
            }
            else if (player.getHealth() <= 0) {
                System.out.println("Bot (" + bot.getName() + ") wins!");
                isOver = true;
                System.out.println("Total damage dealt: " + player.getTotalDamage());
                System.out.println("Total dodged attacks: " + player.getTotalHits());
                System.out.println("Total amount of criticals: " + player.getTotalCritical());
            } else if (bot.getHealth() <= 0) {
                System.out.println("Player (" + player.getName() + ") wins!");
                isOver = true;
                System.out.println("Total damage dealt: " + player.getTotalDamage());
                System.out.println("Total dodged attacks: " + player.getTotalHits());
                System.out.println("Total amount of criticals: " + player.getTotalCritical());

            }

        }



//        System.out.print("USER: " + selected_fighter + "\nBOT : " );

    }

    public static void turn(Characters mainChar, Characters attacking) {
        //mainChar is the character getting attacked/damage dealt to
        //attacking is the attacking character, required for their damage and critical stats
        double mainDamage = ((Math.random() * 5) + 6) * attacking.getPowers().getPower();
        mainDamage = Math.round(mainDamage * 100.0)/100.0;
        double critical_damage = attacking.getPowers().getCritical();
        boolean criticalBool = (((Math.random() * 100) + 1) <= (attacking.getPowers().getIsCritical() * 10));



        double is_dodged = (int)(Math.random()*101);
        if(mainChar.getName().equals("AKI") && is_dodged <= 40){
            mainDamage = 0;
            System.out.println("Hit dodged");
            mainChar.addTotalHits();
        }
        else if (mainChar.getName().equals("RYU") && is_dodged <= 20) {
            mainDamage = 0;
            System.out.println("Hit dodged");
            mainChar.addTotalHits();
        }
        else if (mainChar.getName().equals("JURI HAN") && is_dodged <= 20) {
            mainDamage = 0;
            System.out.println("Hit dodged");
            mainChar.addTotalHits();
        }
        else if (mainChar.getName().equals("AKUMA") && is_dodged <= 10) {
            mainDamage = 0;
            System.out.println("Hit dodged");
            mainChar.addTotalHits();
        }
        else {
            if (criticalBool){
                mainChar.addTotalCritical();
                mainDamage = mainDamage * critical_damage/10;
                mainDamage = Math.round(mainDamage * 100.0)/100.0;
                System.out.println(attacking.getName() + " Dealt " + mainDamage + " critical damage to " + mainChar.getName());
            }
            else{
                System.out.println(attacking.getName()+ " Dealt " + mainDamage + " damage to " + mainChar.getName());
            }
        }



        double health_main = mainChar.getHealth() - Math.round(mainDamage * 100.0)/100.0;
        mainChar.setHealth(health_main);
        mainChar.addTotalDamage(Math.round(mainDamage * 100.0)/100.0);
        if (mainChar.getHealth() <= 0){
            mainChar.setHealth(0);
        }


        System.out.println(mainChar.getName() + " Remaining health: " + Math.round(mainChar.getHealth() * 100.0)/100.0);
        System.out.println(attacking.getName() + " Remaining health: " + Math.round(attacking.getHealth() * 100.0)/100.0);
        System.out.println("Round Over");
    };
}