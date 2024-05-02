package com.multi.c_exception;

import java.util.Scanner;

public class Uncheck {
    // - 예외(Exception) : 소스 코드 수정으로 해결 가능한 에러

    // RuntimeException이란 : 미리 정의 되어 있고 이들이 명시하는 예외 상황은
    //						프로그램의 종료로 이어지는 것이 자연스러운 경우가 많다.
    //						( 예외처리를 통해 프로그램이 종료되지 않게 처리 할 수 있다.)


    // - 예외 처리 방법
    // 	1. if문 : 간단한 예외 처리시
    //				 (장점은 프로그램이 종료되지 않고 그 예외 상황에 있어서는 if문이
    //				  실행되지 않게 하여 프로그램의 흐름을 조절할 수 있다.)
    //				 (단점은 if문이 너무 자주 혹은 깊이 사용되면 그게 예외 상황을 처리하는 것인지
    //				  프로그램 상의 주 흐름 코드인지가 구분이 안된다.)
    //
    //		2. try-catch문 : 예외상황이 발생할 수 있는 지역에 한해서 예외 처리를 하고
    //						어떻게 처리할지도 결정
    //						a. try블록 안은 하나의 일의 단위(트랜잭션)이다.
    //						   예외 상황이 발생하는 부분
    //						b. catch 블록의 ()안은 try블록 안에서 발생한 예외클래스의
    //						   인스턴스 참조변수값(객체의 주소값)이 넘어온다.(JVM이 해줌)
    //
    //     3. throws : 예외처리를 하지 않고 자신을 호출한 상위 메소드에게 처리를 위임
    //     			main()메소드까지 위임하고 나서도 throws를 하게 되면
    //     			마지막엔 JVM이 예외 처리를 함

    private Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.println("정수 1 : ");
        int num1 = sc.nextInt();
        System.out.println("정수 2 : ");
        int num2 = sc.nextInt();


        int result = 0;

//        try {
//            result = num1 / num2;
//            System.out.println(result);
//        } catch(ArithmeticException e){
//            System.out.println("0으로 나눌수없습니다");
//        }

        if(num1 ==0 || num2 == 0){
            System.out.println("0으로 나눌수없습니다");
        }else
            System.out.println(result);
    }

    public void method2(){
        System.out.println("배열의 길이 : ");
        int num = sc.nextInt();

//        try {
//            int arr[] = new int[num];
//        } catch(NegativeArraySizeException e){
//            System.out.println("양수값을 입력하세요");
//        }

        if(num<0){
            System.out.println("양수값을 입력하세요");
        }
        int arr[] = new int[num];

    }

    public void method3(){

        try {
            Object obj = 'a'; // char 오토박싱 -> character 다형성 -> object
//            String str = (String) obj;// 런타임에러
            String str = String.valueOf(obj);

            int[] arr = new int[2];
            arr[0] = 1;
            arr[1] = 2;
//            arr[2] = 3;

            String str1 = null;
            int length = str1.length();

//        }catch(ClassCastException e){
//            System.out.println("잘못된 형변환입니다");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("배열공간 부족");
//        }
        }catch(ClassCastException | ArithmeticException | NullPointerException e){
            e.printStackTrace(); // 유형 + 에러발생경로 + 에러메세지
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println(e.getMessage()); // 에러메세지
            System.out.println(e); // 유형 + 에러메세지
        }finally{
            System.out.println("실행중");
        }
        System.out.println("코드끝");
    }


}
