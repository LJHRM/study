package 网易;

import java.util.Scanner;

/**
 * 2
 * 5
 * 1 3 9 2 6
 * 5
 * 4 2 9 16 7
 *
 * 3
 * 3
 */
public class 完美的序列 {
    public static void wangmei(int n,String str){
        String []strings=str.split(" ");
        int length=strings.length;
        int []nums=new int[length];
        for(int i=0;i<length;i++){
            nums[i]=Integer.parseInt(strings[i]);
        }
        //数据有了 ,dp[i]表示第I个元素的最长完美长度之和
        //每个元素最为一次
        int max=0;

        for(int j=1;j<length;j++){
            int dp[]=new int[length];
            int count=1;
            dp[j-1]=nums[j-1];
            for(int i=j;i<length;i++){
                if(nums[i]<dp[i-1]){
                    dp[i]=nums[i];
                    if(i>length/2){
                        break;
                    }
                }else {
                    dp[i]=dp[i-1]+nums[i];
                    count++;
                }
            }
            if(max<count){
                max=count;
            }
        }
        System.out.println(max);

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //总条数
        int n=Integer.parseInt(s.nextLine());
        String[]str1=new String[n];
        String[]strings=new String[n];
        for(int i=0;i<n;i++){
            str1[i]=s.nextLine();
            strings[i]=s.nextLine();
        }
        for (int i=0;i<n;i++){
            int total=Integer.parseInt(str1[i]);
            String str=strings[i];
            wangmei(total,str);
        }


    }
}
