import java.util.*;
public class IteratorOfIterators implements Iterator<Integer> {
    Integer index;
    List<Iterator<Integer>> lst;

    public IteratorOfIterators(List<Iterator<Integer>> a) {
	lst = a;
	index = 0;
    }

    @Override
    public boolean hasNext() {
	return lst.get(index).hasNext();
    }

    @Override
    public Integer next() {
	int next = lst.get(index).next();
	index = (index + 1) % lst.size();
	return next;
    }
}
