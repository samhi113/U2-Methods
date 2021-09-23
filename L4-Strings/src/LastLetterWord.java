import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */

    //1. Get input - word 1, 2, and 3
    //2. Separate last 3 letters of each word
    //3. Combine the last 3s
    //4. Output results

    public static void main(String[] args) {
        String startString1 = getInput("Insert the first thing you want to combine.");
        String startString2 = getInput("Insert the second thing you want to combine.");
        String startString3 = getInput("Insert the third thing you want to combine.");

        String last31 = getLastThree(startString1);
        String last32 = getLastThree(startString2);
        String last33 = getLastThree(startString3);

        String finalWord = combineLastThrees(last31, last32, last33);

        displayResults(startString1, startString2, startString3, finalWord);
        System.exit(69420);
    }

    public static String getInput(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public static String getLastThree(String word){

        String newWord;

        if (word.length() <= 3){
            newWord = word;
        } else {
            newWord = word.substring(word.length()-3);
        }

        return newWord;
    }

    public static String combineLastThrees (String part1, String part2, String part3){
        return part1+part2+part3;
    }

    public static void displayResults(String start1, String start2, String start3, String finalWord){
        JOptionPane.showMessageDialog(null, start1 + ", " + start2 + ", and " + start3 + " combine to make " + finalWord);
    }
}
