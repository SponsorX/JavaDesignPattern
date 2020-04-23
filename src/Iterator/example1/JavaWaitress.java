package Iterator.example1;

import java.util.ArrayList;

public class JavaWaitress {

	public static void main(String[] args) {
		JavaWaitress javawaitress = new JavaWaitress();
		
		javawaitress.menuPrint();
	}

	private void menuPrint() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		ArrayList breakfastItems = pancakeHouseMenu.getMenuItems();
		
		DinerMenu dinerMenu = new DinerMenu();
		MenuItem[] lunchItems = dinerMenu.getMenuItems();
		
		for(int i = 0; i < breakfastItems.size(); i++) {
			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
		System.out.println();
		for(int i = 0; i < lunchItems.length; i++) {
			if (lunchItems[i] != null) {
				MenuItem menuItem = lunchItems[i];
				System.out.print(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice() + " ");
				System.out.println(menuItem.getDescription());
			}
		}
		
	}

}
