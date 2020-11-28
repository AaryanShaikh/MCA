import java.util.*;
public class CA8{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the expression");
		String str = in.nextLine();
		String strsplit[] = str.split(" ");
		boolean div = true,mul = true,sub = true,add = true;
		while(true){
			int count = 0;
			for (int i=0;i<strsplit.length ;i++ ) {
				if (!strsplit[i].equals("f")) {
					count++;
				}
			}
			if (count==1) {
				break;
			}
			if (div) {
				for (int i=0;i<strsplit.length ;i++ ) {
					if (strsplit[i].equals("/")) {
						int k = i;
						while(strsplit[k-1].equals("f")){
							k--;
						}
						double num1 = Double.parseDouble(strsplit[k-1]);
						strsplit[k-1] = "f";
						k=i;
						while(strsplit[k+1].equals("f")){
							k++;
						}
						double num2 = Double.parseDouble(strsplit[k+1]);
						strsplit[k+1] = "f";
						double res = num1/num2;
						strsplit[i] = Double.toString(res);  	
					}
				}
				div = false;
			}else if(mul){
				for (int i=0;i<strsplit.length ;i++ ) {
					if (strsplit[i].equals("*")) {
						int k = i;
						while(strsplit[k-1].equals("f")){
							k--;
						}
						double num1 = Double.parseDouble(strsplit[k-1]);
						strsplit[k-1] = "f";
						k=i;
						while(strsplit[k+1].equals("f")){
							k++;
						}
						double num2 = Double.parseDouble(strsplit[k+1]);
						strsplit[k+1] = "f";
						double res = num1*num2;
						strsplit[i] = Double.toString(res);  	
					}
				}
				mul = false;
			}else if(sub){
				for (int i=0;i<strsplit.length ;i++ ) {
					if (strsplit[i].equals("-")) {
						int k = i;
						while(strsplit[k-1].equals("f")){
							k--;
						}
						double num1 = Double.parseDouble(strsplit[k-1]);
						strsplit[k-1] = "f";
						k=i;
						while(strsplit[k+1].equals("f")){
							k++;
						}
						double num2 = Double.parseDouble(strsplit[k+1]);
						strsplit[k+1] = "f";
						double res = num1-num2;
						strsplit[i] = Double.toString(res);  	
					}
				}
				sub=false;
			}else if(add){
				for (int i=0;i<strsplit.length ;i++ ) {
					if (strsplit[i].equals("+")) {
						int k = i;
						while(strsplit[k-1].equals("f")){
							k--;
						}
						double num1 = Double.parseDouble(strsplit[k-1]);
						strsplit[k-1] = "f";
						k=i;
						while(strsplit[k+1].equals("f")){
							k++;
						}
						double num2 = Double.parseDouble(strsplit[k+1]);
						strsplit[k+1] = "f";
						double res = num1+num2;
						strsplit[i] = Double.toString(res);  	
					}
				}
				add=false;
			}
		}
		for (int i=0;i<strsplit.length ;i++ ) {
			if (strsplit[i].equals("f")) {
				continue;
			}else{
				System.out.println(strsplit[i]);
				break;
			}
		}
	}
}