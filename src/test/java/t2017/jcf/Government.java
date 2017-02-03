package t2017.jcf;

/**
 * Created by nan on 17-1-12.
 */
public class Government implements Generator<String>{

    String[] foundation = ("strange women lying in ponds distributing swords is no basis for a system of government").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}
