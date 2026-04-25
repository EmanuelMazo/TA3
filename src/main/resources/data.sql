-- LIMPIAR (opcional pero recomendado)
DELETE FROM proveedor;
DELETE FROM data_catalogo;
DELETE FROM pais;

-- =========================
-- TABLA: pais
-- =========================
INSERT INTO pais (id_pais, nombre) VALUES
(1, 'Peru'),
(2, 'Estados Unidos'),
(3, 'Espana'),
(4, 'Argentina'),
(5, 'Chile');

-- =========================
-- TABLA: data_catalogo
-- =========================
INSERT INTO data_catalogo (id_data_catalogo, descripcion) VALUES
(1, 'Proveedor de servicios'),
(2, 'Proveedor de productos'),
(3, 'Proveedor mixto'),
(4, 'Fabricante'),
(5, 'Distribuidor');

-- =========================
-- TABLA: proveedor
-- =========================
INSERT INTO proveedor (
    id_proveedor,
    razonsocial,
    ruc,
    direccion,
    celular,
    contacto,
    estado,
    pais_id,
    tipo_proveedor_id,
    fecha_registro,
    fecha_actualizacion
) VALUES
(1, 'Distribuidora Tecnologica S.A.C.', '20123456789', 'Av. Lima 123, Lima', '987654321', 'Carlos Mendoza', 1, 1, 2, '2026-01-15 10:30:00', '2026-01-15 10:30:00'),
(2, 'Servicios Integrales IT S.R.L.', '20234567890', 'Jr. Ayacucho 456, Arequipa', '955123456', 'Maria Rodriguez', 1, 1, 1, '2026-02-20 14:45:00', '2026-02-20 14:45:00'),
(3, 'Global Supplies Corp.', '30987654321', '789 Commerce St, Miami', '+13051234567', 'John Smith', 1, 2, 4, '2026-03-10 08:00:00', '2026-03-10 08:00:00'),
(4, 'Importaciones El Sur S.A.', '20345678901', 'Av. Sur 888, Santiago', '+56912345678', 'Pedro Gomez', 1, 5, 5, '2026-03-25 16:20:00', '2026-03-25 16:20:00'),
(5, 'Multiservicios del Norte E.I.R.L.', '20456789012', 'Calle Norte 222, Buenos Aires', '+54111234567', 'Ana Lopez', 1, 4, 3, '2026-04-01 09:15:00', '2026-04-01 09:15:00');