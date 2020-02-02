package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    public BoardConfig() {

    }

    @Bean
    public Board getBoard() {
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }
    @Bean
    TaskList getToDoList() {
        return new TaskList();
    }
    @Bean
    TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean
    TaskList getDoneList() {
        return new TaskList();
    }
}
