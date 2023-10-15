package miu.edu.Dental.Surgeries.Appointments.system.service.Impl;

import miu.edu.Dental.Surgeries.Appointments.system.models.Patient;
import miu.edu.Dental.Surgeries.Appointments.system.repository.PatientRepository;
import miu.edu.Dental.Surgeries.Appointments.system.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;
    public PatientServiceImpl(PatientRepository patientRepository){
        this.patientRepository = patientRepository;
    }
    @Override
    public List<Patient> getAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long patientId) {
        return patientRepository.findById(patientId)
                .orElse(null);
    }

    @Override
    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public void deletePatient(Patient patient) {
        patientRepository.delete(patient);
    }

    @Override
    public Patient addNewPatient(Patient patient) {
        return patientRepository.save(patient);
    }
}
