package t2017.jcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by nan on 17-1-12.
 */
public class C0112 extends A{
    static {
        System.out.println("C0112 static");
    }
    {
        System.out.println("C0112 {}");
    }
    public C0112(){
        System.out.println("C0112 构造器！！");
    }
    public static void main(String[] args) {
        C0112 c = new C0112();
        c = new C0112();

        List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4,new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list,new StringAddress("World!"));
        System.out.println(list);
    }
}

class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s=s;
    }

    @Override
    public String toString() {
        return super.toString()+" "+s;
    }
}
class A{
    static {
        System.out.println("A static");
    }
    {
        System.out.println("A {}");
    }
    public A(){
        System.out.println("A 构造器！！");
    }
}