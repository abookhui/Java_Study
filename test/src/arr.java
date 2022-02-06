import java.util.Arrays;

public class arr {
    public static void main(String[] args) {
        String [] days ={"월","화","수","목","금"};

        String[] days2 = Arrays.copyOf(days,6);  // arr copy  , 복제할 배열 , 배열 size
        days2[5] = "토" ;
        for(String Day : days2){
            System.out.println(Day+"요일");
        }
    }
}
