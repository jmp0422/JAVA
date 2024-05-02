package com.multi.a_inheritance;

public class WonderWoman extends Woman {
    private boolean isSwim;

    public WonderWoman(String name, int age, String food, boolean isSwim) {
        super(name, age, food);
        this.isSwim = isSwim;
    }

    public void swimming(){
        System.out.println("수영해버리기");
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    @Override
    public void sleep() {
        System.out.println("잠꾸러기");
    }

    @Override
    public String toString() {
        return "WonderWoman{" + "name=" + getName() + ", age=" + super.getAge() + "food='" + getFood() + '\'' +
                "isSwim=" + isSwim +
                '}';
    }
}
