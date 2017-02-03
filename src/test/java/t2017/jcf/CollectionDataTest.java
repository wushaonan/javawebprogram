package t2017.jcf;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by nan on 17-1-12.
 */
public class CollectionDataTest {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>(new CollectionData<String>(new Government(),15));
        set.addAll(CollectionData.list(new Government(),15));

        Iterator<String> it = set.iterator();

        while (it.hasNext())
        System.out.println( it.next());
    }
}
