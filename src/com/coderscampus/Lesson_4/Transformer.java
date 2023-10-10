//package com.coderscampus.Lesson_4;
//
//public class Transformer<T1, T2> {
//	
//	public String join (T1 v1, T2 v2) {
//		return v1.toString() + " -> " + v2.toString();
//	}
//
//}

// Instead of putting generic's with the class name
// put them with the method after 'static'
// When you specify generic's at the method level you 
// don't have to specify the types in the @Test method 
// being built.

package com.coderscampus.Lesson_4;

import java.util.List;
import java.util.stream.Collectors;

public class Transformer {
	
	public static <T1, T2> String join (T1 v1, T2 v2) {
		return v1.toString() + " -> " + v2.toString();
	}
	
	public static String join(List<? extends Number> list) {
		return list.stream().map(Number::toString).collect(Collectors.joining(", "));
//		return list.stream().collect((Collector<?, A, R>) Collectors.joining("\n"));
	}

}
