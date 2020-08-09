package main;

public class ProductArraySortExampleApp {

	public static void main(String[] args) {

		Product[] products = {
				new Product("milk", 14, 1),
				new Product("coffee", 52, 4),
				new Product("bread", 14, 3)
		};
		
		////////////////////////////
		Product temp;
		boolean swapped;
		
		for(int j = 0; j < products.length-1; j++) {
			swapped = false;
			
			for(int i = 0; i < products.length-1; i++) {
				
				if(products[i].getPrice() > products[i+1].getPrice() ) {				
					temp = products[i];
					products[i] = products[i+1];					
					products[i+1] = temp;	
					swapped = true;					
				} else if(products[i].getPrice() == products[i+1].getPrice() && products[i].getRating() < products[i+1].getRating()) {
					temp = products[i];
					products[i] = products[i+1];					
					products[i+1] = temp;	
					swapped = true;	
				}
			}			
			if(!swapped) {
				break;
			}		
	}
		////////////////////////////
		
		for (Product product : products) {
			System.out.println(product);
		}
	}
}

class Product{
	
	private String name;
	private int price;
	private int rating;
	
	public Product(){}

	public Product(String name, int price, int rating) {		
		setName(name);
		setPrice(price);
		setRating(rating);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.trim().length() > 2)
			this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price > 0 && price <= 10_000)
			this.price = price;
	}

	public int getRating() {		
		return rating;
	}

	public void setRating(int rating) {
		if(rating > 0 && rating <= 5)
			this.rating = rating;
	}

	@Override
	public String toString() {
		return "Product [" + name + ", " + price + "MDL, " + rating + "* ]";
	}		
}


		
