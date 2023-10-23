package miu.edu.Dental_Surgeries_AppSystem_WebApi.service;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> getAllSurgeryList();
    Surgery getSurgeryById(Long surgeryId);
    Surgery updateSurgery(Surgery surgery);
    void deleteSurgery(Surgery surgery);
    Surgery addNewSurgery(Surgery surgery);
}
