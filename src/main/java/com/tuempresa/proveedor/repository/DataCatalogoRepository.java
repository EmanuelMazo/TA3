package com.tuempresa.proveedor.repository;

import com.tuempresa.proveedor.entity.DataCatalogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataCatalogoRepository extends JpaRepository<DataCatalogo, Integer> {
}