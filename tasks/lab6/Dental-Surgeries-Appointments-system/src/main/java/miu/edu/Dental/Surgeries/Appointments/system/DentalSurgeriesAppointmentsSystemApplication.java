package miu.edu.Dental.Surgeries.Appointments.system;

import miu.edu.Dental.Surgeries.Appointments.system.models.*;
import miu.edu.Dental.Surgeries.Appointments.system.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootApplication
public class DentalSurgeriesAppointmentsSystemApplication implements CommandLineRunner {
	private final AddressService addressService;
	private final AppointmentService appointmentService;
	private final PatientService patientService;
	private final SurgeryService surgeryService;
	private final DentistService dentistService;
	private final UserService userService;
	private final RoleService roleService;

	public DentalSurgeriesAppointmentsSystemApplication(AddressService addressService, AppointmentService appointmentService, PatientService patientService, SurgeryService surgeryService, DentistService dentistService, UserService userService, RoleService roleService) {
		this.addressService = addressService;
		this.appointmentService = appointmentService;
		this.patientService = patientService;
		this.surgeryService = surgeryService;
		this.dentistService = dentistService;
		this.userService = userService;
		this.roleService = roleService;

	}

	public static void main(String[] args) {
		SpringApplication.run(DentalSurgeriesAppointmentsSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Adding new users and roles");
//		var adminRole = addNewRole("admin");
//		var userRole = addNewRole("user");
		var adminUser = addNewUser("admin", "pass");
		var user = addNewUser("user", "pass123");
		System.out.println("Hello Patients !");
		var savedPatient1 = addNewPatient("P100", "Gillian", "White");
		var savedSurgery1 = addNewSurgery("S15");
		var savedDentist1 = addNewDentist("Smith", "Tony");
		var savedAppointment1 = addNewAppointmentAndPatient(LocalDate.of(2013,9,12), LocalTime.of(10,0,0), savedSurgery1, savedPatient1, savedDentist1);
		var savedPatient2 = addNewPatient("P105","Jill", "Bell");
		var savedAppointment2 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 12), LocalTime.of(12,0, 0), savedSurgery1, savedPatient2, savedDentist1);
		var savedPatient3 = addNewPatient("P108","Ian", "MacKey");
		var savedSurgery2 = addNewSurgery("S10");
		var savedDentist2 = addNewDentist("Pearson", "Helen");
		var savedAppointment3 = addNewAppointmentAndPatient(LocalDate.of(2013,9,12), LocalTime.of(10,0,0), savedSurgery2, savedPatient3, savedDentist2);
		var savedAppointment4 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 14), LocalTime.of(14,0,0), savedSurgery2, savedPatient3, savedDentist2);
		var savedDentist3 = addNewDentist("Plevin", "Robin");
		var savedAppointment5 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 14), LocalTime.of(16,30,0), savedSurgery1, savedPatient2, savedDentist3);
		var savedPatient4 = addNewPatient("P110", "John", "Walker");
		var savedSurgery3 = addNewSurgery("S13");
		var savedAppointment6 = addNewAppointmentAndPatient(LocalDate.of(2013, 9, 15), LocalTime.of(18,0,0), savedSurgery3, savedPatient4,savedDentist3);
		System.out.println(savedAppointment1);
		System.out.println(savedAppointment2);
		System.out.println(savedAppointment3);
	}
	public Patient addNewPatient(String patientNumber, String lastName, String firstName){
		var patient1 = new Patient(patientNumber, lastName, firstName);
			return patientService.addNewPatient(patient1);
	}
	public Surgery addNewSurgery(String surgeryNumber){
		var newSurgery = new Surgery(surgeryNumber);
		return surgeryService.addNewSurgery(newSurgery);
	}
	public Dentist addNewDentist(String lastName, String firstName){
		var newDentist = new Dentist(lastName, firstName);
		return dentistService.addNewDentist(newDentist);

	}
	public Address addNewAddress(String state, String city, String zipcode){
		var newAddress = new Address(null, state, city, zipcode, null, null);
		return addressService.addNewAddress(newAddress);
	}
	public User addNewUser(String userName, String password){
		List<Role> roles = List.of(addNewRole("admin"), addNewRole("user"));
		var newUser = new User(null, userName, password, roles);

		return userService.addNewUser(newUser);

	}
	public Role addNewRole(String roleName){
		var newRole = new Role(null, roleName, null);
		return roleService.addNewRole(newRole);
	}
	public Appointment addNewAppointmentAndPatient(LocalDate appointmentDate, LocalTime appointmentTime, Surgery surgery, Patient patient, Dentist dentist){
		LocalTime time = appointmentTime;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = time.format(formatter);

		var appointment1 = new Appointment(null, appointmentDate, formattedTime, surgery, patient, dentist);
		return appointmentService.addNewAppointment(appointment1);

	}

}
