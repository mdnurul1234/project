package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        //Input String
        String[] words = st.split(" "); //Split the word from String

        int wrc = 1; //Variable forgetting Repeated word count

        for (int i = 0; i <words.length; i++) //Outer loop for Comparison
        {
            for (int j = i + 1; j < words.length; j++)
//Inner loop for Comparison
            {
                if (words[i].equals(words[j])) //Checking for both strings are equal
                {
                    wrc = wrc + 1; //if equalincrement the count
                    words[j] = "0"; //Replacerepeated words by zero
                }
            }
            if (words[i] != "0"){
            System.out.println(words[i] + "--" + wrc);
//Printing the word along with count
            wrc = 1;
        }
        }
    }
}








