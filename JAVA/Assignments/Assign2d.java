public class Assign2d{
	public static void main(String[] args) {
		int firstTerm = 1;
		int cDiff = 2;
		int sum = 0;
		for (int i = 0;i<9 ;i++ ) {
			if (i<5) {
				sum+=firstTerm;
			}
			firstTerm+=cDiff;
		}
		System.out.println("10th term is "+firstTerm+"\nSum of the first 5 terms is "+sum);
	}
}