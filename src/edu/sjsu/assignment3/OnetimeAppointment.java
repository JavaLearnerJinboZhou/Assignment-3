package edu.sjsu.assignment3;
/**
 * <h1>Subclass</h1>
 * This is the subclass call OnetimeAppointment,
 * use 'extends' to inherits the attributes and methods from the Appointment class (superclass).
 *
 * @author
 * @version 1.0
 * @since   2022-04-18
 */
import java.time.LocalDate;

public class OnetimeAppointment extends Appointment {

    /**
     * use 'super' to inherits the Appointment class's constructor and parameters.
     *
     * @param description Set appointment description.
     * @param startDate   Set appointment start date.
     */
    public OnetimeAppointment(String description, LocalDate startDate) {
        super(description,startDate,startDate);
    }

    /**
     * Override the Appointment class's method,
     *
     * @param date Set a date.
     * @return Return type is boolean.
     */

    @Override
    public boolean occursOn(LocalDate date) {
        if(date.equals(getStartDate())){
            return true;
        }else {
            return false;
        }
    }
}

