package edu.sjsu.assignment3;

/**
 *
 */

import java.time.LocalDate;
public class DailyAppointment extends Appointment {
    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

    /**
     * Override the Appointment class's method,
     * use 'isAfter' and 'isBefore' to judge the parameter 'date'
     * whether in inclusive.
     *
     * @param date Set a date.
     * @return Return type is boolean.
     */

    @Override
    public boolean occursOn(LocalDate date) {
        if(date.isAfter(getStartDate()) && date.isBefore(getEndDate())){
            return true;
        }
        else return date.equals(getStartDate()) || date.equals(getEndDate());
    }
}
