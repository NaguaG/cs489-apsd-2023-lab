package miu.edu.Dental.Surgeries.Appointments.system.service;

import miu.edu.Dental.Surgeries.Appointments.system.models.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeryList();
    Surgery getSurgeryById(Long surgeryId);
    Surgery updateSurgery(Surgery surgery);
    void deleteSurgery(Surgery surgery);
    Surgery addNewSurgery(Surgery surgery);
}
