/* Assignment 1 (2)*/
import java.util.Scanner;
public class Assign6e{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		if (strsplit[1].charAt(strsplit[1].length()-1)>='A'&&strsplit[1].charAt(strsplit[1].length()-1)<='Z'
			||strsplit[1].charAt(strsplit[1].length()-1)>='a'&&strsplit[1].charAt(strsplit[1].length()-1)<='z'){
			System.out.println(strsplit[1]+"("+strsplit[1].length()+")");
		}else{
			strsplit[1] = strsplit[1].replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(strsplit[1]+"("+strsplit[1].length()+")");
		}
	}
}