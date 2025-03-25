package br.com.dio.barbershopapi.service;

import br.com.dio.barbershopapi.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity client);

    ClientEntity update(final ClientEntity client);

    void delete(final long id);
}
