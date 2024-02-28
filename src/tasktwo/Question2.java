package tasktwo;
import java.util.Scanner;

//Parent class
class Product{
	
	//instance variable
	int pid ,quantity;
	double price ;
	
	//Parent class constructor
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

//child class
class Calculation extends Product{
	
	Calculation(int pid, double price, int quantity) {
		super(pid, price, quantity);
	}
	void Display() 
	{
		System.out.println("ProductId : "+pid +" ProductPrice : " +price+" ProductQuantity :  "+quantity);
		double totalAmount = price*quantity;
		System.out.println("Total amount  " + totalAmount);//total amount calculation for each Product
	}
	
	//higher price calculation of all product
	Product highPrice(Product[] productList) 
	{
		Product higher = productList[0];		
		for(int i=1;i<productList.length;i++)
		{
			if(productList[i].getPrice()>higher.getPrice())
			{
				higher=productList[i];
			}
		}
		return higher;
	}
}
	
public class Question2 {

	public static void main(String[] args) {
		
		//array of products
		Product ProductList[]  = new Product[2];
		for(int i=0;i<ProductList.length;i++)
		{
			System.out.println("Enter your PID, Price , Quantity  for product " + i);
			Scanner input = new Scanner(System.in);
			int productId=input.nextInt();//input from user for each product
			double productPrice=input.nextDouble();
			int productQuantity=input.nextInt();
		    ProductList[i]=new Product(productId,productPrice,productQuantity);    
		   	  
		}
		
		for (Product prd:ProductList) //child class to perform actions
		{
			Calculation calc=new Calculation(prd. getPid(),prd.getPrice(),prd.getQuantity());			
			calc.Display();//output
			Product sample=calc.highPrice(ProductList);
			System.out.println("Higher Product ID "+sample.getPid());//get higher product id
		}
	}

	
}
