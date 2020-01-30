package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void getLastLogTest() {
        //Given
        //When
        String log1 = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals(Logger.getInstance().getLastLog(), log1);
    }
}
