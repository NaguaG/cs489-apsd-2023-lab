package miu.edu.Dental_Surgeries_AppSystem_WebApi.service.Impl;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Dentist;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.service.DentistService;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.repository.DentistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistServiceImpl implements DentistService {
    private DentistRepository dentistRepository;
    public DentistServiceImpl(DentistRepository dentistRepository){
        this.dentistRepository = dentistRepository;
    }
    @Override
    public List<Dentist> getAllDentists() {

        return dentistRepository.findAll();
    }

    @Override
    public Dentist getDentistById(Long dentsistId) {
        return dentistRepository.findById(dentsistId)
                .orElse(null);
    }

    @Override
    public Dentist updateDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }

    @Override
    public void deleteDentist(Dentist dentist) {
         dentistRepository.delete(dentist);
    }

    @Override
    public Dentist addNewDentist(Dentist dentist) {
        return dentistRepository.save(dentist);
    }
}
