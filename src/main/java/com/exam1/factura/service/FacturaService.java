package com.exam1.factura.service;

import com.exam1.factura.model.ModelFactura;
import com.exam1.factura.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository repository;

    public List<ModelFactura> findAll() {
        return repository.findAll();
    }

    public Optional<ModelFactura> findById(Long id) {
        return repository.findById(id);
    }

    public ModelFactura save(ModelFactura factura) {
        return repository.save(factura);
    }

    public ModelFactura update(Long id, ModelFactura factura) {
        if (repository.existsById(id)) {
            factura.setId(id);
            return repository.save(factura);
        }
        return null;
    }

    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }
}