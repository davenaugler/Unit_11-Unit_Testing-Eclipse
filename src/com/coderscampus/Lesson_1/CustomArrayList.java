package com.coderscampus.Lesson_1;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;

	@Override
	public boolean add(T item) {
		if (items.length == size) {
			expandBackingObjectArray();
		}
		items[size++]=item;
//		System.out.println(items);
		return true;
	}

	private void expandBackingObjectArray() {
		Object[] oldArray = items;
		items = new Object[size *2];
		for (int i = 0; i < oldArray.length; i++) {
			items[i] = oldArray[i];
		}
		
	}

	@Override
	public int getSize() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(int index) {
		
		return (T) items[index];
	}

}
