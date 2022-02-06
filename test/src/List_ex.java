import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_ex {
    public static void main(String[] args) {  // list는 껍데기같은 것이고 ArrayList는 껍데기의 모양세를 그대로 따름
        List<Integer> list = new ArrayList<>();
        //List<Integer> list2 = new ArrayList<Integer>();
        //ArrayList<Integer> list3 = new ArrayList<>(); // 1 2 3 모두 같다고 봄

        for(int i=0;i<3;i++){
            list.add(i);
        }

        list.remove(1);
        System.out.println(list);

        list.set(1,10); // 인자값 변경할 값
        System.out.println(list);

        System.out.println(list.get(0));  // [0]번째 반환

        // list.sort()  list.reverse()  정렬
        // list.shuffle()  랜덤 정렬
    }
}
