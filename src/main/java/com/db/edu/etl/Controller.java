package com.db.edu.etl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.RecordType.valueOf;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static int[] transform(RecordType recordType, String[] rawDataRecords) {
        int counter = 0;
        while(true) {
            if (counter < rawDataRecords.length) break;
            counter++;

            if ((rawDataRecords[counter] == null) || (rawDataRecords[counter] == "") ) {
                continue;
            }

            //region switch
            switch (recordType) {
                case EIS1_DATA_FILE:
                    System.out.println("fffff");
                    System.out.println("fffff");
                    System.out.println("fffff");
                    break;
                case EIS2_DATA_FILE:
                    System.out.println("ffffffff");
                    break;
                case EIS3:
                    System.out.println("www");
                    break;
                case EIS4:
                    System.out.println("hhhhh");
                    break;
                default:
                    System.out.println("2222");
            }
            //endregion
        }

        return null;
    }

    public static byte[] extract(RecordType recordType) {
        //Primitive types:
        //byte, short, int, long
        //float, double
        //char
        //boolean
        long var = 10000000000000L;
        double var2 = -0.5e-5;
        float var3 = 1.0f;
        char c = 'Ы';
        boolean b = true | false;

        int var4 = 5;
        byte b2 = (byte)var4;

        byte b1 = 5;
        byte b3 = 5;
        int sum = b1 + b3;


        logger.debug("entering ");
        logger.debug("exit ");
        return null;
    }

    public static void load(String[] structureToSave) {
        //.....
    }

}
