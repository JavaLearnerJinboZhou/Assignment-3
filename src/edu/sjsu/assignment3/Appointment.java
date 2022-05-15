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

import java.util.Comparator;

/**
 *
 */
public abstract class Appointment implements Comparable<Appointment>{
    /**
     * create three variable
     */
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    @Override
    public int compareTo(Appointment o) {
        return 0;
    }

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

    @Override
    public String toString() {
        return "\n -> Appointment{" +
                "description='" + description + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
    public class DesComparator implements Comparator<Appointment> {

        @Override
        public int compare(Appointment o1, Appointment o2) {
            // compare the description first, the start date, finally end date.
            if (!o1.getDescription().equals(o2.getDescription())) {
                return o1.getDescription().compareTo(o2.getDescription());
            }
            else if (!o1.getStartDate().equals(o2.getStartDate())) {
                return o1.getStartDate().compareTo(o2.getStartDate());
            } else return o1.getEndDate().compareTo(o2.getEndDate());
        }

    }
}

