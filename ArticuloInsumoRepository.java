package com.example.parcial_Prog2.repositories;

import com.example.parcial_Prog2.entities.ArticuloInsumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloInsumoRepository extends JpaRepository<ArticuloInsumo, Long> {
    List<ArticuloInsumo> findAllByCategoria_id(Long idCategoria);
    List<ArticuloInsumo> findAllByUnidadMedida_id(Long idUnidadMedida);
    ArticuloInsumo findAllByImagenesArticulo_id(Long idImagenArticulo);
}