/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 19011721, Aug 13, 2020 3:02:26 PM
 */

/**
 * @author 19011721
 *
 */
public class PurchaseOrder {

	private String itemName;
	private int itemQuantity;
	private double itemUnitPrice;
	private String deliveryDate;
	
	public PurchaseOrder (String itemName,int itemQuantity,double itemUnitPrice,String deliveryDate) {
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.itemUnitPrice = itemUnitPrice;
		this.deliveryDate = deliveryDate;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public double getItemUnitPrice() {
		return itemUnitPrice;
	}

	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	
	public String toString() {
		return toString();
	}
}
