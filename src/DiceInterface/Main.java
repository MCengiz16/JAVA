package DiceInterface;

import RollDice.RollDice;

public class Main {
    public static void main(String[] args) {
        rollDices  myDice =new rollDices(6,0);
        myDice.roll();
        myDice.rollTwice();
        myDice.rollTriple();


    }
}
