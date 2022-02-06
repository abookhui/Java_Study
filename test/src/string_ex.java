public class string_ex {
    public static void main(String[] args) {
        /*System.out.println("나는 문자열");
        System.out.println('나');

        System.out.println("나 \"자바\".");
        System.out.println("hi\nhi there\n");*/

       // String chicken="치킨은 살 안 쪄요";
       // String me = "내가 쪄요";
       // String ans = chicken+me;
       // System.out.println(ans);

        //System.out.println(ans.length());

        //문자열에서 글자 바꾸기
       // System.out.println(me.replaceAll("내가","너가"));

        //문자열 자르기
        String birth ="2002/04/09";
        String year=birth.substring(0,4);
        String mon = birth.substring(5,7);
        String day = birth.substring(8,10);

        System.out.println(year);
        System.out.println(mon);
        System.out.println(day);
   }
}
