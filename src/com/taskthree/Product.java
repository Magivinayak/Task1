package com.taskthree;


class Product implements Taxable{
	private int pId;
	private double price;
	private int quantity;
	
	
	//constructor
        public Product(int pId, double price, int quantity) {
		super();
		this.pId = pId;
		this.price = price;
		this.quantity = quantity;
	}



		//tax calculate
        public void calTax() {
		
		double unitPrice=price/quantity;
		double unitTax= unitPrice *(salesTax/100);
		System.out.println("ProductID : "+pId + " ProductPrice : "+price + " ProductQuantity : "+quantity);
		System.out.println("Product Sales Tax is : " +unitTax );
		
	}
}

