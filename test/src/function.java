import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        hello();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Sayhello(input);
        System.out.println(sum(3,4));
    }
    public static void hello(){
        System.out.println("hello.");
    }
    public static void Sayhello(String name){
        System.out.println("Hello,"+name);
    }

    public static int sum(int a, int b){
        return a+b;
    }
}
