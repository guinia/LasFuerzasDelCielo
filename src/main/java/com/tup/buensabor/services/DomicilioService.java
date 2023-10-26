package com.tup.buensabor.services;

import com.tup.buensabor.entities.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface DomicilioService {

    List<Domicilio> search(String filtro) throws Exception;

    Page<Domicilio> search(String filtro, Pageable pageable) throws Exception;

}
