package miu.edu.Dental_Surgeries_AppSystem_WebApi.controller;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address.AddressResponse2;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Address;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    private AddressService addressService;
    public AddressController(AddressService addressService){
        this.addressService = addressService;
    }
    @GetMapping(value = "/adsweb/api/v1/address/list")
    public List<AddressResponse2> getAllAddress(){

        return addressService.getAllAddresses();
    }
    @PostMapping(value = "/adsweb/api/v1/address/new")
    public Address addNewAddress(Address address){

        return addressService.addNewAddress(address);
    }

}
