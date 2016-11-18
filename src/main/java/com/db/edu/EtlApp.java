package com.db.edu;

import com.db.edu.etl.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EtlApp {
    private static final Logger logger = LoggerFactory.getLogger(EtlApp.class);

    public static void main(DataSourceType datasourcetype, String dataSource, TargetType targetType, String target, RecordType recordType) {
        logger.debug("Entering main method with args {}", dataSource, target);
        System.out.println( "Hello World!" );
        String rawdata;
        String[] transfdata;
        rawdata = Controller.extract(datasourcetype, dataSource);
        transfdata = Controller.transform(recordType, rawdata);
        Controller.load(transfdata, targetType, target);
        RecordType.values();
    }
}
