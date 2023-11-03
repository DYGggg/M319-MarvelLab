package project;

public class Abilities {
    //     set a character1 and a character2 variable to whom the user wants to fight
//     Characters character1 = new Characters("John doe", 400, 2.0, 100, "warrior");
//     take into account the characters' dodge, powerlevel, and health for math-ing the battles
    Characters aki = new Characters("A.K.I.", 2, 5.5, 0.4, 80, "Assassin");
    Characters ryu = new Characters("Ryu", 1, 5.0, 0.2, 100, "Warrior");
    Characters juri = new Characters("Juri Han", 3, 6.0, 0.4, 80, "Mage");
    Characters akuma = new Characters("Akuma", 1, 4.5, 0.4, 80, "Tank");


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
