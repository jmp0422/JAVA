package com.multi.lambda.b_standard_func;

import com.multi.lambda.b_standard_func.dto.Student;

import java.util.function.IntPredicate;
import java.util.function.Predicate;


public class E_Predicate {
	/*
	 * Predicate<T> - test(T t) - 파라미터 있고 리턴값(boolean) 있는 CASE
	 *   - Predicate 함수적 인터페이스는 매개변수와 boolean 리턴값이 있는 testXXX() 메소드를 가지고있다.
	 *   - 이 메소드들은 매개값을 조사해서 true/false를 리턴하는 역활을 한다.
	 * 
	 */
	
	public void method1() {
	     //익명 객체 
		Predicate<String> predicate1 = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length()>5; //매개변수를 받아 true/false를 반환할 조건식
            }
        };
 
        String str = "lambda";
        boolean r1 = predicate1.test(str);
        System.out.println(r1);
 
        Predicate<Integer> predicate2 = (value)-> value > 1000;
        int number = 99;
        boolean r2 = predicate2.test(number);
        System.out.println(r2);

        //or(),and() Predicate들을 연결하는 메소드
        Predicate<Integer> predicate3 = (value) -> value > 10;

        boolean result = predicate2.and(predicate3).test(5);
        System.out.println("5 : num > 10 and num > 1000 ? " + result);
        
        boolean result2 = predicate2.or(predicate3).test(15);
        System.out.println("5 : num > 10 or num > 1000 ? " + result2);
		
		Student student1 = new Student("유재석", 20, "M", 60, 70);
		Student student2 = new Student("이효리", 20, "F", 100, 100);
		
		Predicate<Student> predicate = (student) -> {
			return student.getGender().equals("M");
		};
		
		System.out.println("유재석은 남자입니까? : " + predicate.test(student1));
		System.out.println("이효리는  남자입니까? : " + predicate.test(student2));
		System.out.println("유재석 의 평균 점수는? : " + 
//				평균점수구하는 메소드만들러가자  - 만들고 점수 조절해서 값안나오는거도 확인 
				avg((s) -> s.getMath() > 50 && s.getEnglish() > 50, student1)
		);
		
		
		
	
		
		
		
		
//		IntPredicate intPredicate = (int i) -> { return i > 100; };
		IntPredicate intPredicate = i -> i > 100;
		
		System.out.println(intPredicate.test(100));
		System.out.println(intPredicate.test(101));
		
		System.out.println();
	}
	
	public double avg(Predicate<Student> predicate, Student student) {
		double avg = 0;
		
		if(predicate.test(student)) {// 수학점수랑 영어점수가 50보다 크면 
			avg = (student.getMath() + student.getEnglish()) / 2;
		}
		
		return avg; 
	}
	
	
}
