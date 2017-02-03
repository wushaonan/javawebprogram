package t2017.jcf;




import java.util.*;

/**
 * Created by nan on 17-1-12.
 */
public class CollectionData<T> extends ArrayList<T> {

    public CollectionData(Generator<T> gen,int quantity){
        for (int i=0;i<quantity;i++){
            add(gen.next());
        }
    }
    public static <T> CollectionData<T> list(Generator<T> gen,int quantity){
        return new CollectionData<T>(gen,quantity);
    }
}
