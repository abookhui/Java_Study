import java.util.Arrays;

public class arrayToString {
    public static void main(String[] args) {
        String [] days ={"월","화","수","목","금","토","일"};

        System.out.println(days);
        System.out.println(Arrays.toString(days));  // arr 한번에 출력
    }
}
