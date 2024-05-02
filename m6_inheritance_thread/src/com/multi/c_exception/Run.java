package com.multi.c_exception;

import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        // 에러종류
        // - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러 --> 소스코드로 해결안됨 --> 심각한 에러
        // - 컴파일 에러 : 소스코드 문법상 오류 --> 빨간줄로 애초에 오류 알려줌 (매번 컴파일이 진행되고 있기 때문에 컴파일시 문제가 있는 것들을 미리 알려준다)
        // - 런타임 에러 : 코드 상으로는 문제가 없는데 프로그램 실행할 때 발생하는 에러 (사용자의 실수 일 수도 있고 개발자가 예측 가능 한 경우를 제대로 처리 안 해 놓은걸 수도 있다)

        // - 논리 에러 : 문법상으로도 문제 없고 실행했을 때도 굳이 문제는 없지만 프로그램 의도상 맞지 않는 것

        // 우리는 시스템 에러를 제외한 컴파일에러, 런타임에러, 논리에러와 같은 비교적 덜 심각한 것들을 가지고 작업
        // 이런 것들을 "예외"라고 한다. -->Exception

        // 이러한 예외들이 "발생"했을 경우에 대해서 "처리"하는 방법을 "예외처리"라고 한다.

        // 예외처리 방법
        // 1. try~catch문을 이용
        // 2. throws를 이용 (떠넘기기)
        // 3. try~with~resource
//        Uncheck un = new Uncheck();
////        un.method1();
//        un.method3();
//        System.out.println("메인끝");


        Check ch = new Check();
        try {
            ch.method1();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        System.out.println("메인끝");
    }

}
