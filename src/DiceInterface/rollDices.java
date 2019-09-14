package DiceInterface;

public class rollDices implements Dices {
    private int faces;
    private int result;

    public rollDices(int faces, int result) {
        this.faces = faces;
        this.result = result;
    }

    public int getFaces() {
        return faces;
    }

    public int getResult() {
        return result;
    }



    public void roll(){
        result = (int)(Math.random()*(faces-1+1))+1;

        System.out.println(result);
    }
    public void rollTwice(){
        for(int i=0;i<2;i++) {
            result = (int) (Math.random() * (faces - 1 + 1)) + 1;

            System.out.print(result+"/");
        }
        System.out.println();
    }
    public void rollTriple(){
        for(int i=0;i<3;i++) {
            result = (int) (Math.random() * (faces - 1 + 1)) + 1;

            System.out.print(result+"/");
        }
        System.out.println();
    }
}

