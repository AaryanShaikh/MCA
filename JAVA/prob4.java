/* write a program in java to define a class which represent a book in library. include following members as data members - book number,book name, author,publisher, price, 
no of copies issued. Member function
1) to assign initial value
2) to issue a book after checking its availability 
3) to return a book 
4) to display book information */

import java.util.*;
class Book{
	int bknum,bkcopies;
	String bkname,bkauthor,bkpublisher;
	float bkprice;

	Book(String x, String y, String z, int a, int b, float c){
		bkname = x;
		bkauthor=y;
		bkpublisher=z;
		bknum=a;
		bkcopies=b;
		bkprice=c; 
	}
	boolean isIssued = false;
	void issueBook(){
		if (bkcopies>0) {
			System.out.println("Issued book Successfully");
			bkcopies--;
			isIssued = true;
		}
		else{
			System.out.println("Book not available");	
		}
	}

	void returnBook(){
		if(isIssued){
			System.out.println("Book returned Successfully");
			bkcopies++;
		}
		else{
			System.out.println("Book was not Issued in the first place");	
		}
	}

	void display(){
		System.out.println("Book name "+bkname);
		System.out.println("Book author "+bkauthor);
		System.out.println("Book publisher "+bkpublisher);
		System.out.println("Book No "+bknum);
		System.out.println("Book Copies "+bkcopies);
		System.out.println("Book Price "+bkprice);
	}

}
public class prob4{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Bookname");
		String bname = in.nextLine();
		System.out.println("Enter the Book author");
		String bauth = in.nextLine();
		System.out.println("Enter the Book publisher");
		String bpub = in.nextLine();
		System.out.println("Enter the Book num");
		int bnum = in.nextInt();
		System.out.println("Enter the Book copies");
		int bcopy = in.nextInt();
		System.out.println("Enter the Book price");
		float bprice = in.nextFloat();
		Book bk = new Book(bname,bauth,bpub,bnum,bcopy,bprice);
		boolean check = true;
		while(check){
			System.out.println("1.Issue book");
			System.out.println("2.Return book");
			System.out.println("3.Display Book information");
			System.out.println("---any other number to exit---");
			int ch = in.nextInt();
			switch(ch){
				case 1: bk.issueBook();
						break;
				case 2: bk.returnBook();
						break;  
				case 3: bk.display();
						break;
				default: check = false;
						break;
			}
		}
	}
}
