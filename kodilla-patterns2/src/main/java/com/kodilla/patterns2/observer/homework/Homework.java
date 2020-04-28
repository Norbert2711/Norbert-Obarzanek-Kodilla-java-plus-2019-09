package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {

    private final List<Observer> observers;
    private final List<String> tasks;
    private final String studentName;

    public Homework(String name) {
        this.studentName = name;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getStudentName() {
        return studentName;
    }

    public void addTask(String task){
        tasks.add(task);
        notifyObservers();

    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.updateTask(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
