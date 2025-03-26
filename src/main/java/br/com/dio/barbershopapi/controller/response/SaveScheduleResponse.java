package br.com.dio.barbershopapi.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public record SaveScheduleResponse(
        Long id,
        OffsetDateTime startAt,
        OffsetDateTime endAt,
        Long clientId
) {
}
