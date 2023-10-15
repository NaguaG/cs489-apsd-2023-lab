package miu.edu.Dental.Surgeries.Appointments.system.service;

import miu.edu.Dental.Surgeries.Appointments.system.models.Dentist;

import java.util.List;

public interface DentistService {
    List<Dentist> getAllDentists();
    Dentist getDentistById(Long dentsistId);
    Dentist updateDentist(Dentist dentist);
    void deleteDentist(Dentist dentist);
    Dentist addNewDentist(Dentist dentist);
}
