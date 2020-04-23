package adapter.example2;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator {
	Enumeration enumAdapter;
	
	public EnumerationIterator(Enumeration enumAdapter) {
		super();
		this.enumAdapter = enumAdapter;
	}

	@Override
	public Object next() {
		return enumAdapter.nextElement();
	}
	
	
	@Override
	public boolean hasNext() {
		return enumAdapter.hasMoreElements();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
	
}
