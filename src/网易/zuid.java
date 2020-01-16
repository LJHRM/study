package 网易;

import java.util.Scanner;

public class zuid {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    sum=sum+j-i;
                }
            }
        }
        System.out.println(sum);
    }
}
