import javax.swing.*;

public class StringExamples {
    public static void main(String[] args) {
        /*
        String name = "Nathanael de Jeffrieson XII";

        String title = "Duke of NYLT, He whom holds the demise of all freshmen peasants in his fateful palm";

        String fullName = name + ", " + title;

        System.out.println(fullName + " has " + fullName.length() + " letters.");
        System.out.println("The seventh letter is '" + fullName.charAt(7-1) + "'");
        System.out.println("My favorite part of his name is " + title.substring(13));
        */

        //Attempt 1
        //Plan
        // 1. Get input
        // 2. Isolate first letter
        // 3. Capitalize first letter
        // 4. Isolate the other letters
        // 5. Make other letters lowercase
        // 6. Combine the first letters and the rest of the name

        String name = JOptionPane.showInputDialog("What's your name?");

        System.out.println("Hello there, " + capFirstLetter(name));

    }

    public static String capFirstLetter(String name){
        String firstLetter = name.substring(0, 1);

        firstLetter = firstLetter.toUpperCase();

        String otherLetters = name.substring(1);

        otherLetters = otherLetters.toLowerCase();

        return firstLetter + otherLetters;
    }
}
