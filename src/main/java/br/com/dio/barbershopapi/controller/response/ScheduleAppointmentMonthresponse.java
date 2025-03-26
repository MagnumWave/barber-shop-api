package br.com.dio.barbershopapi.controller.response;

import java.util.List;

public record ScheduleAppointmentMonthresponse(
        int year,
        int month,
        List<ClientScheduleAppointmentResponse> scheduledAppointments
) {
}
