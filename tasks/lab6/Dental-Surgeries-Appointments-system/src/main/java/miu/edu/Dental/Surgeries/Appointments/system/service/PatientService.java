package miu.edu.Dental.Surgeries.Appointments.system.service;

import miu.edu.Dental.Surgeries.Appointments.system.models.Patient;

import java.util.List;

public interface PatientService {
    List<Patient> getAllPatient();
    Patient getPatientById(Long patientId);
    Patient updatePatient(Patient patient);
    void deletePatient(Patient patient);
    Patient addNewPatient(Patient patient);
}
