package Iterator.example4;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	Menu pancakeHouseMenu;
	Menu dinerMenu;
	Menu cafeMenu;
	
	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.cafeMenu = cafeMenu;
	}


	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		Iterator cafeIterator = cafeMenu.createIterator();
		
		System.out.println("메뉴\n-----\n아침메뉴");
		printMenu(pancakeIterator);
		System.out.println("\n점심메뉴");
		printMenu(dinerIterator);
		System.out.println("\n저녁메뉴");
		printMenu(cafeIterator);
	}


	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.print(menuItem.getName()+ ", ");
			System.out.print(menuItem.getPrice()+ " -- ");
			System.out.println(menuItem.getDescription());
		}
		
	}

}
