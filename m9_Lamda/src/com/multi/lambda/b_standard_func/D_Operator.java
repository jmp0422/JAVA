package com.multi.lambda.b_standard_func;

import com.multi.lambda.b_standard_func.dto.Student;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;


public class D_Operator {
	/*
	 * Operator<T> - 파라미터있고 리턴값있는 CASE
	 *   - Operator 함수적 인터페이스는 매개값과 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
	 *   - Function 함수적 인터페이스와 다르게 주로 매개값을 이용해서 연산하고 동일한 타입으로 결과를 리턴하는 역할을 한다.
	 */
	
	public void method1() {
		
		 /* 
			 ( 모두 데이터타입 동일 )	       
		   BinaryOperator<T> : BiFunction<T,U,R>  상속 : 두개의 파라미터 전달하고 반환		
		   UnaryOperator<T> : Function<T,R> 상속 : 하나의 파라미터 전달하고 반환 
		   DoubleBinaryOperator : 두개의 파라미터 double 전달하고  double 반환
		   DoubleUnaryOperator	  :	: 하나의 파라미터 double 전달하고 double반환  
		   IntBinaryOperator : 두개의 파라미터 int 전달하고  int 반환 
		   IntUnaryOperator	  :	: 하나의 파라미터 int 전달하고 int반환  
		   LongBinaryOperator : 두개의 파라미터 long 전달하고  long 반환
		   LongUnaryOperator	  :	: 하나의 파라미터 long 전달하고 long반환
		  */


		// 익명 객체
		//BinaryOperator : 두개의 파라미터 전달하고 반환	
		BinaryOperator<String> bO = new BinaryOperator<String>() {
		    @Override
		    public String apply(String s1, String s2) {
		        return s1.length() == s2.length() ?
		                "길이가 같음" : s1.length() > s2.length() ? s1 : s2;
		    }
		};
		String str1 = "lambda";
	    String str2 = "java11";
	    String str3 = "test";
	    String result = bO.apply(str1,str2);
        System.out.println(result);
        result = bO.apply(str1,str3);
        System.out.println(result);
        
       //IntBinaryOperator : 두개의 파라미터 int 전달하고  int 반환 
//		IntBinaryOperator intBinaryOperator = (a, b) -> { return a + b; };
		IntBinaryOperator intBinaryOperator = (a, b) -> a + b; 
		
		System.out.println(intBinaryOperator.applyAsInt(10, 20));
		
		
		//IntUnaryOperator	  :	하나의 파라미터 int 전달하고 int반환    Unary 유너리 : 단항
//		IntUnaryOperator intUnaryOperator = (a) -> { return a * a; }; 
		IntUnaryOperator intUnaryOperator = a -> a * a; 
		
		System.out.println(intUnaryOperator.applyAsInt(10));
		
		
	       
		Student student1 = new Student("유재석", 20, "M", 80, 70);
		Student student2 = new Student("이재욱", 20, "M", 100, 100);
		
		BinaryOperator<Student> binaryOperator = (s1, s2) -> {// 객체를 넣고  객체 리턴 
			//System.out.println(Integer.compare(s1.getMath(), s2.getMath()));//비교대상(y)보다 크면 1, 작으면 -1, 동일하면 0
			
			if(s1.getMath() > s2.getMath()) {
				return s1;
			} else {
				return s2;
			}
		
		};
		
		System.out.println(binaryOperator.apply(student1, student2));
		
		// 참고 - 인터페이스의 static 메소드 활용 (maxBy()) https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html
		

		binaryOperator = BinaryOperator.maxBy((s1, s2) -> Integer.compare(s1.getMath(), s2.getMath()));
		
		System.out.println(binaryOperator.apply(student1, student2));		
		System.out.println();		
	}	
}
