package facade;

import java.util.Date;

public class Main {
    /*
     * En este diagrama, AppointmentBookingSystem actúa como la fachada que proporciona una interfaz unificada para reservar,
     * modificar y cancelar citas, ocultando la complejidad de los subsistemas AppointmentManagement y AppointmentReminder.
     */
    public static void main(String[] args) {
        AppointmentBookingSystem appointmentBookingSystem = new AppointmentBookingSystem();

        // Reservar cita
        appointmentBookingSystem.reserveAppointment("John", "Dr. Smith", new Date());

        // Modificar cita
        appointmentBookingSystem.modifyAppointment("John", new Date());

        // Cancelar cita
        appointmentBookingSystem.cancelAppointment("John", new Date());

        /*
         *   RESULTADOS DE LA EJECUCIÓN
         * Appointment reserved for John with doctor Dr. Smith on Sun Apr 21 12:35:23 COT 2024
         * Appointment reminder sent to John for Sun Apr 21 12:35:23 COT 2024
         * Appointment for John modified for Sun Apr 21 12:35:23 COT 2024
         * Appointment reminder sent to John for Sun Apr 21 12:35:23 COT 2024
         * Appointment for John cancelled for Sun Apr 21 12:35:23 COT 2024
         */
    }
}
