package xuliehua;

import java.io.Serializable;

/**
 * Created by nan on 17-1-16.
 */
public class Person implements Serializable{


    private static final long serialVersionUID = -3314717244140557946L;
     private int age;
    private String name;
    private String sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
