package com.dn.disp.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dn.disp.models.ClienteEntity;
import com.dn.disp.repository.ClienteRepository;
import com.dn.disp.services.ClienteService;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
@Transactional
public class ClienteServiceImpl implements ClienteService {

private final ClienteRepository iClienteRepository;

    @Override
    public ClienteEntity create(ClienteEntity entity) {


        ClienteEntity cliente = ClienteEntity.builder()
                .name(entity.getName())
                .lastName(entity.getLastName())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .build();


        cliente = iClienteRepository.save(cliente);


        return cliente;


    }

    @Override
    public ClienteEntity update(ClienteEntity entity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long id) {
        
    }

    @Override
    public ClienteEntity get(Long id) {

         ClienteEntity clienteEntity = iClienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente not found"));

         return clienteEntity;

    }

    @Override
    public String getDevuelveNombre() {
       return "carlos";
    }




}
