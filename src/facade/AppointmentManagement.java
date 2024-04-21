package facade;

import java.util.Date;

public class AppointmentManagement {
    public void reserveAppointment(String patient, String doctor, Date date) {
        System.out.println("Appointment reserved for " + patient + " with doctor " + doctor + " on " + date);
    }

    public void modifyAppointment(String patient, Date date) {
        System.out.println("Appointment for " + patient + " modified for " + date);
    }

    public void cancelAppointment(String patient, Date date) {
        System.out.println("Appointment for " + patient + " cancelled for " + date);
    }
}
