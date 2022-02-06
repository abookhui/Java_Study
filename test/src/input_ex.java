import java.util.Scanner;

public class input_ex {
    public static void main(String[] args) {
        /*Scanner scanner;
        scanner = new Scanner(System.in);  // new 키워드를 이용해 Scanner값을 생성

        String input = scanner.nextLine(); // 사용자가 입력한 값을 변수에 넘김 , 한줄 입력 그대로 출력함
        System.out.println(input);*/

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        String input2 = scan.next();
        String input3 = scan.next();
        String input4 = scan.next();

        System.out.println(input);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);

    }
}
