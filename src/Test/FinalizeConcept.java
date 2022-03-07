package Test;

public class FinalizeConcept {
 public void finalize() {
	 System.out.println("finalize");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FinalizeConcept f1=new FinalizeConcept();
		f1=null;
		System.gc();
		//but b4 sysytem.gc finalize method to be called to called to perform some cleaning process.
		// not that much important but interview question
		//we donrt need to call finalize method automatically it will be called
		
		
		
		
	}

}
