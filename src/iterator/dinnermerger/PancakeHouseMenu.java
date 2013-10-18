package iterator.dinnermerger;

import java.util.ArrayList;

/**
 * Pancake House的菜单类：PancakeHousMenu
 * */
public class PancakeHouseMenu {
	private ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		addItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast",
				true, 2.99);
		addItem("Regular Pancake Breakfast", "Pancakes with fired eggs, sausage", 
				false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", 
				true, 3.49);
		addItem("Waffles", "Waffles, with your choice of blueberries or strawberries", 
				true, 3.59);
	}
	
	public void addItem(String name, String description,
			boolean vegetarian, double price){
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	//other menu methods here.
	// Lou has a bunch of other menu code that depends on the ArrayList implementation.
	
}