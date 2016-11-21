package com.db.edu.etl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.RecordType.valueOf;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static String[] transform(RecordType recordType, String[] rawDataRecords) {
        int counter = 0;
        while(counter < rawDataRecords.length) {
            counter++;
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
        }

        return null;
    }

    public static String[] extract(RecordType recordType) {
        valueOf("EIS3");
        logger.debug("entering ");
        logger.debug("exit ");
        return null;
    }

    public static void load(String[] structureToSave) {
        //.....
    }

}
