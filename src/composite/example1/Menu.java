package composite.example1;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent{
	ArrayList menuComponents = new ArrayList();
	String Name;
	String description;
	
	public Menu(String name, String description) {
		Name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}
	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}
	public MenuComponent getChild(int i) {
		return (MenuComponent)menuComponents.get(i);
	}

	public String getName() {
		return Name;
	}

	public String getDescription() {
		return description;
	}
	
	public void print() {
		System.out.print("\n"+getName());
		System.out.println(", "+getDescription());
		System.out.println("---------------------------------");
		
	    Iterator iterator = menuComponents.iterator();
	    while(iterator.hasNext()) {
	    	MenuComponent menuComponent = (MenuComponent)iterator.next();
	    	menuComponent.print();
	    }
	}
}
