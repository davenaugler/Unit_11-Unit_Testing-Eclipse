package com.coderscampus.Lesson_5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class ReflectionApplication {
	
	PersonRepository personRepo = new PersonRepository();
	CatRepository catRepo = new CatRepository();
	CarRepository carRepo = new CarRepository();
	
	@Test
	public void reflection_test() {
		Person person = new Person();
		person.setAge(18);
		person.setName("Julie");
		person.setEyeColor("Brown");
		Method[] methods = person.getClass().getMethods();
		
		Cat cat = new Cat();
		Car car = new Car();

		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		
		save(person, personRepo);
		save(cat, catRepo);
		save(car, carRepo); 
	}
	
	public <T, R> void save(T obj, R repo) {
		Class<T> c = (Class<T>) obj.getClass();
		try {
			Method saveMethod = repo.getClass().getMethod("save", c);
			saveMethod.invoke(repo, obj);
		} catch (NoSuchMethodException | SecurityException | 
				IllegalAccessException | InvocationTargetException e) {
			System.err.println("Oops there was an error getting the save method");
		}
	}
	
	
	
	
	
	
	
	
	public void save(Person person) {
		// Purpose is to save the person to the database
		// get repository and call the save method on the repository
		PersonRepository personRepoository = new PersonRepository();
		personRepoository.save(person);
	}
	
	public void save(Cat cat) {
		// Purpose is to save the person to the database
		// get repository and call the save method on the repository
		CatRepository personRepoository = new CatRepository();
		personRepoository.save(cat);
	}
	
	public void save(Car car) {
		// Purpose is to save the person to the database
		// get repository and call the save method on the repository
		CarRepository personRepoository = new CarRepository();
		personRepoository.save(car);
	}

}
