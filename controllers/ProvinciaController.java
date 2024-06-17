package com.example.parcial_lab2.controllers;

import com.example.parcial_lab2.entities.Domicilio;
import com.example.parcial_lab2.entities.Pais;
import com.example.parcial_lab2.entities.Promocion;
import com.example.parcial_lab2.entities.Provincia;
import com.example.parcial_lab2.services.ProvinciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/provincias")
public class ProvinciaController {

    @Autowired
    private ProvinciaService provinciaService;

    @GetMapping("")
    public ResponseEntity<?> listar(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(provinciaService.listar());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(provinciaService.buscarPorId(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @PostMapping("")
    public ResponseEntity<?> crear(@RequestBody Provincia entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(provinciaService.crear(entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody Provincia entity){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(provinciaService.actualizar(id,entity));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminar(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(provinciaService.eliminar(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error:\":\"Error. Por favor intente más tarde.\"}");
        }
    }
    @PostMapping("/paises/{idProvincia}")
    public Optional<Provincia> agregarPais (@RequestBody Pais pais, @PathVariable Long idProvincia) throws Exception {
        Provincia provincia = provinciaService.agregarPais(idProvincia, pais);
        return Optional.ofNullable(provincia);
    }
    @GetMapping("/paises/{id}")
    public ResponseEntity<List<Provincia>> listarPorPais(@PathVariable Long id) throws Exception {
        List<Provincia> listaPaises = provinciaService.listarPorPais(id);
        return ResponseEntity.ok(listaPaises);
    }
}