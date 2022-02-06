import java.util.Scanner;

public class function2 {
    public static Scanner scanner = new Scanner(System.in);
    public static int num=0;

    public static void main(String[] args){
        for(int i=0;i<3;i++){
            num+=Input();
        }
        System.out.println(num);
    }

    public static int Input(){
        int input = scanner.nextInt();  // type int scanf
        System.out.println(input);
        return input;
    }

}
