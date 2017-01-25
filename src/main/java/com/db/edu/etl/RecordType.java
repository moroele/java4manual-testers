package com.db.edu.etl;

public enum RecordType {
    EIS1_DATA_FILE, EIS2_DATA_FILE, EIS3, EIS4, EIS5
}

class RT2 {
    public static final RT2 EIS1_DATA_FILE = new RT2("EIS1_DATA_FILE", 1);
    public static final RT2 EIS2_DATA_FILE = new RT2("EIS2_DATA_FILE", 2);
    public static final RT2 EIS3 = new RT2("EIS3", 3);

    private String name;
    private int ordinal;

    private RT2(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }
}


