import java.util.ArrayList;

public class Order {

	private String username;
	private String status;
	private boolean takeaway;
	private ArrayList<MenuItem> items; 

	public Order(String username, String status,ArrayList<MenuItem> items ) {
		this.username=username;
		this.status=status;
		this.items=items;
		
	}
	public String getUsername() {
		return username;
	}
	public String setUsername(String username) {
		this.username=username;
		return username;
	}
	public String getStatus() {
		return status;
	}
	public String setStatus(String status) {
		this.status=status;
		return status;
	}
	public boolean isTakeaway() {
		return takeaway;
	}
	public boolean setTakeaway(boolean takeaway) {
		this.takeaway=takeaway;
		return takeaway;
	}
	public ArrayList<MenuItem> getItems() {
		return items;
	}
	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}
	public String toString(){
		// Write your codes here
	return toString();
	}
}

