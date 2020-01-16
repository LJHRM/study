import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Stone {


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //列数
        int column=s.nextInt();
        int totalNumber=s.nextInt();//总数
        int i=0;
        Integer [] cout=new Integer[column];

        //初始化
        Arrays.fill(cout, 0);

        while (i<totalNumber ){
            cout[s.nextInt() - 1]++;
            i++;
        }
       int sum=(int) Collections.min(Arrays.asList(cout));
        System.out.println(sum);
    }
}
