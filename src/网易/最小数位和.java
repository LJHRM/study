package 网易;

import java.util.Scanner;

public class 最小数位和 {

    public static String printNum(int n){
        if(n<10){
            return String.valueOf(n);
        }
        int count=n/9;
        int countwei=n%9;
        StringBuilder stringBuilder=new StringBuilder();
        if(countwei!=0){
            stringBuilder.append(countwei);
        }
        for(int i=0;i<count;i++){
            stringBuilder.append(9);
        }

        String s=stringBuilder.toString();
        return s;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(printNum(nums[i]));
        }
    }
}
