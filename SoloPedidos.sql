CREATE DATABASE IF NOT EXISTS BurgerBros;
USE BurgerBros;

CREATE TABLE pedidos (
    id_pedido INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    total_pedido DECIMAL(7, 2),
    nombre_cliente VARCHAR(256),
    fecha_pedido DATETIME,
    estado_pedido BOOLEAN
);

DELIMITER //
CREATE PROCEDURE insertar_pedido (
    IN p_total_pedido DECIMAL(7, 2),
    IN p_nombre_cliente VARCHAR(256),
    IN p_fecha_pedido DATETIME,
    IN p_estado_pedido BOOLEAN
)
BEGIN
    INSERT INTO pedidos (total_pedido, nombre_cliente, fecha_pedido, estado_pedido)
    VALUES (p_total_pedido, p_nombre_cliente, p_fecha_pedido, p_estado_pedido);
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE listar_pedidos()
BEGIN
    SELECT * FROM pedidos;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE listar_pedido_id (
    IN p_id_pedido INT
)
BEGIN
    SELECT * FROM pedidos WHERE id_pedido = p_id_pedido;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE actualizar_pedido (
    IN p_id_pedido INT,
    IN p_total_pedido DECIMAL(7, 2),
    IN p_nombre_cliente VARCHAR(256),
    IN p_fecha_pedido DATETIME,
    IN p_estado_pedido BOOLEAN
)
BEGIN
    UPDATE pedidos 
    SET total_pedido = p_total_pedido, 
        nombre_cliente = p_nombre_cliente, 
        fecha_pedido = p_fecha_pedido, 
        estado_pedido = p_estado_pedido
    WHERE id_pedido = p_id_pedido;
END //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE eliminar_pedido (
    IN p_id_pedido INT
)
BEGIN
    DELETE FROM pedidos WHERE id_pedido = p_id_pedido;
END //
DELIMITER ;

CALL insertar_pedido(
    45.99,                      
    'Juancito Pérez',               
    NOW(),                      
    TRUE                        
);

CALL listar_pedidos();


