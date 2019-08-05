import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AppleHeap {

    static int find(int num, int[] sum, int length) {
        int left = 1;
        int right = length;
        int index;
//        int right = sum.length - 1;
        while (left <= right) {
            index = (left + right) / 2;
            if (num < sum[index]) {
                if (num > sum[index - 1]) {
                    return index;
                }
                right = index - 1;
            } else if (num > sum[index]) {
                left = index + 1;
            } else {
                return index;
            }
        }
        return 0;
    }



    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int total=s.nextInt();

        int [] sum=new int[total + 1];
        int i=1;
        while (i <= total){
            sum[i]=s.nextInt()+sum[i-1];
            i++;
        }
        int totalProblem=s.nextInt();//总问题数
        Integer[] problemNum = new Integer[totalProblem];
        while (totalProblem > 0){
            problemNum[problemNum.length - totalProblem]=s.nextInt();
            totalProblem --;
        }
        int maxProblemNum = (int) Collections.max(Arrays.asList(problemNum));
        int maxLength = find(maxProblemNum, sum, sum.length - 1);
        for (int j = 0; j <problemNum.length ; j++) {
            if (problemNum[j] == maxProblemNum) {
//                System.out.println("prob "+problemNum[j]);
                System.out.println(maxLength);
            }
            else {
                System.out.println(find(problemNum[j], sum, maxLength));
            }
        }
    }
}
