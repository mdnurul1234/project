package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    static boolean areAnagram(char[] str1, char[] str2){
        int n1 = str1.length;
         int n2=str2.length;

       if(n1 !=n2)
        return false;

        for (int i = 0; i<n1; i++)
            if (str1[i] != str2[i])
                return false;

        return true;
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        char str1[] = { 'A','R','M','Y'};
        char str2[] = { 'M','A','R','Y'};

        if (areAnagram(str1, str2))
            System.out.println( "The two strings are: " + "areAnagram of each other");
        else

            System.out.println( "The two strings are not : " + "areAnagram of each other");
    }

}

