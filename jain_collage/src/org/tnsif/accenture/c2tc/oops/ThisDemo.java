package org.tnsif.accenture.c2tc.oops;

class Product
{
	double price;

	Product(double price)
	{
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10; //apply 10% discount
	}
	double calculateFinalePrice()
	{
		return this.price-this.calculateDiscount();
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		Product product =new Product(400.0);
		System.out.println("Final Price : " +product.calculateFinalePrice());

	}

}
