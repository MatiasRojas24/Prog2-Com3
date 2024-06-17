package com.example.parcial_lab2.controllers;

import com.example.parcial_lab2.entities.Articulo;
import com.example.parcial_lab2.entities.ArticuloManufacturado;
import com.example.parcial_lab2.entities.ArticuloManufacturadoDetalle;
import com.example.parcial_lab2.services.ArticuloManufacturadoDetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/articulos_manufacturados_detalles")
public class ArticuloManufacturadoDetalleController {
    @Autowired
    private ArticuloManufacturadoDetalleService articuloManufacturadoDetalleService;

    @GetMapping("")
    public ResponseEntity<?> listar(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(articuloManufacturadoDetalleService.listar());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(articuloManufacturadoDetalleService.buscarPorId(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @PostMapping("")
    public ResponseEntity<?> crear(@RequestBody ArticuloManufacturadoDetalle entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(articuloManufacturadoDetalleService.crear(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody ArticuloManufacturadoDetalle entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(articuloManufacturadoDetalleService.actualizar(id,entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(articuloManufacturadoDetalleService.eliminar(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @PostMapping("/articulo/{idArticuloManufacturadoDetalle}")
    public Optional<ArticuloManufacturadoDetalle> agregarArticulo (@RequestBody Articulo articulo, @PathVariable Long idArticuloManufacturadoDetalle) throws Exception {
        ArticuloManufacturadoDetalle articuloManufacturadoDetalle =articuloManufacturadoDetalleService.agregarArticulo(idArticuloManufacturadoDetalle, articulo);
        return Optional.ofNullable(articuloManufacturadoDetalle);
    }
    @GetMapping("/articulo/{id}")
    public ResponseEntity<List<ArticuloManufacturadoDetalle>> listarPorArticulo(@PathVariable Long id) throws Exception {
        List<ArticuloManufacturadoDetalle> listaArticulosManufacturadosDetalles = articuloManufacturadoDetalleService.listarPorArticulo(id);
        return ResponseEntity.ok(listaArticulosManufacturadosDetalles);
    }

}