package composite.example1;

public class MenuItem extends MenuComponent{
	String name;
	String description;
	boolean vegetarian;
	double price;
	
	public MenuItem(String name, String description, boolean vegetarian, double price) {
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public boolean isVegetarian() {
		return vegetarian;
	}
	public void print() {
		System.out.print("     "+getName());
		if(isVegetarian()) {
			System.out.print("(v)");
		}
		System.out.println(", "+getPrice());
		System.out.println("     -- "+getDescription());
	}
}
