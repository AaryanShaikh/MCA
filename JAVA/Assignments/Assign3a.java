public class Assign3a{
	public static void main(String[] args) {
		int a = 9, b = 11,percent = 45;
		//Solution using if - else
		if (a%2==0&&b%2==0){
			System.out.println("Sum is "+(a+b));
		}else{
			if (a%2==0||b%2==0){
				System.out.println("Product is "+(a*b));
			}else{
				System.out.println("Difference is "+(a-b));
			}
		}
		//Solution using if - else if
		if (a%2==0&&b%2==0) {
			System.out.println("Sum is "+(a+b));
		} else if (a%2==0||b%2==0){
			System.out.println("Product is "+(a*b));
		}else {
			System.out.println("Difference is "+(a-b));
		}
		//Grading System using if - else if
		if (percent>=90) {
			System.out.println("Grade is 'S'");
		}else if (percent>=80&&percent<=89){
			System.out.println("Grade is 'A'");
		}else if (percent>=70&&percent<=79){
			System.out.println("Grade is 'B'");
		}else if (percent>=60&&percent<=69){
			System.out.println("Grade is 'C'");
		}else if (percent>=50&&percent<=59){
			System.out.println("Grade is 'D'");
		}else if (percent>=40&&percent<=49){
			System.out.println("Grade is 'E'");
		}else if (percent>=30&&percent<=39){
			System.out.println("Grade is 'P'");
		}else{
			System.out.println("Grade is 'F'");
		}
		//Grading System using switch
		switch(percent){
			case 100: 
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90: System.out.println("Grade is 'S'");
			break;
			case 89: 
			case 88:
			case 87:
			case 86:
			case 85:
			case 84:
			case 83:
			case 82:
			case 81:
			case 80: System.out.println("Grade is 'A'");
			break;
			case 79: 
			case 78:
			case 77:
			case 76:
			case 75:
			case 74:
			case 73:
			case 72:
			case 71:
			case 70: System.out.println("Grade is 'B'");
			break;
			case 69: 
			case 68:
			case 67:
			case 66:
			case 65:
			case 64:
			case 63:
			case 62:
			case 61:
			case 60: System.out.println("Grade is 'C'");
			break;
			case 59: 
			case 58:
			case 57:
			case 56:
			case 55:
			case 54:
			case 53:
			case 52:
			case 51:
			case 50: System.out.println("Grade is 'D'");
			break;
			case 49: 
			case 48:
			case 47:
			case 46:
			case 45:
			case 44:
			case 43:
			case 42:
			case 41:
			case 40: System.out.println("Grade is 'E'");
			break;
			case 39: 
			case 38:
			case 37:
			case 36:
			case 35:
			case 34:
			case 33:
			case 32:
			case 31:
			case 30: System.out.println("Grade is 'P'");
			break;
			default : System.out.println("Grade is 'F'");
			break;
		}
	}
}