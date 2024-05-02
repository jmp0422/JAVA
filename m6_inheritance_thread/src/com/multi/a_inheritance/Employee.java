package com.multi.a_inheritance;

public class Employee extends Object{ //extends는 부모에게 상속받는 기능을하고 Object는 최상위부모이다(tostring,등등 기본메서드가지고있는)
                                      //그래서 object는 안적어도 기본 상속이다
    public String name; // 같은 + 다른 패키지 어디서나 사용가능
    String address; // 같은패키지 접근가능
    protected int salary; //같은패키지 또는 다른패키지의 상속 할 경우만 사용가능
    private int rrn; // 이 클래스 안에서만 사용가능

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getRrn() {
        return rrn;
    }

    public void setRrn(int rrn) {
        this.rrn = rrn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", rrn=" + rrn +
                '}';
    }
}
