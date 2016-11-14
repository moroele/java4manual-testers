package com.db.edu;

import com.db.edu.etl.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrinterApp {
    private static final Logger MY_SUPER_PUPER_LOGGER = LoggerFactory.getLogger(PrinterApp.class);
    private PrinterApp() {}

    public static void main(String... args) {
        MY_SUPER_PUPER_LOGGER.debug("Entering main method with args {}", args);

        System.out.println(Controller.transform(null, null));
    }
}
