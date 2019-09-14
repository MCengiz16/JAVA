package RollDice;

public class RollDice {
    private int dice=6;

    public int getDice() {
        return dice;
    }

    public int roll(){
        dice = (int)(Math.random()*(dice-1+1))+1;

        return dice;
    }
}
