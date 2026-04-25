package com.tuempresa.proveedor.service;

import com.tuempresa.proveedor.dto.ProveedorDTO;
import com.tuempresa.proveedor.entity.Proveedor;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
public interface ProveedorService {
    List<ProveedorDTO> listarTodos();
    ProveedorDTO buscarPorId(Integer id);
    List<ProveedorDTO> listarPorRazon(String razon);
    Proveedor guardar(Proveedor p);
    Proveedor actualizar(Proveedor p);
    void eliminar(Integer id);
}