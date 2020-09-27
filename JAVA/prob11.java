/* Define a class test in java with following description: Private Members: testcode(int), desc(string), NoOfCandinates(int), centersReq(int), calcCNTR()-> to calculate
and return the number of centers as (NoOfCandates/100+1). methods: schedule()-> allows the user to enter values for testcode,desc,NoOfCandinates and call calcCNTR() to 
calculate the number of Centers, disptest()-> to allow the user to view the content of all the data members.  
*/
import java.util.*;
class Test{
	Scanner in = new Scanner(System.in);
	private int testcode,nocandidate,centerreq;
	private String description;

	int calcntr(int nocandidate){
		return (nocandidate/100)+1;
	}

	void schedule(){
		System.out.println("Enter the description");
		description = in.nextLine();
		System.out.println("Enter the test code");
		testcode = in.nextInt();
		System.out.println("Enter the no of candidates");
		nocandidate = in.nextInt();
		centerreq = calcntr(nocandidate);
	}

	void disptest(){
		System.out.println("testcode: "+testcode);
		System.out.println("no of candidates: "+nocandidate);
		System.out.println("centers required: "+centerreq);
		System.out.println("description: "+description);
	}
}
public class prob11{
	public static void main(String[] args) {
		Test t =new Test();
		t.schedule();
		t.disptest();
	}
}
