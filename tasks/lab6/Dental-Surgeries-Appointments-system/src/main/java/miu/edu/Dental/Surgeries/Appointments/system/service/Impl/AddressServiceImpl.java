package miu.edu.Dental.Surgeries.Appointments.system.service.Impl;

import miu.edu.Dental.Surgeries.Appointments.system.models.Address;
import miu.edu.Dental.Surgeries.Appointments.system.repository.AddressRepository;
import miu.edu.Dental.Surgeries.Appointments.system.service.AddressService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository addressRepository;
    public AddressServiceImpl(AddressRepository addressRepository){
        this.addressRepository = addressRepository;
    }
    @Override
    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    @Override
    public Address getAddressById(Long addressId) {
        return addressRepository.findById(addressId)
                .orElse(null);
    }

    @Override
    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(Address address) {
        addressRepository.delete(address);

    }

    @Override
    public Address addNewAddress(Address address) {
        return addressRepository.save(address);
    }

}
