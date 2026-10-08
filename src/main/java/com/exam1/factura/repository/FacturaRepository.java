package com.exam1.factura.repository;

import com.exam1.factura.model.ModelFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepository extends JpaRepository<ModelFactura, Long> {
}