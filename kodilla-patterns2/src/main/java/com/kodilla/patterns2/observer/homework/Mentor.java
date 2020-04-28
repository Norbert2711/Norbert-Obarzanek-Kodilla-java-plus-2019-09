package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private final String mentorName;
    private int taskCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void updateTask(Homework homework) {
        System.out.println(mentorName + " New homework from student: " + homework.getStudentName() +
                (" total: " + homework.getTasks().size()) + " tasks.");
        taskCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getTaskCount() {
        return taskCount;
    }
}
