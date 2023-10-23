package miu.edu.Dental_Surgeries_AppSystem_WebApi.service.Impl;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address.AddressResponse2;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient.PatientResponse2;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.exception.AddressNotFoundException;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Address;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Patient;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.repository.AddressRepository;
import org.springframework.stereotype.Service;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.service.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Override
    public List<AddressResponse2> getAllAddresses() {
        return addressRepository.findAll()
                .stream()
                .map(a -> new AddressResponse2(
                        a.getAddressId(),
                        a.getState(),
                        a.getCity(),
                        a.getZipcode(),
                        new PatientResponse2(
                                a.getPatient().getPatientId(),
                                a.getPatient().getPatientNumber(),
                                a.getPatient().getFirstName(),
                                a.getPatient().getLastName()
                        )
                )).toList();
    }

    @Override
    public Address getAddressById(Long addressId) throws AddressNotFoundException {
        return addressRepository.findById(addressId)
                .orElse(null);
    }

    @Override
    public Address updateAddress(Address address) throws AddressNotFoundException {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Address address) throws AddressNotFoundException{
        addressRepository.delete(address);

    }

    @Override
    public Address addNewAddress(Address address) {
        return addressRepository.save(address);
    }

}
