package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        ///Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String toDo = "tasks that are to be done";
        String inProg = "tasks that are currently being performed";
        String done = "finished tasks";
        board.getToDoList().addTask(toDo);
        board.getInProgressList().addTask(inProg);
        board.getDoneList().addTask(done);

        //Then
        Assert.assertEquals("tasks that are to be done", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("tasks that are currently being performed", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("finished tasks", board.getDoneList().getTasks().get(0));

    }
}
