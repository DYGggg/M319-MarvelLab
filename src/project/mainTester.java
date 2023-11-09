package project;

import java.nio.file.CopyOption;
import java.util.Scanner;

public class mainTester {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose your fighter(1-4) ...");
        System.out.println(Characters.getAKI_des());
        System.out.println(Characters.getRYU_des());
        System.out.println(Characters.getJURI_des());
        System.out.println(Characters.getAKUMA_des());
        int selected_fighter = input.nextInt();
        System.out.println(Battle.turn());


//        System.out.print("USER: " + selected_fighter + "\nBOT : " );

    }

    public void start(){
        //Battle.init();
    }
}
