package br.com.dio.barbershopapi.service.impl;

import br.com.dio.barbershopapi.entity.ClientEntity;
import br.com.dio.barbershopapi.repository.IClientRepository;
import br.com.dio.barbershopapi.service.IClientService;
import br.com.dio.barbershopapi.service.query.IClientQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
//não é um @Repository!...
@AllArgsConstructor
public class ClientService implements IClientService {

    private final IClientRepository repository;
    private final IClientQueryService queryservice;

    @Override
    public ClientEntity save(final ClientEntity entity) {
        queryservice.verifyEmail(entity.getEmail());
        queryservice.verifyPhone(entity.getPhone());

        return repository.save(entity);
    }

    @Override
    public ClientEntity update(final ClientEntity entity) {
        queryservice.verifyEmail(entity.getId(), entity.getEmail());
        queryservice.verifyPhone(entity.getId(), entity.getPhone());

        var stored = queryservice.findById(entity.getId());
        //é melhor apenas verificar se existe
        //para que a volta do banco traga menos dados pro Java.
        stored.setName(entity.getName());
        stored.setPhone(entity.getPhone());
        stored.setEmail(entity.getEmail());

        return repository.save(stored);
    }

    @Override
    public void delete(long id) {
        queryservice.findById(id);
        repository.deleteById(id);
    }
}
