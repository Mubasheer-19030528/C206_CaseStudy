
/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 19030528, 13 Aug 2020 2:24:28 pm
 */

public class MenuItem {

	private String category;
	private String name;
	private double price;

	public MenuItem(String category, String name, double price) {
		super();
		this.category = category;
		this.name = name;
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		// Write your code here
		String str = "";

		str = String.format("%-10s %-30s %-10s\n", category, name, price);

		return str;
	}

	public boolean checkMenuItemInput() {
		boolean check = false;
		if (category != "" && category != null) {
			if (name != "" && name != null) {
				if (price != 0.0) {
					check = true;
				}
			}
		}
		return check;
	}

}
