package string.problems;

import org.testng.Assert;
import java.util.HashMap;
import java.util.Map;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.
                char[] str1 = {'C', 'A', 'T'};
                char[] str2 = {'A', 'C', 'T'};

        //Assert.assertEquals(true, Anagram.ifAnagram(str1, str2));
        Assert.assertEquals(true,Anagram.areAnagram(str1,str2));
                String str = "quot;You reading that mean you giving mark me";
                Map<Integer,String> map = new HashMap<Integer,String>();
                String[] tempStr = str.split(" ");
                for (String s : tempStr)
                    map.put(s.length(), s);
                Assert.assertEquals(DetermineLargestWord.findTheLargestWord(str) , map);
            }
        }



