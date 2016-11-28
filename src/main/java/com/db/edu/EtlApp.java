package com.db.edu;

import com.db.edu.etl.RecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.db.edu.etl.Controller.extract;
import static com.db.edu.etl.Controller.load;
import static com.db.edu.etl.Controller.transform;

public class EtlApp {
    private static final Logger logger = LoggerFactory.getLogger(EtlApp.class);
    private EtlApp() {}
    public static String[] extractResult;
    public static String[] transformResult;

    public strictfp static void main(String... args) {
        logger.debug("Entering main method with args {}", args);

        int i1 = 4, i2 = 3;
        double result = i1 % (float)i2; //-, +, *, /, %
        char c = 'w';
        System.out.println(--c); //c++, ++c
        System.out.println(c); //c++, ++c
        c += 5; //c = c + 5;

        System.out.println(5 + 5  + "5"); //"tt" + "ddd"

        boolean booleanResult = i1 != i2; //!=, >, <, <=, >=
        boolean function = f1() | !f2(); //&, |, &&, ||
        // fopen("fff") or die();
        System.out.println(4 >>> 33); //|, &, !, ^, >>, >>>, <<
    }

    private static boolean f2() {
        return false;
    }

    private static boolean f1() {
        return false;
    }
}
