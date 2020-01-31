package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {

        //Given
        String log1 = "First log";
        String log2 = "Second log";
        //When
        Logger.getInstance().log(log1);
        //Then
        Assert.assertEquals(log1, Logger.getInstance().getLastLog());

    }
}