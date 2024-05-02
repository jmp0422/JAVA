package com.multi.lambda.b_standard_func;

import com.multi.lambda.b_standard_func.dto.Student;

import java.util.function.Function;
import java.util.function.ToIntFunction;



public class C_Function extends Student{
	/*
	 *  Function<T, R> - apply(T t) : 파라미터 있고 리턴값있는 CASE
	 *   - Function 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
	 *   - 주로 매개값을 리턴값으로 매핑(타입 변환)하는 역활을 한다. 
	 *    
			@param <T> the type of the input to the function
			@param <R> the type of the result of the function

        	R apply(T t) 구현 
    */
	 
	
	public void method1() {
		
	       //익명 객체  
		// Function<String,Integer> 인풋타입, 리턴타입
        Function<String,Integer> func1 = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        String str = "lambda";
        int r = func1.apply(str);
        System.out.println("익명객체 - lambda 길이 : " + r );
		
		
		// 람다 
        
        Function<String,Integer> func2 = s -> s.length();
        r = func2.apply(str);
        System.out.println("람다 - lambda 길이 : " + r );


		Function<Integer, Integer> func3= (value) -> value + 1000;
        r = func3.apply(10);
        System.out.println(r);
        
		
		Student student = new Student("유재석", 20, "M", 80, 70);
//		Function<Student, String> function = (student) -> {
//			return student.getName();
//		};
		
		
		Function<Student, String> func4 = s -> s.getName();
		System.out.println("넌 이름이 뭐니? : " + func4.apply(student));
		
		
		Function<Student, Integer> func5 = s -> s.getAge();
		System.out.println("나이는? : " + func5.apply(student));
		


	   /* 
			Function 에서 파생된 인터페이스	        
			BiFunction<T,U,R> : T와 U 전달하고 R타입으로 반환
			DoubleFunction<R> : double로 전달하고 R타입으로 반환
			IntFunction<R> : int로 전달하고 R타입으로 반환
			IntToDoubleFunction : int로 전달하고 double타입으로 반환
			IntToLongFunction : int로 전달하고 long타입으로 반환
			LongToDoubleFunction : long로 전달하고 double타입으로 반환
			LongToIntFunction : long로 전달하고 int타입으로 반환
			ToDoubleBiFunction<T, U> : 객체 T와 U를 double로 반환
			ToDoubleFunction : 객체 T를 double로 반환
			ToIntBiFunction<T, U> : 객체 T와 U를 int로 반환
			ToIntFunction	: 객체 T를 int로 반환
			ToLongBiFunction<T, U>: 객체 T와 U를 long으로 매핑
			ToLongFunction : 객체 T를 long으로 반환	
	    */
		
		
		//ToIntFunction 활용한 메서드만들어서 해보자 
		System.out.print("[수학점수] : ");
		printInt((s) -> { return s.getMath(); }, student);
		printInt(s -> s.getMath(), student);
		
		System.out.print("[영어점수] : ");
		printInt(s -> s.getEnglish(), student);
		
		System.out.println();
	}
	
	public void printInt(ToIntFunction<Student> function, Student student) {// int반환하는 인터페이스 (객체를 받아서 인트로 반환하는 람다식을 받아서 ) , student 객체를 받는 메소드
		
		System.out.println(function.applyAsInt(student));//student 로 toIntFuncion 의 메소드 applyAsInt 를 수행하여 람다식으로 실행된 int 반환
	}
}
