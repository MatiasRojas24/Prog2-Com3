package com.example.parcial_lab2.services;

import com.example.parcial_lab2.entities.*;
import com.example.parcial_lab2.repositories.ClienteRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;


@Service
public class ClienteService implements BaseService<Cliente> {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    @Transactional
    public List<Cliente> listar() throws Exception {
        try{
            List<Cliente> clientes = clienteRepository.findAll();
            return clientes;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente buscarPorId(Long id) throws Exception {
        try{
            Optional<Cliente> entityOptional = clienteRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente crear(Cliente cliente) throws Exception {
        try{
            cliente = clienteRepository.save(cliente);
            return cliente;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Cliente actualizar(Long id, Cliente cliente) throws Exception {
        try{
            Optional<Cliente> entityOptional = clienteRepository.findById(id);
            Cliente entidad = entityOptional.get();
            entidad = clienteRepository.save(entidad);
            return entidad;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean eliminar(Long id) throws Exception {
        try{
            if (clienteRepository.existsById(id)){
                clienteRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Cliente agregarUsuarioCliente(Long idCliente, UsuarioCliente usuarioCliente) throws Exception {
        try {
            Cliente cliente = clienteRepository.findById(idCliente).orElse(null);
            if (cliente != null) {
                cliente.setUsuarioCliente(usuarioCliente);
                clienteRepository.save(cliente);
                return cliente;
            } else {
                return null;
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Cliente agregarImagenCliente(Long idCliente, ImagenCliente imagenCliente) throws Exception {
        try {
            Cliente cliente = clienteRepository.findById(idCliente).orElse(null);
            if (cliente != null) {
                cliente.setImagenCliente(imagenCliente);
                clienteRepository.save(cliente);
                return cliente;
            } else {
                return null;
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    public Cliente agregarDomicilios(Long idCliente, Set<Domicilio> domicilios) throws Exception {
        try {
            Cliente cliente = clienteRepository.findById(idCliente).orElse(null);
            if (cliente != null) {
                cliente.setDomicilios(domicilios);
                clienteRepository.save(cliente);
                return cliente;
            } else {
                return null;
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public Cliente listarPorUsuarioCliente(Long idUsuarioCliente) throws Exception{
        try {
            return clienteRepository.findAllByUsuarioCliente_id(idUsuarioCliente);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
