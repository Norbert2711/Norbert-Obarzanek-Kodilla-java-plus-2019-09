package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testTaskFactoryDrivingTask(){

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        //Then
        Assert.assertEquals("Driving",  drivingTask.getTaskName());
        Assert.assertEquals(false,  drivingTask.isTaskExecuted());
        System.out.println(drivingTask);
    }

    @Test
    public void testTaskFactoryShoppingTask(){

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("Shopping",  shoppingTask.getTaskName());
        Assert.assertEquals(true,  shoppingTask.isTaskExecuted());
        System.out.println(shoppingTask);
    }

    @Test
    public void testTaskFactoryPaintingTask(){

        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintTask = taskFactory.makeTask(TaskFactory.PAINTING);
        //Then
        Assert.assertEquals("Painting",  paintTask.getTaskName());
        Assert.assertEquals(false,  paintTask.isTaskExecuted());
        System.out.println(paintTask);
    }
}
