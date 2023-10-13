package com.coderscampus.Lesson_5;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

public class ReflectionApplication {
	
	@Test
	public void reflection_test() {
		Person person = new Person();
		person.setAge(18);
		person.setName("Julie");
		person.setEyeColor("Brown");
		Method[] methods = person.getClass().getMethods();
		
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
	
	public <T> void save(T data) {
		Class<T> c = (Class<T>) data.getClass();
		String nameOfClass = c.getName();
		String nameOfRepository = nameOfClass + "Repository";
		try {
			Class<?> repositoryClass = Class.forName(nameOfRepository);
			Method saveMethod = repositoryClass.getMethod("save");
//			saveMethod.invoke(saveMethod, null)
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
			System.out.println("Oops the class: " + nameOfRepository + " doesn't exist");
		}
	}
	
	
	
	
	
	
	
	
	public void save(Person person) {
		// Purpose is to save the person to the database
		// get repository and call the save method on the repo
		PersonRepoository personRepoository = new PersonRepoository();
		personRepoository.save(person);
	}
	
	public void save(Cat cat) {
		// Purpose is to save the person to the database
		// get repository and call the save method on the repo
		CatRepoository personRepoository = new CatRepoository();
		personRepoository.save(cat);
	}
	
	public void save(Car car) {
		// Purpose is to save the person to the database
		// get repository and call the save method on the repo
		CarRepoository personRepoository = new CarRepoository();
		personRepoository.save(car);
	}

}
