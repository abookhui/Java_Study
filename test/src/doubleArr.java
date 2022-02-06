import java.util.Arrays;

public class doubleArr {
    public static void main(String[] args) {
        String[][] days= {
                {"월", "화", "수", "목", "금", "토", "일"},
                {"월", "화", "수", "목", "금", "토", "일"},
                {"월", "화", "수", "목", "금", "토", "일"}
        };
        for(int i=0;i<3;i++){
            System.out.println(Arrays.toString(days[i]));
            try {
                Thread.sleep(3000);   //  지연시간 3s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
