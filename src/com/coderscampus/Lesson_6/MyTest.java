package com.coderscampus.Lesson_6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyTest {
	
	// Annotations are sudo interfaces
	// When creating an Annotation you need to tell Java   
	
	boolean enabled() default true;

}
