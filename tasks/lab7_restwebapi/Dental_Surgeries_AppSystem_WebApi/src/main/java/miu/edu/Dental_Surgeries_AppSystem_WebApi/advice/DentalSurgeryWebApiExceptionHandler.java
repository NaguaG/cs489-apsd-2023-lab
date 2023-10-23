package miu.edu.Dental_Surgeries_AppSystem_WebApi.advice;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.exception.AddressNotFoundException;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.exception.PatientNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class DentalSurgeryWebApiExceptionHandler {
    @ExceptionHandler(PatientNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handlePatientNotFoundException(PatientNotFoundException patientNotFoundException){
        Map<String, String> errorMessageMap = new HashMap<>();
        errorMessageMap.put("Error:", patientNotFoundException.getMessage());
        return errorMessageMap;

    }
    @ExceptionHandler(AddressNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, String> handlePatientNotFoundException(AddressNotFoundException addressNotFoundException){
        Map<String, String> errorMessageMap = new HashMap<>();
        errorMessageMap.put("Error:", addressNotFoundException.getMessage());
        return errorMessageMap;

    }
}
