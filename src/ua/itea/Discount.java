package ua.itea;

public class Discount {

	public static void main(String[] args) {
		
		double money = 10;
		int discount = 0;
		
		if (money>=300 && money<400) {discount = 3;}
		else if (money>=400 && money<500) {discount = 5;}
		else if (money>=500) {discount = 7;}
		
		System.out.println("Your discount is " + discount + "% , total to pay " + (money-(money*discount/100)));
	}

}
