
public class Item {
	String name;
	int price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	public void print() {
		System.out.println(name);
		System.out.println(price);
	}
}
