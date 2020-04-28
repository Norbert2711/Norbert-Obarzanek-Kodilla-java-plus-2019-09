package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void updateHomework(){

        //Given
        Homework firstStudent = new FirstStudent();
        Homework secondStudent = new SecondStudent();

        Mentor tomaszPluta = new Mentor("Tomasz Pluta");
        Mentor adamMalysz = new Mentor("Adam Malysz");

        firstStudent.registerObserver(tomaszPluta);
        secondStudent.registerObserver(adamMalysz);

        //When
        firstStudent.addTask("This is my task: 'Kodilla course Rest API'");
        secondStudent.addTask("Kodilla course 'LOOP FOR'");
        secondStudent.addTask("Kodilla course 'Hibernate Module'");
        secondStudent.addTask("Kodilla course 'WHILE LOOP'");

        //Then
        Assert.assertEquals(1,tomaszPluta.getTaskCount());
        Assert.assertEquals(3,adamMalysz.getTaskCount());

    }




}
