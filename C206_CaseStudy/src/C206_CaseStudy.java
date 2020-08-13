import java.util.ArrayList;

public class C206_CaseStudy {

		// TODO Auto-generated method stub
		private static final int OPTION_VIEW = 1;
		private static final int OPTION_ADD = 2;
		private static final int OPTION_DELETE = 3;
		private static final int OPTION_QUIT = 4;
		
		public static void main(String[] args) {

			ArrayList<Account> AccountList = new ArrayList<Account>();
			ArrayList<Order> OrderList = new ArrayList<Order>();
			ArrayList<MenuItem> MenuItemList = new ArrayList<MenuItem>();
			ArrayList<Promotion> PromotionList = new ArrayList<Promotion>();
			ArrayList<PurchaseOrder> IngredientList = new ArrayList<PurchaseOrder>();


			int option = 0;

			while (option != OPTION_QUIT) {

				C206_CaseStudy.optionMenu();
				option = Helper.readInt("Enter an option > ");

				if (option == OPTION_VIEW) {
					// View all items
					C206_CaseStudy.viewAccount(AccountList);
					C206_CaseStudy.viewOrder(OrderList);
					C206_CaseStudy.viewMenuItem(MenuItemList);
					C206_CaseStudy.viewPromotion(PromotionList);
					C206_CaseStudy.viewPurchaseOrder(IngredientList);

				} else if (option == OPTION_ADD) {
					// Add a new item
					C206_CaseStudy.setHeader("ADD");			
					userTypeMenu();
					
					int optionType = Helper.readInt("Enter option to select option type > ");

					if (optionType == 1) {
						// Add an Account
						Account acc = inputCamcorder();
						C206_CaseStudy.addAccount(AccountList, acc);

					} else if (optionType == 2) {
						// Add Order
						Order order = inputChromebook();
						C206_CaseStudy.addOrder(OrderList, order);
					} else if (optionType == 3) {
						// Add MenuItem
						MenuItem item = inputChromebook();
						C206_CaseStudy.addMenuItem(MenuItemList, item);
					} else if (optionType == 4) {
						// Add Promotion
						Promotion promo = inputChromebook();
						C206_CaseStudy.addPromotion(PromotionList, promo);
					} else if (optionType == 5) {
						// Add all ingredient
						PurchaseOrder ingredient = inputChromebook();
						C206_CaseStudy.addPurchaseOrder(IngredientList, ingredient);

					} else {
						System.out.println("Invalid type");
					}

				} else if (option == OPTION_DELETE) {
					// Loan item
					C206_CaseStudy.setHeader("DELETE");			
					userTypeMenu();
					
					int itemType = Helper.readInt("Enter option to select item type > ");

					if (itemType == 1) {
						// Loan camcorder
						C206_CaseStudy.DeleteAccount(AccountList);
					} else if (itemType == 2) {
						// Loan Chromebook
						C206_CaseStudy.loanChromebook(chromebookList);
					} else {
						System.out.println("Invalid type");
					}

				}

			}

		}

		private static void userTypeMenu() {
			C206_CaseStudy.setHeader("CANTEEN APP TYPES");
			System.out.println("1. Account");
			System.out.println("2. Order");
			System.out.println("3. Menu Item");
			System.out.println("4. Promotion");
			System.out.println("5. Purchase Order");
			
		}

		public static void optionMenu() {
			C206_CaseStudy.setHeader("CANTEEN APP");
			System.out.println("1. Display Inventory");
			System.out.println("2. Add");
			System.out.println("3. Delete");
			System.out.println("4. Quit");
			Helper.line(80, "-");

		}
		
		public static void setHeader(String header) {
			Helper.line(80, "-");
			System.out.println(header);
			Helper.line(80, "-");
		}

		public static String showAvailability(boolean isAvailable) {
			String avail;

			if (isAvailable == true) {
				avail = "Yes";
			} else {
				avail = "No";
			}
			return avail;
		}

