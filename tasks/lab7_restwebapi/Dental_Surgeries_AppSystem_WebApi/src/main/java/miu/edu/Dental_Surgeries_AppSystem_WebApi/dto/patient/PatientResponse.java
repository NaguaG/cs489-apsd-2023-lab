package miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address.AddressResponse;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Address;

public record PatientResponse(Long patientId, String patNo, String lastName, String firstName,
                              AddressResponse address) {
}
