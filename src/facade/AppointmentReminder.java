package facade;

import java.util.Date;

public class AppointmentReminder {
    public void sendReminder(String patient, Date date) {
        System.out.println("Appointment reminder sent to " + patient + " for " + date);
    }
}
