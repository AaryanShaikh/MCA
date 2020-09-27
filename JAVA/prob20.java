/* If the three sides of a triangle are entered through the keyboard. write a program to check whether the triangle is isosceles. equilateral. scalene or right angled triangle. 
*/
import java.util.*;
public class prob20{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[3];
		for (int i=1;i<=3 ;i++ ) {
			System.out.println("Enter the "+i+" side ");
			arr[i-1] = in.nextInt();
		}
		Arrays.sort(arr);
/*For a triangle to be a right angle triangle, the square of the largest side is equal 
  to the sum of squares of other two sides. eg 6,8,10 */
		if ((arr[2]*arr[2])==(arr[0]*arr[0])+(arr[1]*arr[1])) {
			System.out.println("Triangle is Right Angled Triangle");
		}else if(arr[0]==arr[1]&&arr[1]==arr[2]&&arr[0]==arr[2]){
			System.out.println("Triangle is Equilateral Triangle");
		}else if (arr[0]==arr[1]||arr[1]==arr[2]||arr[0]==arr[2]) {
			System.out.println("Triangle is Isosceles Triangle");
		}else{
			System.out.println("Triangle is Scalene Triangle");
		}
	}
}
