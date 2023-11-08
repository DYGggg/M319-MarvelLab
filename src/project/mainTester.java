package project;

import java.nio.file.CopyOption;
import java.util.Scanner;

public class mainTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your fighter(1-4) ...");
        System.out.println(Abilities.getAKI_des());
        System.out.println(Abilities.getRYU_des());
        System.out.println(Abilities.getJURI_des());
        System.out.println(Abilities.getAKUMA_des());
        int selected_fighter = input.nextInt();
        System.out.print("Your opponent will be...");



//        System.out.print("USER: " + selected_fighter + "\nBOT : " );

    }

    public Characters setOpponent(int opponent){
        int opponentNum = ((opponent %4) +1);
        if(opponent == 1){
//            return Abilities.getAki();
        }
        else if(opponent ==2){

        } else if (opponent == 3) {


        }
        else {

        }
    }


}
