package com.db.edu.loggerdemo2;

import loggerdemo2.ConsoleSaver;
import loggerdemo2.Logger;
import loggerdemo2.Saver;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoggerTest {
    @Test
    public void shouldSaveMessageWhenMessageNotEmpty() {
        //G
        Saver stubSaver = mock(Saver.class);
        //when(stubSaver.save("")).thenThrow()
        Logger sut = new Logger(stubSaver);

        //W
        sut.log("test string");

        //T
        //sout
    }
}