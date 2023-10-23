package miu.edu.Dental_Surgeries_AppSystem_WebApi.controller;

import jakarta.validation.Valid;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient.PatientRequest;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient.PatientResponse;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.exception.PatientNotFoundException;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Patient;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.service.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/adsweb/api/v1/patient")
public class PatientController {
    private PatientService patientService;
    public PatientController(PatientService patientService){
        this.patientService = patientService;
    }
    @GetMapping(value = "/list")
    public ResponseEntity<List<PatientResponse>> getAllPatients(){

        return ResponseEntity.ok(patientService.getAllPatient());
    }
    @PostMapping(value = "/register")
    public ResponseEntity<PatientResponse> addNewPatient(@Valid @RequestBody PatientRequest patientRequest){

        return new ResponseEntity<>(patientService.addNewPatient(patientRequest), HttpStatus.CREATED);
    }
//    send PatientId as Query Parameter
//    @GetMapping(value = "/adsweb/api/v1/patient/get/?patientId={patientId}")
//    public ResponseEntity<Patient> getPatientById(@RequestParam Long patientId){
//
//    }

    //send PatientId as Path variable
    @GetMapping(value = "/get/{patientId}")
    public ResponseEntity<PatientResponse> getPatientById(@PathVariable Long patientId) throws PatientNotFoundException {
        return ResponseEntity.ok(patientService.getPatientById(patientId));
    }

    @PutMapping(value = "/update/{patientId}")
    public ResponseEntity<PatientResponse> updatePatient(@PathVariable Long patientId, @RequestBody PatientRequest patientRequest) throws PatientNotFoundException{
        return ResponseEntity.ok(patientService.updatePatient(patientId, patientRequest));
    }
    @DeleteMapping(value = "/delete/{patientId}")
    public void deletePatient(@PathVariable Long patientId) throws PatientNotFoundException{
        patientService.deletePatient(patientId);
    }
    //Queries all the Patient data for the patient(s) whose data matches the input searchString.
//    @GetMapping(value = "/adsweb/api/v1/patient/search/{searchString}")
//    public List<Patient> getAllPatientSearchByQuery(String searchString){
//
//    }
}