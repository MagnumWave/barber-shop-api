package br.com.dio.barbershopapi.controller.response;

public record ClientScheduleAppointmentDetailResponse(
        Long id,
        String name,
        String email,
        String phone
) {
}
