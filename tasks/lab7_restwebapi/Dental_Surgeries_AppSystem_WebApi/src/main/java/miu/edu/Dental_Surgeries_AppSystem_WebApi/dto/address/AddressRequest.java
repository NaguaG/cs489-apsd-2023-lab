package miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address;

public record AddressRequest(
        String state,
        String city,
        String zipcode
) {
}
