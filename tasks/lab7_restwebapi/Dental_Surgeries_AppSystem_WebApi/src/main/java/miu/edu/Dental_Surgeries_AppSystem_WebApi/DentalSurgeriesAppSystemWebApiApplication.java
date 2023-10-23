package miu.edu.Dental_Surgeries_AppSystem_WebApi;

import miu.edu.Dental_Surgeries_AppSystem_WebApi.controller.AddressController;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.controller.PatientController;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.address.AddressRequest;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.dto.patient.PatientRequest;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Address;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Patient;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.service.AddressService;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
public class DentalSurgeriesAppSystemWebApiApplication {
	private AddressController addressController;
	private PatientController patientController;
	public DentalSurgeriesAppSystemWebApiApplication(AddressController addressController, PatientController patientController){
		this.addressController = addressController;
		this.patientController = patientController;
	}

	public static void main(String[] args) {
		SpringApplication.run(DentalSurgeriesAppSystemWebApiApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(){
		return (args) -> {System.out.println("Hello Dental Surgery WebAPI");
//			addNewPatient("P100", "Gillian", "White", "IA", "Fairfield", "52556");
//			addNewPatient("P105", "Jill", "Bell", "PA", "Philadelphia", "19006");
//			addNewPatient("P108", "Ian", "Mackey", "CA", "San-Francisco", "19565");
//			addNewPatient("P110", "John", "Walker", "VA", "Lessburg", "95666");
		};
	}


	public void addNewPatient(String patNo, String lastName, String firstName, String state, String city, String zipCode){
		PatientRequest patientRequest = new PatientRequest(patNo, lastName, firstName, new AddressRequest(state, city, zipCode));
		patientController.addNewPatient(patientRequest);
	}

}
