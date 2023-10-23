package miu.edu.Dental_Surgeries_AppSystem_WebApi.service;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address.AddressResponse;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address.AddressResponse2;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.exception.AddressNotFoundException;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Address;

import java.util.List;

public interface AddressService {
    public List<AddressResponse2> getAllAddresses();
    public Address getAddressById(Long addressId) throws AddressNotFoundException;
    public Address updateAddress(Address address) throws AddressNotFoundException;
    public void deleteAddress(Address address) throws AddressNotFoundException;
    public Address addNewAddress(Address address);


}
