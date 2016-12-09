package com.db.edu.etl;

//POJO
public class DTO {
    private int[] transformationResult = ;
    private double average;

    public DTO() {
        this(null, 0.0);
    }

    public DTO(int[] transformationResult) {
        this(transformationResult, 0.0);
    }

    public DTO(double average) {
        this(null, average);
    }

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


class DtoDemo {
    public static void main(String[] args) {
        new DTO(0.0);
    }
}
