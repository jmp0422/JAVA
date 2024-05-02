package com.multi.lambda.b_standard_func;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class A_Consumer {
    /*
	 *  Consumer<T> - accpet(T t) : 파라미터 있고 리턴값없는  CASE
	 *   - Consumer 함수적 인터페이스는 리턴값이 없는 accept() 메소드를 가지고 있다.
	 *   - accept() 메소드는 단지 매개값을 소비하는 역활을한다. (사용만하고 리턴값이 없다.)
	 *   @param <T> the type of the input to the operation
       		void accept(T t)
	 *
	 */
    public static void main(String[] args) {
        new A_Consumer().method1();
    }

    public void method1() {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        Consumer<String> consumer1 = (String str) -> {
            System.out.println(str);


        };
        Consumer<String> consumer2 = s -> System.out.println("매개값출력 1-> " + s);
        consumer2.accept(" consumer test 1");


        consumer.accept("consumer test");

        consumer1.andThen(consumer2).accept("한 개의 매개값(제네릭으로 지정된 타입)을 받아서 소비");
        /*
			Consumer 에서 파생된 인터페이스
			BiConsumer :  파라미터 2개
			DoubleConsumer : double타입의 파라미터
			IntConsumer : int타입의 파라미터
			LongConsumer : long타입의 파라미터
			ObjDoubleConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 double
			ObjIntConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 int
			ObjLongConsumer : 두개의 파라미터중에 하나는 obj 다른하나는 long

         */


        //BiConsumer
        BiConsumer<String, String> biConsumer = (String str1, String str2) -> {
            System.out.println(str1 + str2);
        };

        biConsumer.accept("BiConsumer : ", "두 개의 매개값(제네릭으로 지정된 타입)을 받아서 소비한다.");
        DoubleConsumer doubleConsumer = (val) -> System.out.println(val);
        doubleConsumer.accept(8.0);
    }


}
