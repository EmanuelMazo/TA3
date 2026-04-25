package com.tuempresa.proveedor.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name = "data_catalogo")
public class DataCatalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_data_catalogo")
    private Integer idDataCatalogo;

    @Column(name = "descripcion", length = 150)
    private String descripcion;

    public Integer getIdDataCatalogo() { return idDataCatalogo; }
    public void setIdDataCatalogo(Integer idDataCatalogo) { this.idDataCatalogo = idDataCatalogo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}