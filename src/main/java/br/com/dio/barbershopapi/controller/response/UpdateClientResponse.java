package br.com.dio.barbershopapi.controller.response;

public record UpdateClientResponse(
        Long id,
        String name,
        String email,
        String phone
) {
}
