package DataStructure;

import java.util.*;

class ReverseWords {
    public static void main(String[] args) {

        Stack<Character> myStack = new Stack<Character>();

        Scanner scanner = new Scanner(System.in);

        String sentence = "";
        String output = "";

        System.out.println("Enter  Sentence");

        sentence = scanner.nextLine();

        char input[] = sentence.toCharArray();


        for (int i = 0; i < sentence.length(); i++)
        {
            if (input[i] != ' ') {

                myStack.push(input[i]);
            } else {

                while (!myStack.empty())
                    output += myStack.pop();

                output += " ";
            }
        }

        while (!myStack.empty())
            output += myStack.pop();


        System.out.println("Reversed sentence is");
        System.out.println(output);
    }
}