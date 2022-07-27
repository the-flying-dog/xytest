package method_test;

import java.util.Collection;
import java.util.Iterator;

public class IteratorW<T> {
    public void iteratorW(Collection<T> c){
        Iterator<T> it = c.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
