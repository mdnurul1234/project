//package math.problems;
//
//public class FindLowestDifference {
//
//    public static int getSmallest(int[] a, int total){
//        int temp;
//        for(int i=0; i<total; i++){
//            for(int j=i+1; j<total; j++){
//                if (a[i] > a[j]) {
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        return a[0];
//    }
//    public static void main(String[] args) {
//        /*
//         Implement in java.
//         Read this below two array. Find the lowest difference between the two array cell.
//         The lowest difference between cells is 1
//        */
//        int [] array1 = {30,12,5,9,2,20,33,1};
//        int [] array2 = {18,25,41,47,17,36,14,19};
//        System.out.println("The smallest from the two array number is :" +Math.min(getSmallest(a,8),getSmallest(b,8)));
//
//    }
//
//}
