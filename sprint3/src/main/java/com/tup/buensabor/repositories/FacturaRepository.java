package com.tup.buensabor.repositories;

import com.tup.buensabor.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
