package com.tuempresa.proveedor.service;

import com.tuempresa.proveedor.dto.ProveedorDTO;
import com.tuempresa.proveedor.entity.Proveedor;
import com.tuempresa.proveedor.repository.ProveedorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ProveedorServiceImpl implements ProveedorService {

    private final ProveedorRepository repository;

    public ProveedorServiceImpl(ProveedorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<ProveedorDTO> listarTodos() {
        try {
            List<Proveedor> proveedores = repository.findAll();
            return proveedores.stream().map(this::convertirDTO).toList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al listar proveedores: " + e.getMessage());
        }
    }

    @Override
    public ProveedorDTO buscarPorId(Integer id) {
        try {
            Proveedor p = repository.findById(id)
                    .orElseThrow(() -> new RuntimeException("Proveedor no encontrado con ID: " + id));
            return convertirDTO(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar proveedor: " + e.getMessage());
        }
    }

    @Override
    public List<ProveedorDTO> listarPorRazon(String razon) {
        try {
            List<Proveedor> proveedores = repository.findByRazonsocialContainingIgnoreCase(razon);
            return proveedores.stream().map(this::convertirDTO).toList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar por razon social: " + e.getMessage());
        }
    }

    @Override
    public Proveedor guardar(Proveedor p) {
        try {
            if (p.getFechaRegistro() == null) {
                p.setFechaRegistro(LocalDateTime.now());
            }
            p.setFechaActualizacion(LocalDateTime.now());
            return repository.save(p);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al guardar proveedor: " + e.getMessage());
        }
    }

    @Override
    public Proveedor actualizar(Proveedor p) {
        try {
            Proveedor existente = repository.findById(p.getIdProveedor())
                    .orElseThrow(() -> new RuntimeException("Proveedor no encontrado con ID: " + p.getIdProveedor()));

            existente.setRazonsocial(p.getRazonsocial());
            existente.setRuc(p.getRuc());
            existente.setDireccion(p.getDireccion());
            existente.setCelular(p.getCelular());
            existente.setContacto(p.getContacto());
            existente.setEstado(p.getEstado());
            existente.setPais(p.getPais());
            existente.setTipoProveedor(p.getTipoProveedor());
            existente.setFechaActualizacion(LocalDateTime.now());

            return repository.save(existente);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al actualizar proveedor: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(Integer id) {
        try {
            if (!repository.existsById(id)) {
                throw new RuntimeException("Proveedor no encontrado con ID: " + id);
            }
            repository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Error al eliminar proveedor: " + e.getMessage());
        }
    }

    private ProveedorDTO convertirDTO(Proveedor p) {
        ProveedorDTO dto = new ProveedorDTO();

        dto.setIdProveedor(p.getIdProveedor());
        dto.setRazonsocial(p.getRazonsocial());
        dto.setRuc(p.getRuc());
        dto.setDireccion(p.getDireccion());
        dto.setCelular(p.getCelular());
        dto.setContacto(p.getContacto());
        dto.setEstado(p.getEstado());

        dto.setFechaRegistro(
            p.getFechaRegistro() != null ? p.getFechaRegistro().toString() : null
        );

        dto.setFechaActualizacion(
            p.getFechaActualizacion() != null ? p.getFechaActualizacion().toString() : null
        );

        dto.setNombrePais(
            (p.getPais() != null) ? p.getPais().getNombre() : "SIN_PAIS"
        );

        dto.setNombreTipoProveedor(
            (p.getTipoProveedor() != null) ? p.getTipoProveedor().getDescripcion() : "SIN_TIPO"
        );

        return dto;
    }
}