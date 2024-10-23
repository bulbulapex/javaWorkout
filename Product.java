public class Product{
	int product_id;
	String name;
	double price;
	int quantity;
	String description;

	public Product(){
		this.product_id = 1;
		this.name = "Doll";
		this.price = 56.32;
		this.quantity = 5;
		this.description = "Good product";
	}

	public void displayProductInfo(){
		System.out.println("Product id: " + product_id + 
							"\nProduct Name:" +name+
							"\nPrice: "+price+
							"\nQuantity: "+quantity+
							"\nDescription: "+description);
	}

	public double calculateTotalValue(){
		double tot_amount;
		tot_amount = price * quantity;
		return tot_amount;
	}


}