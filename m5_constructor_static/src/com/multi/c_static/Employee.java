package com.multi.c_static;

public class Employee {

    private String name;
    private int age;
    private String gender;
    public static int count;
    public static int sum;

    public Employee(String name, int age, String gender) {

        count++;
        sum += age;

        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //일반메서드는 객체생성후, "주소로 접근"해서 호출해야한다.!!
//일반메서드는 객체생성후, 호출(사용)할 수 있다.
//평균을 객체생성과 상관없이 아무때나 구하고 싶다.!!
//객체생성과 상관없이 기능을 정의하고 싶으면, static!!으로 만들어야 한다.

    public static int getavg() {
        return sum / count;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

}
