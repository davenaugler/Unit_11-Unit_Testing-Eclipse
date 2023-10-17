package com.coderscampus.Lesson_6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationApplication {

	public static void main(String[] args) {

//		Class<AnnotationApplicationTest> obj = AnnotationApplicationTest.class;

		AnnotationApplicationTest testClass = new AnnotationApplicationTest();

		Method[] methods = AnnotationApplicationTest.class.getMethods();

		int testPassed = 0;
		int testFailed = 0;
		int testIgnored = 0;
		
		for (Method method : methods) {
			MyTest myTest = method.getAnnotation(MyTest.class);
			if (myTest != null) {
				try {
					if (myTest.enabled()) {
						method.invoke(testClass);
						testPassed++;
					} else {
						testIgnored++;
					}
				} catch (Exception e) {
					testFailed++;
				}
			}
		}
		System.out.println("Tests passed: " + testPassed + ", Tests failed: " + testFailed + ", Test ignored: " + testIgnored);
	}
}
