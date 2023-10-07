package com.coderscampus.Lesson_4;

// K = key , V = value
// This is simply the convention, but you can have many more variable names/objects inside <>
// The generic's are like place holders for objects.

public class MyPair<K, V> {
	
	// This is very similar to the below key and value.
//	private Integer id;
//	private String name;
	
	// To doing this. This is simply brining in the object of the generic's.
	// And above we are hard coding the data type next to the variable name.
	// access modifier - data type - variable name
	private K key;
	private V value;
	
	public MyPair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	
	
	

}
