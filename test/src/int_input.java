import java.util.Scanner;

public class int_input {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요");
        Scanner scan = new Scanner(System.in);
        //String input = scan.nextLine();
        int val = Integer.parseInt(scan.nextLine());
        System.out.println(val+1);
    }
}
