package com.tup.buensabor.controllers;


import com.tup.buensabor.entities.RubroArticuloInsumo;
import com.tup.buensabor.entities.RubroArticuloManufacturado;
import com.tup.buensabor.services.RubroArticuloInsumoServiceImpl;
import com.tup.buensabor.services.RubroArticuloManufacturadoServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/RubrosArticulosManufacturados")
public class RubroArticuloManufacturadoController extends BaseControllerImpl<RubroArticuloManufacturado, RubroArticuloManufacturadoServiceImpl> {


    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }


}
