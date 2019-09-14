public class switchStringToNumber  {
    public static void main(String[] args) {
        String number="nine";
        int numberint=0;

        switch(number){
            case "one": numberint=1;
                break;
            case "tw0":numberint=2;
                break;
            case "three":numberint=3;
                break;
            case "four":numberint=4;
                break;
            case "five":numberint=5;
                break;
            case "six":numberint=6;
                break;
            case "seven":numberint=7;
                break;
            case "eight":numberint=8;
                break;
            case "nine":numberint=9;
                break;
            case "ten":numberint=10;
                break;

            default:
                System.out.println("Invalid");
                break;


        }
        System.out.println(numberint);
    }
}