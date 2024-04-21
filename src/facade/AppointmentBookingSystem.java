package facade;

import java.util.Date;

public class AppointmentBookingSystem {
    private AppointmentManagement appointmentManagement;
    private AppointmentReminder appointmentReminder;

    public AppointmentBookingSystem() {
        this.appointmentManagement = new AppointmentManagement();
        this.appointmentReminder = new AppointmentReminder();
    }

    public void reserveAppointment(String patient, String doctor, Date date) {
        appointmentManagement.reserveAppointment(patient, doctor, date);
        appointmentReminder.sendReminder(patient, date);
    }

    public void modifyAppointment(String patient, Date date) {
        appointmentManagement.modifyAppointment(patient, date);
        appointmentReminder.sendReminder(patient, date);
    }

    public void cancelAppointment(String patient, Date date) {
        appointmentManagement.cancelAppointment(patient, date);
    }
}
