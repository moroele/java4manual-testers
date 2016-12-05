package com.db.edu;

import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static com.db.edu.etl.Controller.extract;
import static com.db.edu.etl.Controller.load;
import static com.db.edu.etl.Controller.transform;

public class EtlApp {
    private static final Logger logger = LoggerFactory.getLogger(EtlApp.class);

    private EtlApp() {}

    public strictfp static void main(String... args) {
        logger.debug("Entering main method with args {}", args);

        Integer i1 = 500; //auto-boxing + intern (-127..128)
        Integer i2 = 500; //auto-boxing
        System.out.println(i1 == i2);

        Controller.transform(
            RecordType.EIS1_DATA_FILE,
            new int[] {1,3,4,5,6,1,2,111,3}
        );
    }
}