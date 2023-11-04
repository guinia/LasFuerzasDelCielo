package com.tup.buensabor.repositories;

import com.tup.buensabor.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Repository
public interface FacturaRepository extends BaseRepository<Factura, Long> {

    @Query(
            value = "SELECT * FROM factura WHERE factura.formapago LIKE %:filtro%",
            nativeQuery = true
    )
    List<Factura> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM factura WHERE factura.formapago LIKE %:filtro%",
            countQuery = "SELECT count(*) FROM factura",
            nativeQuery = true
    )
    Page<Factura> searchNativo(@Param("filtro") String filtro, Pageable pageable);

    @Query(
            value = "SELECT SUM(totalVenta) FROM factura WHERE fechaFacturacion BETWEEN :desde AND :hasta",
            nativeQuery = true
    )
    BigDecimal searchTotalVentas(@Param("desde") Date desde, @Param("hasta") Date hasta);

}
