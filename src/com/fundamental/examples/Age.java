package com.fundamental.examples;

public class Age {

    private int age;

    public Age(int age) {
        if(age<0 || age>100){
            throw new IllegalArgumentException(Integer.toString(age));
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private int getAgeInGivenYear(int num){
        return age+num;
    }
}
