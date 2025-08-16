package singleton;

public class Single {
	static Single s=null;
	static Single getInstance() {
		if(s==null) {
			s=new Single();
		}
		return s;
	}
	
	


}
