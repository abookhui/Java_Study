import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class boj_2559 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        List <Integer> arr = new ArrayList<>();

        int n=in.nextInt();
        int k=in.nextInt();

        for(int i=0;i<n;i++){
            int a=in.nextInt();
            arr.add(a);
        }
        int idx=0,ans=0, val=0;

        for(int i=0;i<k;i++){
            val+=arr.get(i);
        }
        ans = val;

        while(true){
            if(idx+k>=n) break;

            val-=arr.get(idx);
            val+=arr.get(idx+k);

            ans = Math.max(val,ans);
            idx++;
        }
        System.out.println(ans);
    }
}
