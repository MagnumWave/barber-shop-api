package br.com.dio.barbershopapi.controller.response;

public record ClientDetailResponse(
        Long id,
        String name,
        String email,
        String phone
) {
}
