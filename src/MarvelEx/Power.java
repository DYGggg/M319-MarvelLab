package MarvelEx;

public class Power {
    private int powerlevel;
    private String powername;


    public Power(String apower, int thelevel){
        powerlevel = thelevel;
        powername = apower;
    }

    public int getPowerlevel() {
        return powerlevel;
    }

    public void setPowerlevel(int powerlevel) {
        this.powerlevel = powerlevel;
    }

    public String getPowername() {
        return powername;
    }

    public void setPowername(String powername) {
        this.powername = powername;
    }
}
