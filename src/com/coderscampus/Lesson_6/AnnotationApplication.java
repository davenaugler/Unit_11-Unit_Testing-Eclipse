package com.coderscampus.Lesson_6;

public class AnnotationApplication {
	
	public static void main(String[] args) {
		
		// Annotations are sudo interfaces
		AnnotationApplicationTest testClass = new AnnotationApplicationTest();
		MyTest[] annotations = testClass.getClass().getAnnotationsByType(MyTest.class);
		
		for(MyTest myTest:annotations){
			if (myTest.enabled()) {
				System.out.println("This, MyTest, is enabled: " + myTest);
			} else {
				System.out.println("This, MyTest, is disabled: " + myTest);
			}
		}
	
	}
}

