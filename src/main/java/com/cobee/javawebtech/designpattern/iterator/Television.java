package com.cobee.javawebtech.designpattern.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Television<T> {

	private List<T> elements;

	public Television() {
		super();
		elements = new ArrayList<T>();
	}
	
	public Iterator<T> iterate()
	{
		return new TVIterator();
	}
	
	public void add(T t)
	{
		elements.add(t);
	}
	
	class TVIterator implements Iterator<T>
	{

		private int current = 0;
		
		public boolean hasNext() {
			
			return current <= (elements.size() - 1);
			
		}

		public T next() {
			
			return elements.get(current++);
			
		}

		public void remove() {
			elements.remove(--current);
		}
		
	}
	
}
