/*Product - Parent Class
members - barcode, product name
methods - Constructor()-> (initialize the data), getCode()-> (Get barcode), setCode()-> (Set Barcode), scanner()-> (Read the data), printer()-> (write the data)

PrepackedFoods - Child Class
members - unit price,
methods - Constructor()-> (initialize the data)

FreshFoods - child Class
members - weight, price 
methods - Constructor()-> (initialize the data) 
*/

import java.util.*;

class Product{
	long barcode;
	String name;
	int price;
	Scanner in=new Scanner(System.in);
	Product(){
		barcode = 0;
		name = "";
	}

	Product(long barcode, String name){
		this.barcode = barcode;
		this.name = name;
	}

	void setCode(long code){
		barcode = code;
	}

	void getCode(){
		System.out.println(barcode);
	}

	void Scan(){
		System.out.println("Enter the barcode");
		long code = in.nextLong();
		setCode(code);
	}

	void Print(){
		System.out.println("Barcode of the Product: "+barcode);
		System.out.println("Name of the Product: "+name);
		System.out.println("Price of the Product: "+price);
		System.out.println();
	}
}

class PrepackedFood extends Product{
	int unitprice;
	
	PrepackedFood(int price, long barcode, String name){
		this.price = price;
		this.unitprice = unitprice;
		this.barcode = barcode;
		this.name = name;
	}

	PrepackedFood(){
		unitprice = 10;
		barcode = 10000;
		name = "Default product";
		price = 100;
	}
}

class FreshFood extends Product{
	int weight,priceperkilo;

	FreshFood(int weight, int priceperkilo, long barcode, String name){
		this.price = weight*priceperkilo;
		this.weight = weight;
		this.priceperkilo = priceperkilo;
		this.barcode = barcode;
		this.name = name;
	}

	FreshFood(){
		weight = 10;
		priceperkilo = 10;
		barcode = 10000;
		name = "Default product";
		price = 100;
	}
}

public class prob7{
	public static void main(String[] args) {
		FreshFood f1 = new FreshFood(12,10,10056,"Bourbon");
		FreshFood f2 = new FreshFood();
		PrepackedFood p1 = new PrepackedFood(120,17032,"Cadbury");
		PrepackedFood p2 = new PrepackedFood();
		Product prod1 = new Product(99999,"My Product");
		Product prod2 = new Product();
		System.out.println("FreshFood Initialized");
		f1.Print();
		System.out.println("FreshFood Default");
		f2.Print();
		System.out.println("PrepackedFood Initialized");
		p1.Print();
		System.out.println("PrepackedFood Default");
		p2.Print();
		System.out.println("Product Initialized");
		prod1.Print();
		System.out.println("Product Default");
		prod2.Print();
	}
}
