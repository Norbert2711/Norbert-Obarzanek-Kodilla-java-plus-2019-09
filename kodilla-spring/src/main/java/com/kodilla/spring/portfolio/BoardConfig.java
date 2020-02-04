package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("List tasks to Do")
    TaskList toDoList;

    @Autowired
    @Qualifier("List tasks in progress")
    TaskList inProgressList;

    @Autowired
    @Qualifier("List tasks done")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "List tasks to Do")
    TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "List tasks in progress")
    TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "List tasks done")
    TaskList getDoneList() {
        return new TaskList();
    }
}