		//================================= Option 1 View =================================
		//Acount
		public static String retrieveAccount(ArrayList<Account> AccountList) {
			String output = "";

			for (int i = 0; i < AccountList.size(); i++) {
			// write your code here
				output += String.format("%-64s\n",  AccountList.get(i).toString());
			}
			return output;
		}
		public static void viewAccount(ArrayList<Account> AccountList) {
			C206_CaseStudy.setHeader("ACCOUNT LIST");
			String camcorderFormat = String.format("%-10s %-20s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
					"AVAILABLE", "DUE DATE","OPTICAL ZOOM");
			String output = camcorderFormat;
			 output += retrieveAccount(AccountList);	
			System.out.println(output);
		}
		//Order
		public static String retrieveOrder(ArrayList<Order> OrderList) {
			String output = "";
			
			for (int i = 0; i < OrderList.size(); i++) {
			// write your code here
				output += String.format("%-64s\n", OrderList.get(i).toString());
			}
			return output;
		}
		public static void viewOrder(ArrayList<Order> OrderList) {
			
			C206_CaseStudy.setHeader("CHROMEBOOK LIST");
			String chromebookFormat = String.format("%-10s %-20s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
					 "AVAILABLE", "DUE DATE","OPERATING SYSTEM");
			String output = chromebookFormat;
			 output += retrieveOrder(OrderList);
			System.out.println(output);
		}
		//MenuItem
		public static String retrieveMenuItem(ArrayList<MenuItem> MenuItemList) {
			String output = "";
			
			for (int i = 0; i < MenuItemList.size(); i++) {
			// write your code here
				output += String.format("%-64s\n", MenuItemList.get(i).toString());
			}
			return output;
		}
		public static void viewMenuItem(ArrayList<MenuItem> MenuItemList) {
			
			C206_CaseStudy.setHeader("CHROMEBOOK LIST");
			String chromebookFormat = String.format("%-10s %-20s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
					 "AVAILABLE", "DUE DATE","OPERATING SYSTEM");
			String output = chromebookFormat;
			 output += retrieveMenuItem(MenuItemList);
			System.out.println(output);
		}
		//Promotion
		public static String retrievePromotion(ArrayList<Promotion> PromotionList) {
			String output = "";
			
			for (int i = 0; i < PromotionList.size(); i++) {
			// write your code here
				output += String.format("%-64s\n", PromotionList.get(i).toString());
			}
			return output;
		}
		public static void viewPromotion(ArrayList<Promotion> PromotionList) {
			
			C206_CaseStudy.setHeader("CHROMEBOOK LIST");
			String chromebookFormat = String.format("%-10s %-20s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
					 "AVAILABLE", "DUE DATE","OPERATING SYSTEM");
			String output = chromebookFormat;
			 output += retrieveChromebook(PromotionList);
			System.out.println(output);
		}
		// AllIngredient
		public static String retrievePurchaseOrder(ArrayList<PurchaseOrder> IngredientList) {
			String output = "";
			
			for (int i = 0; i < IngredientList.size(); i++) {
			// write your code here
				output += String.format("%-64s\n", IngredientList.get(i).toString());
			}
			return output;
		}
		public static void viewPurchaseOrder(ArrayList<PurchaseOrder> IngredientList) {
			
			C206_CaseStudy.setHeader("CHROMEBOOK LIST");
			String chromebookFormat = String.format("%-10s %-20s %-10s %-10s %-20s\n", "ASSET TAG", "DESCRIPTION",
					 "AVAILABLE", "DUE DATE","OPERATING SYSTEM");
			String output = chromebookFormat;
			 output += retrievePurchaseOrder(IngredientList);
			System.out.println(output);
		}
		
		//================================= Option 2 Add =================================
		public static Camcorder inputCamcorder() {
			String tag = Helper.readString("Enter asset tag > ");
			String description = Helper.readString("Enter description > ");
			int zoom = Helper.readInt("Enter optical zoom > ");

			Camcorder cc= new Camcorder(tag, description, zoom);
			return cc;
			
		}
		public static void addAccount(ArrayList<Camcorder> camcorderList, Camcorder cc) {
			
			camcorderList.add(cc);
			System.out.println("Camcorder added");
		}
		
		public static Chromebook inputChromebook() {
			String tag = Helper.readString("Enter asset tag > ");
			String description = Helper.readString("Enter description > ");
			String os = Helper.readString("Enter operating system > ");

			Chromebook cb= new Chromebook(tag, description, os);
			return cb;
			
		}	
		public static void addOrder(ArrayList<Chromebook> chromebookList, Chromebook cb) {

			chromebookList.add(cb);
			System.out.println("Chromebook added");
		}
		
