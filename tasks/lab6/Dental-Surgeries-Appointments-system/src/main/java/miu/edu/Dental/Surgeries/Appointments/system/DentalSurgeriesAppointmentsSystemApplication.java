package miu.edu.Dental.Surgeries.Appointments.system;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DentalSurgeriesAppointmentsSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DentalSurgeriesAppointmentsSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello Patients !");
	}
}
