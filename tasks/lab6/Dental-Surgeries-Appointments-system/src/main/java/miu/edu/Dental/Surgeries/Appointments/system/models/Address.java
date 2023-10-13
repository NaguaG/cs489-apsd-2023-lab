package miu.edu.Dental.Surgeries.Appointments.system.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    private String state;
    private String city;
    private String zipcode;
    @OneToOne(mappedBy = "address")
    private Patient patient;
    @OneToOne(mappedBy = "address")
    private Surgery surgery;

}
