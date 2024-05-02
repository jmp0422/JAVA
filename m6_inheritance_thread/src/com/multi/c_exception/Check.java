package com.multi.c_exception;

import java.io.IOException;

public class Check {
    //CheckedException 은 반드시 예외처리를 해줘야한다.
    // 조건문, 소스 코드의 수정으로 해결이 안된다. -- 예측불가
    // 주로 외부 매개체의 입출력시 발생

    //IOException  입출력 과정중 문제가 생겼을때 던지는 예외

    public void method1() throws IOException {
        method2();
    }

    private void method2() throws IOException {
        /*1. try~ catch()처리 : 이구문에서 바로 예외를 처리하겠다.
         *
         * try :  예외가 발생할 가능성이있는 코드를 블록내에 작성
         * catch (발생될예외클래스 매개변수): try 구문에서 예외가 발생하면 어떻게 처리를 할것인지 작성
         * finally : try~catch 문 수행후 반드시 꼭 실행되어야 하는 코드를 작성
         *
         * */
        //2. throws : 지금 이 메소드에서 예외를 처리하지 않고 현재 이메소드를 호출한 곳으로 위임하겠다
        byte[] aa = {'a', 'b', 'c'};
//        try{
//            System.out.println(aa);
//        }catch(IOException e){
//            e.printStackTrace();
//        }
        System.out.println(aa);
    }

//    public void method3() {
//        // try ~ with ~ resource :  반납할 close자원 이 있는경우 처리 -> try () 괄호 안에 객체 생성할수 있고
//        //이 괄호안에서 생성한 객체는 close 해주지않아도 자동 close 된다.
//        try
//                (BufferedReader br = new BufferedReader(new FileReader((""))))
//        {
//
//         catch(
//                FileNotFoundException e){
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        }
//    }
}
