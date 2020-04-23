package composite.example1;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator {
	ArrayList items;
	int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if(position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = (MenuItem)items.get(position);
		position++;
		return menuItem;
	}

}
