import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_contains {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<4;i++) {
            int num = scanner.nextInt();
            boolean chk = list.contains(num);
            if(!chk)  list.add(num);
        }
        System.out.println(list);
    }
}
