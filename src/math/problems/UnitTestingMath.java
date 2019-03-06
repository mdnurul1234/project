package math.problems;

public class UnitTestingMath {
    public int addition(int a,int b){
        int total = a + b;
        return total;
    }
    public int substraction(int a,int b){
        int total = a - b;
        return total;
    }



    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.

        UnitTestingMath cal=new UnitTestingMath();
        int addResult=cal.addition(80,20);
        int subResult=cal.substraction(80,20);
        System.out.println(addResult);
        System.out.println(subResult);
    }
}
