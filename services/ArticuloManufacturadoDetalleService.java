package com.example.parcial_lab2.services;

import com.example.parcial_lab2.entities.*;
import com.example.parcial_lab2.repositories.ArticuloManufacturadoDetalleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ArticuloManufacturadoDetalleService implements BaseService<ArticuloManufacturadoDetalle> {

    @Autowired
    ArticuloManufacturadoDetalleRepository articuloManufacturadoDetalleRepository;

    @Override
    @Transactional
    public List<ArticuloManufacturadoDetalle> listar() throws Exception {
        try{
            List<ArticuloManufacturadoDetalle> entities = articuloManufacturadoDetalleRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ArticuloManufacturadoDetalle buscarPorId(Long id) throws Exception {
        try{
            Optional<ArticuloManufacturadoDetalle> entityOptional = articuloManufacturadoDetalleRepository.findById(id);
            return entityOptional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ArticuloManufacturadoDetalle crear(ArticuloManufacturadoDetalle entity) throws Exception {
        try{
            entity = articuloManufacturadoDetalleRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public ArticuloManufacturadoDetalle actualizar(Long id, ArticuloManufacturadoDetalle entity) throws Exception {
        try{
            Optional<ArticuloManufacturadoDetalle> entityOptional = articuloManufacturadoDetalleRepository.findById(id);
            ArticuloManufacturadoDetalle articuloManufacturadoDetale = entityOptional.get();
            articuloManufacturadoDetale = articuloManufacturadoDetalleRepository.save(articuloManufacturadoDetale);
            return articuloManufacturadoDetale;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean eliminar(Long id) throws Exception {
        try{
            if (articuloManufacturadoDetalleRepository.existsById(id)){
                articuloManufacturadoDetalleRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public ArticuloManufacturadoDetalle agregarArticulo(Long idArticuloManufacturadoDetalle, Articulo articulo) throws Exception {
        try {
            ArticuloManufacturadoDetalle articuloManufacturadoDetalle = articuloManufacturadoDetalleRepository.findById(idArticuloManufacturadoDetalle).orElse(null);
            if (articuloManufacturadoDetalle != null) {
                articuloManufacturadoDetalle.setArticulo(articulo);
                articuloManufacturadoDetalleRepository.save(articuloManufacturadoDetalle);
                return articuloManufacturadoDetalle;
            } else {
                return null;
            }
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<ArticuloManufacturadoDetalle> listarPorArticulo(Long idArticulo) throws Exception{
        try {
            return articuloManufacturadoDetalleRepository.findAllByArticulo_id(idArticulo);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

}
