import java.util.*;
public class FifoPageReplacement{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the pages");
		int size = in.nextInt();
		System.out.println("Enter the elements");
		int page[] = new int[size];
		for (int i=0;i<size ;i++ ) {
			page[i] = in.nextInt();
		}
		System.out.println("Enter the frame size");
		int fsize = in.nextInt();
		int frame[] = new int[fsize];
		int pageHit = 0;
		int index = 0;
		System.out.println("Frames");
		for (int i=0;i<size ;i++ ) {
		 	if (i<=2) {
		 		frame[index] = page[i];
		 		index = (index+1)%3;
		 		for (int x=0;x<fsize ;x++ ) {
			 			if (frame[x]==0) {
			 				System.out.print(" ");
			 			}else{
			 				System.out.print(frame[x]+" ");
			 			}
			 		}
			 		System.out.println();
		 	}else{
		 		int k=0;
			 	while(k<frame.length){
			 		if (frame[k]==page[i]) {
			 			pageHit++;
			 			break;
			 		}else{
			 			k++;
			 		}
			 	}
			 	if (k>=frame.length) {
			 		frame[index] = page[i];
			 		index = (index+1)%3;
			 		for (int x=0;x<fsize ;x++ ) {
			 			if (frame[x]==0) {
			 				System.out.print(" ");
			 			}else{
			 				System.out.print(frame[x]+" ");
			 			}
			 		}
			 		System.out.println();
			 	}
		 	}
		 }
		 System.out.println("Page hit : "+pageHit);
		 System.out.println("Page fault : "+(size-pageHit)); 
	}
}
