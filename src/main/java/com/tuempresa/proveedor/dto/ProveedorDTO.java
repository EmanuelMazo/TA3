package com.tuempresa.proveedor.dto;

public class ProveedorDTO {

    private Integer idProveedor;
    private String razonsocial;
    private String ruc;
    private String direccion;
    private String celular;
    private String contacto;
    private Integer estado;
    private String fechaRegistro;
    private String fechaActualizacion;
    private String nombrePais;
    private String nombreTipoProveedor;

    public ProveedorDTO() {}

    public Integer getIdProveedor() { return idProveedor; }
    public void setIdProveedor(Integer idProveedor) { this.idProveedor = idProveedor; }

    public String getRazonsocial() { return razonsocial; }
    public void setRazonsocial(String razonsocial) { this.razonsocial = razonsocial; }

    public String getRuc() { return ruc; }
    public void setRuc(String ruc) { this.ruc = ruc; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }

    public String getContacto() { return contacto; }
    public void setContacto(String contacto) { this.contacto = contacto; }

    public Integer getEstado() { return estado; }
    public void setEstado(Integer estado) { this.estado = estado; }

    public String getFechaRegistro() { return fechaRegistro; }
    public void setFechaRegistro(String fechaRegistro) { this.fechaRegistro = fechaRegistro; }

    public String getFechaActualizacion() { return fechaActualizacion; }
    public void setFechaActualizacion(String fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }

    public String getNombrePais() { return nombrePais; }
    public void setNombrePais(String nombrePais) { this.nombrePais = nombrePais; }

    public String getNombreTipoProveedor() { return nombreTipoProveedor; }
    public void setNombreTipoProveedor(String nombreTipoProveedor) { this.nombreTipoProveedor = nombreTipoProveedor; }
}