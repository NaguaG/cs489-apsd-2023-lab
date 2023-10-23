package miu.edu.Dental_Surgeries_AppSystem_WebApi.service;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient.PatientRequest;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient.PatientResponse;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.exception.PatientNotFoundException;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Patient;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.repository.PatientRepository;

import java.util.List;

public interface PatientService {
    List<PatientResponse> getAllPatient();
    PatientResponse getPatientById(Long patientId) throws PatientNotFoundException;
    PatientResponse updatePatient(Long patientId, PatientRequest patientRequest) throws PatientNotFoundException;
    void deletePatient(Long patientId) throws PatientNotFoundException;
    PatientResponse addNewPatient(PatientRequest patientRequest);
}
