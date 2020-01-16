package 网易;

import java.util.Scanner;

public class 翻倍 {

    public static int mindo(String str){
        //这个数组包含了四个数,让b<=a 1 5 7 2
        String []strings=str.split(" ");
        Long a=Long.parseLong(strings[0]);
        Long b=Long.parseLong(strings[1]);
        Long p=Long.parseLong(strings[2]);
        Long q=Long.parseLong(strings[3]);
        int count=0;
        while (b>a){
            if(a+p>=b){
                a=a+p;
                count++;
            }else {
                p=p*q;
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=Integer.parseInt(in.nextLine());
        String[]strings=new String[n];
        for(int i=0;i<n;i++){
           strings[i]=in.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println(mindo(strings[i]));
        }
    }
}
