package miu.edu.Dental.Surgeries.Appointments.system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @Column(name = "patNo")
    private String patientNumber;
    private String lastName;
    private String firstName;
    @OneToOne
    private Address address;
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;
    public Patient(String patientNumber, String lastName, String firstName){
        this.patientNumber = patientNumber;
        this.lastName = lastName;
        this.firstName = firstName;
    }

}