		//================================= Option 3 Loan =================================
		public static boolean doLoanCamcorder(ArrayList<Camcorder> camcorderList, String tag, String dueDate) {
			
			boolean isLoaned = false;

			for (int i = 0; i < camcorderList.size(); i++) {
				
				String assetTag = camcorderList.get(i).getAssetTag();
				
				if (tag.equalsIgnoreCase(assetTag)				
						&& camcorderList.get(i).getIsAvailable() == true) {
					
					camcorderList.get(i).setIsAvailable(false);
					camcorderList.get(i).setDueDate(dueDate);
					
					isLoaned = true;
					
				}
			}
			return isLoaned;
		}

		public static void DeleteAccount(ArrayList<Camcorder> camcorderList) {
			C206_CaseStudy.viewAccount(camcorderList);
			String tag = Helper.readString("Enter asset tag > ");
			String due = Helper.readString("Enter due date > ");
			Boolean isLoaned =doLoanCamcorder(camcorderList, tag, due);
			if (isLoaned == false) {
				System.out.println("Invalid asset tag");
			} else {
				System.out.println("Camcorder " + tag + " loaned out");
			}
		}
		

		public static boolean doLoanChromebook(ArrayList<Chromebook> chromebookList, String tag, String dueDate) {
			// write your code here
			boolean isLoaned = false;

			for (int i = 0; i < chromebookList.size(); i++) {
				String assetTag = chromebookList.get(i).getAssetTag();
				
				if (tag.equalsIgnoreCase(assetTag)
						
						&& chromebookList.get(i).getIsAvailable() == true) {
					
					chromebookList.get(i).setIsAvailable(false);
					chromebookList.get(i).setDueDate(dueDate);
					
					isLoaned = true;
					
				}
			}
			return isLoaned;
		}

		public static void loanChromebook(ArrayList<Chromebook> chromebookList) {
			// write your code here
			C206_CaseStudy.viewOrder(chromebookList);
			String tag = Helper.readString("Enter asset tag > ");
			String due = Helper.readString("Enter due date > ");
			Boolean isLoaned =doLoanChromebook(chromebookList, tag, due);
			if (isLoaned == false) {
				System.out.println("Invalid asset tag");
			} else {
				System.out.println("Chromebook " + tag + " loaned out");
			}	
			
		}
		//================================= Option 4 Return =================================
		public static boolean doReturnCamcorder(ArrayList<Camcorder> camcorderList,String tag) {
			boolean isReturned = false;

			for (int i = 0; i < camcorderList.size(); i++) {
				if (tag.equalsIgnoreCase(camcorderList.get(i).getAssetTag())
						&& camcorderList.get(i).getIsAvailable() == false) {
					camcorderList.get(i).setIsAvailable(true);
					camcorderList.get(i).setDueDate("");
					isReturned = true;
					
				}
			}
			return isReturned;
			
		}

		public static void returnCamcorder(ArrayList<Camcorder> camcorderList) {
			C206_CaseStudy.viewAccount(camcorderList);
			String tag = Helper.readString("Enter asset tag > ");
			Boolean isReturned = doReturnCamcorder(camcorderList, tag);
			
			if (isReturned == false) {
				System.out.println("Invalid asset tag");
			} else {
				System.out.println("Camcorder " + tag + " returned");
			}
		}
		// write your doReturnChromebook code here
		public static boolean doReturnChromebook(ArrayList<Chromebook> chromebookList,String tag) {
			boolean isReturned = false;

			for (int i = 0; i < chromebookList.size(); i++) {
				if (tag.equalsIgnoreCase(chromebookList.get(i).getAssetTag())
						&& chromebookList.get(i).getIsAvailable() == false) {
					chromebookList.get(i).setIsAvailable(true);
					chromebookList.get(i).setDueDate("");
					isReturned = true;
					
				}
			}
			return isReturned;
			
		}
		public static void returnChromebook(ArrayList<Chromebook> chromebookList) {
			// write your code here
			C206_CaseStudy.viewOrder(chromebookList);
			String tag = Helper.readString("Enter asset tag > ");
			Boolean isReturned = doReturnChromebook(chromebookList, tag);
			
			if (isReturned == false) {
				System.out.println("Invalid asset tag");
			} else {
				System.out.println("Chromebook " + tag + " returned");
			}
	
	}

}
