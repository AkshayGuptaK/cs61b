import java.util.Iterator;

public class OfficeHoursQueue implements Iterable<OHRequest> {
    OHRequest start;
    
    public OfficeHoursQueue (OHRequest queue) {
	start = queue;
    }
    
    @Override
    public Iterator<OHRequest> iterator() {
	return new OHIterator(start);
    }

    public static void main(String [] args) {
	OHRequest s1 = new OHRequest("Failing my test for get in arrayDeque, NPE", "Pam", null);
	OHRequest s2 = new OHRequest("conceptual: what is dynamic method selection", "Michael", s1);
	OHRequest s3 = new OHRequest("git: what does checkout do.", "Jim", s2);
	OHRequest s4 = new OHRequest("help", "Dwight", s3);
	OHRequest s5 = new OHRequest("debugging get(i)", "Creed", s4);
	OfficeHoursQueue que =  new OfficeHoursQueue(s5);

	for (OHRequest request : que) {
	    System.out.println(request.name);
        }
    }
}
