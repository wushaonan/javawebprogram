package t2017;

/**
 * Created by nan on 17-1-10.
 */
public class C0110 {

    String str = new String("good");

    char[] ch = { 'a', 'b', 'c' };
    Integer a = 0;
    public static void main(String args[]) {

        C0110 ex = new C0110();
        String str = new String("good");

        char[] ch = { 'a', 'b', 'c' };
        Integer a = 0;

//        ex.change(ex.str, ex.ch,ex.a);
//
//        System.out.print(ex.str + " and ");
//
//        System.out.print(ex.ch+ " and ");
//
//        System.out.println(ex.a);
        ex.change(str,ch,a);

        System.out.print(str + " and ");

        System.out.print(ch+" and ");

        System.out.println(a);

    }

    public void change(String str, char ch[],int a) {

        str = "test ok";

        ch[0] = 'g';
        a = 1;

    }

}
