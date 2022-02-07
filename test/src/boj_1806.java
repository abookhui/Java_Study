import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj_1806 {
    public static Scanner in = new Scanner(System.in);
    public static int max_val = 100001;

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int n,s;
        int lo=0,ro=0,sum=0,len=max_val;

        n=in.nextInt();
        s=in.nextInt();

        for(int i=0;i<n;i++){
            int a=in.nextInt();
            arr.add(a);
        }

        while(lo<=ro){
            if(sum>=s){
                len = Math.min(len,ro-lo);
                sum-=arr.get(lo++);
            }
            else if(ro==n) break;
            else sum+=arr.get(ro++);
        }
        if(len == max_val) System.out.println(0);
        else System.out.println(len);
    }
}
