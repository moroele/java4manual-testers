package com.db.edu.etl;

//POJO
public class DTO {
    private int[] transformationResult;
    private double average;

    public DTO(int[] transformationResult, double average) {
        this.transformationResult = transformationResult;
        this.average = average;
    }

    public int[] getTransformationResult() {
        return transformationResult;
    }

    public double getAverage() {
        return average;
    }
}




class Woman {

    public int getAge() {
        return random(0, 25);
    }

    public void setAge(int age) {
        this.age = age;
    }
}