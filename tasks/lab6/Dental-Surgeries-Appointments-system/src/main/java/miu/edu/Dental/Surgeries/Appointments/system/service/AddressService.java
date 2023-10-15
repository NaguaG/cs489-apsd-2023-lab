package miu.edu.Dental.Surgeries.Appointments.system.service;

import miu.edu.Dental.Surgeries.Appointments.system.models.Address;
import miu.edu.Dental.Surgeries.Appointments.system.repository.AddressRepository;

import java.util.List;

public interface AddressService {
    public List<Address> getAllAddresses();
    public Address getAddressById(Long addressId);
    public Address updateAddress(Address address);
    public void deleteAddress(Address address);
    public Address addNewAddress(Address address);


}
