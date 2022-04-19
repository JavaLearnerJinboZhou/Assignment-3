package edu.sjsu.assignment3;
/**
 * <h1>Superclass</h1>
 * This is the superclass call Appointment,
 * set 'abstract' to make the class CANNOT be instantiated.
 *
 * @author
 * @version 1.0
 * @since   2022-04-18
 */

import java.time.LocalDate;

/**
 *
 */
public abstract class Appointment {
    /**
     * create three variable
     */
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    /**
     * create constructor with three parameters,
     * use 'this' to pass an argument in the constructor call.
     *
     * @param description Set appointment description.
     * @param startDate Set appointment start date.
     * @param endDate Set appointment end date.
     */
    public Appointment(String description, LocalDate startDate, LocalDate endDate){
        this.description=description;
        this.startDate=startDate;
        this.endDate=endDate;
    }

    /**
     * Because the variable is 'private',
     * if we want to use them, we need use 'get' method.
     *
     * @return Every 'get' method return the constructor parameter.
     */
    public String getDescription() {
        return description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Create a method call 'occursOn' to checks whether
     * the appointment occurs on a date or not.
     *
     * @param date Set a date.
     */
    public abstract boolean occursOn(LocalDate date);

}

