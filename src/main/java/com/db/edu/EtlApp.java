package com.db.edu;

import com.db.edu.etl.Controller;
import com.db.edu.etl.RecordType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.db.edu.etl.Controller.extract;
import static com.db.edu.etl.Controller.load;
import static com.db.edu.etl.Controller.transform;
import static org.junit.Assert.assertEquals;

public class EtlApp {
    private int i;

    public strictfp static void main(String... args) {
        new EtlApp();
    }
}


