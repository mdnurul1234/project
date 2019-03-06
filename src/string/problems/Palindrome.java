package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String wordOne="reacecar";
        String wordTwo="calender";
        String wordThree="mom";
        String wordFour="calculator";

        System.out.println(isPalindrome(wordOne));
        System.out.println(isPalindrome(wordTwo));
        System.out.println(isPalindrome(wordThree));
        System.out.println(isPalindrome(wordFour));


    }

    public static boolean isPalindrome(String word){
        String actualword=word.toLowerCase();
        String reversWord ="";

        for(int i =actualword.length()-1; i>=0; i--){
            reversWord=reversWord +  actualword.charAt(i);
        }
        if(actualword.equals(reversWord)){
            return true;
        }else{
            return false;
        }
    }
}
