import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    //1. Get original word
    //2. Separate first p and the next 3 letters together and the rest
    //3. Display results

    public static void main(String[] args) {
        String originalWord = getInput();

        String newWord = splitPAndThree(originalWord);

        displayResults(newWord);

        System.exit(0);
    }

    public static String getInput(){
        return JOptionPane.showInputDialog("What word do you want to split? \n Make sure your word has a p in it with three letters after.");
    }

    public static String splitPAndThree(String word){
        int pIndex = word.indexOf("p");
        return word.substring(pIndex, pIndex+4);
    }

    public static void displayResults(String newWord){
        JOptionPane.showMessageDialog(null, newWord);
    }
}
