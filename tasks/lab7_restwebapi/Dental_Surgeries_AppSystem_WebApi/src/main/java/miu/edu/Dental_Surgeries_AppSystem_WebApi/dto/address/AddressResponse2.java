package miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient.PatientResponse2;

public record AddressResponse2(Long addressId, String state, String city, String zipcode, PatientResponse2 patient) {
}
