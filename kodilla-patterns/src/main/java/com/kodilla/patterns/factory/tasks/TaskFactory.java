package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPINGTASK";
    public static final String PAINTING = "PAINTINGTASK";
    public static final String DRIVING = "DRIVINGTASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {

            case SHOPPING:
                return new ShoppingTask("Shopping", "Car", 3.0);
            case PAINTING:
                return new PaintingTask("Painting", "Blue", "Living Room");
            case DRIVING:
                return new DrivingTask("Driving", "To Home", "TAXI");
            default:
                return null;
        }
    }
}
