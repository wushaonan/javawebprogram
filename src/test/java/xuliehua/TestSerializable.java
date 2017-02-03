package xuliehua;

import jdk8.Tes;

import java.io.*;
import java.text.MessageFormat;

/**
 * Created by nan on 17-1-16.
 */
public class TestSerializable {

    public static String  a = "aa";

    public static void main(String[] args) throws Exception {
        TestSerializable testSerializable = new TestSerializable();
        //SerializePerson();//序列化Person对象
        String b  = a;
        Person p = DeserializePerson();//反序列Perons对象
//        System.out.println(MessageFormat.format("name={0},sex={2}",
//                p.getName(), p.getSex()));
        System.out.println(MessageFormat.format("name={0},age={1},sex={2}",
                p.getName(), p.getAge(), p.getSex()));
    }

    /**
     * MethodName: SerializePerson
     * Description: 序列化Person对象
     *
     * @throws FileNotFoundException
     * @throws IOException
     * @author xudp
     */
    private static void SerializePerson() throws FileNotFoundException,
            IOException {

        Person person = new Person();
        person.setName("gacl");
       // person.setAge(25);
        person.setSex("男");
        // ObjectOutputStream 对象输出流，将Person对象存储到E盘的Person.txt文件中，完成对Person对象的序列化操作
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(
                new File("/home/nan/桌面/aaa/Person.txt")));
        oo.writeObject(person);
        System.out.println("Person对象序列化成功！");
        oo.close();
    }

    /**
     * MethodName: DeserializePerson
     * Description: 反序列Perons对象
     *
     * @return
     * @throws Exception
     * @throws IOException
     * @author xudp
     */
    private static Person DeserializePerson() throws Exception, IOException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
                new File("/home/nan/桌面/aaa/Person.txt")));
        Person person = (Person) ois.readObject();
        System.out.println("Person对象反序列化成功！");
        return person;
    }
}
class AA{
    public static void main(String[] args) {
        String a = TestSerializable.a;
        TestSerializable.a = "bb";
        TestSerializable t = new TestSerializable();
        System.out.println(new TestSerializable().a);
    }
}