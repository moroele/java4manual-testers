package com.db.edu.etl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.RecordType.EIS1_DATA_FILE;
import static com.db.edu.etl.RecordType.EIS2_DATA_FILE;
import static com.db.edu.etl.RecordType.valueOf;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static String[] transform(RecordType recordType, String rawDataRecord) {
        if (recordType == EIS1_DATA_FILE) {
            return null;
        } else if (recordType == EIS2_DATA_FILE) {
            System.out.println("ee");
            System.out.println("rr");
            return null;
        } else {
            return null;
        }
    }

    public static String extract(RecordType recordType) {
        valueOf("EIS3");
        logger.debug("entering ");
        logger.debug("exit ");
        return null;
    }

    public static void load(String[] structureToSave) {
        //.....
    }

}
