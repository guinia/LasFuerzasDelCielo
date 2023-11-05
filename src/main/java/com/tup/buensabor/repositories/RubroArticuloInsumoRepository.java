package com.tup.buensabor.repositories;

import com.tup.buensabor.entities.RubroArticuloInsumo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubroArticuloInsumoRepository extends BaseRepository<RubroArticuloInsumo, Long> {

    @Query(
            value = "SELECT * FROM rubro_articulo WHERE rubro_articulo.denominacion LIKE %:filtro%",
            nativeQuery = true
    )
    List<RubroArticuloInsumo> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM rubro_articulo WHERE rubro_articulo.denominacion LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM rubro_articulo",
            nativeQuery = true
    )
    Page<RubroArticuloInsumo> searchNativo(@Param("filtro") String filtro, Pageable pageable);

}

