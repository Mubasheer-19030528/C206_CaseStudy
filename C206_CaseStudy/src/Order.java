/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19022963, 13 Aug 2020 2:15:34 p.m.
 */

import java.util.ArrayList;

public class Order {

	private String username;
	private String status;
	private boolean takeaway;
	private ArrayList<MenuItem> items; 

	public Order(String username, String status,boolean takeaway, ArrayList<MenuItem> items ) {
		this.username=username;
		this.status=status;
		this.takeaway=takeaway;
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

