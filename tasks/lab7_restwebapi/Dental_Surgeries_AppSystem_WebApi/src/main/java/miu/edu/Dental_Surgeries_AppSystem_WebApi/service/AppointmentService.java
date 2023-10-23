package miu.edu.Dental_Surgeries_AppSystem_WebApi.service;
import miu.edu.Dental_Surgeries_AppSystem_WebApi.model.Appointment;

import java.util.List;

public interface AppointmentService {
    public List<Appointment> getAllAppointment();
    public Appointment getAppointmentById(Long appointmentId);
    public Appointment updateAppointment(Appointment appointment);
    public void deleteAppointment(Appointment appointment);
    public Appointment addNewAppointment(Appointment appointment);
}
