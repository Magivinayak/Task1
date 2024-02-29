package tasktwo;
import java.util.Scanner;


//Product class
class Product{
	
	//instance variable
	int pid ,quantity;
	double price ;
	
	//Product class constructor
	Product(int pid , double price ,int quantity ){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
     }
	
	//getter method
	public int getPid() { 
		return pid;
		}
	public double getPrice() { 
		return price;
		}
	public int getQuantity() { 
		return quantity;
		}
}

//XYZ class as defined in task
class XYZ {
	
	Product ProductList[]  = new Product[5];
	
	//array of products
	void userInput() {
			
			Scanner input = new Scanner(System.in);
			for(int i=0;i<ProductList.length;i++)
			{
				System.out.println("Enter your PID, Price , Quantity  for product " + (i+1));
				int productId=input.nextInt();//input from user for each product
				
				double productPrice=input.nextDouble();
				
				int productQuantity=input.nextInt();
				System.out.println();
			    ProductList[i]=new Product(productId,productPrice,productQuantity);    
			   	  
			}
			input.close();
	}
	
	double totalValue() 
	{
		double totalAmount = 0;
		for (Product prd:ProductList) 
		{
			totalAmount+=prd.price*prd.quantity;
		}
		return totalAmount;
	}
	
	int higherPid()
	{
		double higherPrice = 1;
		int higherPid = 0;
		
		for (Product prd:ProductList)
		{
			if(prd.getPrice()>higherPrice)
			{
				higherPrice=prd.getPrice();
				higherPid = prd.getPid();
			}
		}
		return higherPid;
	}
	
	void Display() 
	{
		double totalPrice = 0;
		for (Product prd:ProductList) 
		{
			totalPrice=prd.price*prd.quantity;
			System.out.println("ProductId : "+prd.pid +" ProductPrice : " +prd.price+" ProductQuantity :  "+prd.quantity +" Total amount :  "+totalPrice);
		}
		}
}
	
public class Question2 {
	
	
        public static void main(String[] args) {
		
        XYZ objectXyz = new XYZ();
	    objectXyz.userInput();//for product input
	    objectXyz.Display();// for details
		double totalAmount = objectXyz.totalValue();//Total amount of all products
		int highValue = objectXyz.higherPid(); //higher product 
		System.out.println();
		System.out.println("Higher Priced  Product ID : "+highValue);
		System.out.println("Total Amount Spend on All Products : "+totalAmount);

	}
}

