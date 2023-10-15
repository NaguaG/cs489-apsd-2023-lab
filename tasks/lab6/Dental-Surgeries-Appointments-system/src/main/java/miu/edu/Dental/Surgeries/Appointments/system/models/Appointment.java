package miu.edu.Dental.Surgeries.Appointments.system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    private LocalDate appointmentDate;
    private String appointmentTime;

    @ManyToOne
    @JoinColumn(name = "surgeryId")
    private Surgery surgery;
    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;
    @ManyToOne
    @JoinColumn(name = "dentistId")
    private Dentist dentist;

}
