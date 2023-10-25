package com.tup.buensabor.services;

import com.tup.buensabor.entities.RubroArticulo;
import com.tup.buensabor.entities.UnidadMedida;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RubroArticuloService extends BaseService<RubroArticulo, Long>{
    List<RubroArticulo> search(String filtro) throws Exception;
    Page<RubroArticulo> search(String filtro, Pageable pageable) throws Exception;
}
