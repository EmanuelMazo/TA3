package com.tuempresa.proveedor.repository;

import com.tuempresa.proveedor.entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, Integer> {
    List<Proveedor> findByRazonsocialContainingIgnoreCase(String razon);
}