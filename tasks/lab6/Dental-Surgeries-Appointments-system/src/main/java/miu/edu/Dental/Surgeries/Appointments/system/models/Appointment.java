package miu.edu.Dental.Surgeries.Appointments.system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    private String appointmentName;
    private LocalDate appointmentDate;
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
