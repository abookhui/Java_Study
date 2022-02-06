import java.util.Scanner;

public class while_ex {
    public static void main(String[] args) {
        String password = "123asd";
        Scanner scanner = new Scanner(System.in);

        //System.out.println("비밀번호를 입력.");
        String input;

        /*while (input.equals(password) !=true) {
            System.out.println("Re");
            input = scanner.nextLine();
        }*/

        do{
            System.out.println("비밀번호 입력.");
            input = scanner.nextLine();
        }while (input.equals(password)!=true);

        System.out.println("End");
    }
}
