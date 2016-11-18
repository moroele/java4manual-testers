package com.db.edu.etl;

import com.db.edu.EtlApp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Controller {
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    public static String[] transform(RecordType recordType, String rawDataRecord) {
        logger.debug("Entering transform method with args {}", recordType, rawDataRecord);
        switch (recordType) {
            case EIS1_DATA_FILE: {
                return rawDataRecord.split(",");
            }
            case EIS2_DATA_FILE: {
                return rawDataRecord.split(";");
            }
            default: return null;
        }

    }
    public static String extract(DataSourceType datasourcetype, String dataSource) {
        logger.debug("Entering extract method with args {}", dataSource);
        return null;
    }

    public static void load(String[] loadingData, TargetType targetType, String target) {
        logger.debug("Entering load method with args {}", loadingData, target);
    }
}
