package miu.edu.Dental_Surgeries_AppSystem_WebApi.service;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Dentist;

import java.util.List;

public interface DentistService {
    List<Dentist> getAllDentists();
    Dentist getDentistById(Long dentsistId);
    Dentist updateDentist(Dentist dentist);
    void deleteDentist(Dentist dentist);
    Dentist addNewDentist(Dentist dentist);
}
