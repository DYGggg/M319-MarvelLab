package MarvelEx;

public class MarvelMovieTester {
    public static void main(String[] args) {
        Power webslinger = new Power("Slings webs", 80);
        MarvelCharacter spiderman = new MarvelCharacter("Spiderman", webslinger, true);

        MarvelCharacter milesMorales = new MarvelCharacter("Miles Morales", webslinger, true);

        Power grenades = new Power("Pew pew kaboom", 40);
        MarvelCharacter greenGoblin = new MarvelCharacter("Green Goblin", grenades, false);


        System.out.println(spiderman);
        //System.out.println(greenGoblin);
        System.out.println(milesMorales);
        int amtToAdd = 15;
        System.out.println("Adding " + amtToAdd + "...");
        doublePower(webslinger, amtToAdd);

        //battle(spiderman, greenGoblin);
        System.out.println(spiderman);
        //System.out.println(greenGoblin);
        System.out.println(milesMorales);
    }


    public static void battle(MarvelCharacter char1, MarvelCharacter char2){
        int char1damage = (int)(Math.random() * char1.getSpecialPower().getPowerlevel()+1);
        int char2damage = (int)(Math.random() * char2.getSpecialPower().getPowerlevel()+1);

        char1.setHealth(char1.getHealth() - char2damage);
        char2.setHealth(char2.getHealth() - char1damage);

        System.out.println(char1.getName() + " Health: " + char1.getHealth());
        System.out.println(char2.getName() + " Health: " + char2.getHealth());
    }


    public static void doublePower(Power p, int val){
        int oldPower = p.getPowerlevel();
        val++;
        p.setPowerlevel(oldPower + val);

    }
}
