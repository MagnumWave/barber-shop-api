package br.com.dio.barbershopapi.controller.response;

import java.time.OffsetDateTime;

public record ClientScheduleAppointmentResponse(
        Long id,
        Integer day,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        Long clientId,
        String clientName
) {
}
