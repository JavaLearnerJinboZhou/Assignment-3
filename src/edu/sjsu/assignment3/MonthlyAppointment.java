package edu.sjsu.assignment3;
/**
 * <h1>Subclass</h1>
 * This is the subclass call MonthlyAppointment,
 * use 'extends' to inherits the attributes and methods from the Appointment class (superclass).
 *
 * @author
 * @version 1.0
 * @since   2022-04-18
 */
import java.time.LocalDate;

public class MonthlyAppointment extends Appointment{
    /**
     * use 'super' to inherits the Appointment class's constructor and parameters.
     *
     * @param description The Appointment class's parameter.
     * @param startDate The Appointment class's parameter.
     * @param endDate The Appointment class's parameter.
     */
    public MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
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
        /**
         * variable 'after' and 'before' to set a range to judge the date.
         * variable 'date_month' and 'start_month' to get Month value by getDayOfMonth() method.
         */
        boolean after = date.isAfter(getStartDate());
        boolean before = date.isBefore(getEndDate());
        int date_month = date.getDayOfMonth();
        int start_month = getStartDate().getDayOfMonth();
        if (after==true && before==true && date_month==start_month){
            return true;
        }else {
            return false;
        }
    }
}
