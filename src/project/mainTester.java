package project;

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
        System.out.println("Your opponent will be...");

    }
}
