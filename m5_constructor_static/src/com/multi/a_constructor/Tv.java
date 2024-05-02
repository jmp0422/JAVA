package com.multi.a_constructor;

public class Tv {

    private int ch;
    private int vol;
    private boolean onOff;
    public static int count;

    /* 생성자 작성 방법
     * [표현식]
     * 접근제한자 클래스명(매개변수) {
     *     인스턴스 생성 시점에 수행할 명령 기술 (주로 필드를 초기화)
     *     this.필드명 = 매개변수;		//설정자(setter) 여러 개의 기능을 한 번의 호출로 수행할 수 있다.
     * }
     *
     * 생성자 작성 방법은 메소드를 작성하는 방법과 매우 유사하다. 하지만 두 가지 사항을 조심해야 한다.
     * 1. 생성자 메소드는 반드시 클래스의 이름과 동일해야 한다. (대/소문자까지 같아야 함)
     * 2. 생성자 메소드는 반환형을 작성하지 않는다. (작성하는 경우 생성자가 아닌 메소드로 인식한다.)
     * */

    /* 기본생성자(매개변수 없는 생성자)와 매개변수 있는 생성자
     * 기본생성자는 자바 Compiler가 자동으로 추가해주는 구문이지만 명시적으로 작성할 수 도 있다.
     * 매개변수 있는 생성자가 한 개라도 존재하는 경우 기본생성자를 자동으로 추가해주지 않기 때문에
     * 기본생성자가 필요한 경우에는 반드시 명시적으로 작성해 주어야 한다.
     * */

    public Tv() {
        super();
        count++;
    }

    public Tv(int ch, int vol, boolean onOff) {
        this.ch = ch;
        this.vol = vol;
        this.onOff = onOff;

        count ++;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public void on() {
        onOff = true;
        System.out.println("코드를 끼다.");
        System.out.println("켜지다.");

    }

    public void off() {
        onOff = false;
        System.out.println("끄다.");
        System.out.println("코드를 뽑다.");
    }

    @Override
    public String toString() {
        return "Tv{" +
                "ch=" + ch +
                ", vol=" + vol +
                ", onOff=" + onOff +
                '}';
    }

     public void test() {}
//     public void test() {} //컴파일 에러 -메소드의 시그니처가 동일한경우
//
//     private void test() {} //컴파일에러 - 접근제어자는 메소드 시그니처에 해당하지 않음
//
//    public int test() { return 0; } //컴파일에러 - 시그니처가 동일할 경우 구별불가(반환형은 시그니처에 해당되지않는다)
//
//
//    public void test(int num) {} //매개변수 이름이 달라서 가능
//
//    public void test(int num2) {} //매개변수 이름이 달라서 가능
//
//    public void test(int num, int num2) {} //매개변수의 개수에 따른 성립
//
//    public void test(int num, String str) {} //매개변수 타입이 달라서 가능
//
//    public void test(String str, int num) {}//매개변수 순서가 달라서 가능



}

