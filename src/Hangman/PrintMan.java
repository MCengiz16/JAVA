package Hangman;

public class PrintMan {
    static void printMan(int count) {
        switch (count) {
            case 0 :
                System.out.println();

                break;
            case 1:
                System.out.println();
                System.out.println("\n" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n");
                break;
            case 2:

            System.out.println("\n_________" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n");
            break;
            case 3:

            System.out.println("\n_________" + "\n|        |" + "\n|" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n");
            break;
            case 4:

                System.out.println("\n_________" + "\n|        |" + "\n|        O" + "\n|" + "\n|" + "\n|" + "\n|_______________________\n");
                break;
            case 5:

                System.out.println("\n_________" + "\n|        |" + "\n|        O" + "\n|        |" + "\n|" + "\n|" + "\n|_______________________\n");
                break;
            case 6:

                System.out.println("\n_________" + "\n|        |" + "\n|        O" + "\n|     ---|" + "\n|" + "\n|" + "\n|_______________________\n");
                break;
            case 7:

                System.out.println("\n_________" + "\n|        |" + "\n|        O" + "\n|     ---|---" + "\n|" + "\n|" + "\n|_______________________\n");
                break;
            case 8:

                System.out.println("\n_________" + "\n|        |" + "\n|        O" + "\n|     ---|---" + "\n|       /" + "\n|      /" + "\n|_______________________\n");
                break;
            case 9:

                System.out.println("\n___________" + "\n|         |" + "\n|         O" + "\n|      ---|---" + "\n|        /"+" \\"   +  "\n|      /"+"     \\"    + "\n|_______________________" + "");
                break;


        }




    }
}
