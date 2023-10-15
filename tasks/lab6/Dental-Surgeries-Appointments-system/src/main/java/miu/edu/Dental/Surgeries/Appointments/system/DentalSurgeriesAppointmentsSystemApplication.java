package miu.edu.Dental.Surgeries.Appointments.system;

import miu.edu.Dental.Surgeries.Appointments.system.models.Appointment;
import miu.edu.Dental.Surgeries.Appointments.system.models.Patient;
import miu.edu.Dental.Surgeries.Appointments.system.service.AddressService;
import miu.edu.Dental.Surgeries.Appointments.system.service.AppointmentService;
import miu.edu.Dental.Surgeries.Appointments.system.service.PatientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class DentalSurgeriesAppointmentsSystemApplication implements CommandLineRunner {
	private final AddressService addressService;
	private final AppointmentService appointmentService;
	private final PatientService patientService;

	public DentalSurgeriesAppointmentsSystemApplication(AddressService addressService, AppointmentService appointmentService, PatientService patientService) {
		this.addressService = addressService;
		this.appointmentService = appointmentService;
		this.patientService = patientService;
	}

	public static void main(String[] args) {
		SpringApplication.run(DentalSurgeriesAppointmentsSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Patients !");
		var savedPatient1 = addNewPatient("Gillian", "White");
		var savedAppointment1 = addNewAppointmentAndPatient(LocalDate.of(2013,9,12), LocalTime.of(10,0,0), savedPatient1);
		var savedPatient2 = addNewPatient("Jill", "Bell");
		var savedAppointment2 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 12), LocalTime.of(12,0, 0), savedPatient2);
		var savedPatient3 = addNewPatient("Ian", "MacKey");
		var savedAppointment3 = addNewAppointmentAndPatient(LocalDate.of(2013,9,12), LocalTime.of(10,0,0), savedPatient3);
		var savedAppointment4 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 14), LocalTime.of(14,0,0), savedPatient3);
		var savedAppointment5 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 14), LocalTime.of(16,30,0), savedPatient2);
		var savedPatient4 = addNewPatient("John", "Walker");
		var savedAppointment6 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 15), LocalTime.of(18,0,0), savedPatient4);
		System.out.println(savedAppointment1);
		System.out.println(savedAppointment2);
		System.out.println(savedAppointment3);
	}
//	public Appointment addNewAppointment(LocalDate appointmentDate, LocalTime appointmentTime){
//		var Gillian = addNewPatient("Gillian", "White");
//		var appointment1 = new Appointment(null, appointmentDate, appointmentTime, Gillian);
//		return appointmentService.addNewAppointment(appointment1);
//	}
	public Patient addNewPatient(String lastName, String firstName){
		var patient1 = new Patient(lastName, firstName);
			return patientService.addNewPatient(patient1);
	}
	public Appointment addNewAppointmentAndPatient(LocalDate appointmentDate, LocalTime appointmentTime, Patient patient){
		LocalTime time = appointmentTime;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = time.format(formatter);

		var appointment1 = new Appointment(null, appointmentDate, formattedTime, patient);
		return appointmentService.addNewAppointment(appointment1);

	}

}
