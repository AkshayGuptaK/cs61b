import java.util.Iterator;

public class OHIterator implements Iterator<OHRequest> {
    OHRequest curr;
    
    public OHIterator(OHRequest queue) {
	curr = queue;
    }
    
    public boolean isGood(String description) {
	return description != null && description.length() > 5;
    }

    private OHRequest findNextGoodRequest() {
	OHRequest i = curr;
	while (i != null && !isGood(i.description)) {
	    i = i.next;
	}
	return i;
    }

    public boolean hasNext() {
	return findNextGoodRequest() != null;
    }

    public OHRequest next() {
	OHRequest goodRequest = findNextGoodRequest();
	if (goodRequest == null) {
	    return null;
	}
	curr = goodRequest.next;
	return goodRequest;
    }
}
