package poker.round;

public class Action {
    private boolean bet;
    private boolean check;
    private boolean fold;


    public boolean getBet(){
        return bet;
    }

    public void setBet(boolean bet){
        this.bet = bet;
    }

    public boolean getCheck(){
        return check;
    }

    public void setCheck(boolean check){
        this.check = check;
    }
}
