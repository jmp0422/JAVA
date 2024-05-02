package com.multi.c_static;

public class Company {

    public static void main(String[] args) {

        Employee member1 = new Employee("james", 41, "male");
        Employee member2 = new Employee("Edwards", 23, "male");
        Employee member3 = new Employee("rose", 31, "female");

        System.out.println(member1);
        System.out.println(member2);
        System.out.println(member3);
        System.out.println(Employee.count); //총인원
        System.out.println(Employee.sum/Employee.count); //평균나이(스태틱변수로)
        System.out.println(Employee.getavg()); //매서드로
    }

}
