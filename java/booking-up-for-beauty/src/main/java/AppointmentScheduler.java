import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, dt);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime time = appointmentDate.toLocalTime();
        return !time.isBefore(LocalTime.NOON) && time.isBefore(LocalTime.of(18, 0));
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy", Locale.US);
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("h:mm a", Locale.US);

        String formattedDate = appointmentDate.format(dateFormat);
        String formattedTime = appointmentDate.format(timeFormat);

        return "You have an appointment on " + formattedDate + ", at " + formattedTime + ".";
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 15);
    }
}
