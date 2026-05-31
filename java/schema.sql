CREATE DATABASE IF NOT EXISTS parcial;

USE parcial;

CREATE TABLE personaje(

    id INT AUTO_INCREMENT PRIMARY KEY,

    nombre VARCHAR(50) NOT NULL,

    nivel INT NOT NULL,

    clase VARCHAR(20) NOT NULL
);

CREATE TABLE inventario(

    id_item INT AUTO_INCREMENT PRIMARY KEY,

    nombre_item VARCHAR(50) NOT NULL,

    cantidad INT NOT NULL,

    id_personaje INT,

    FOREIGN KEY(id_personaje)
    REFERENCES personaje(id)
);

-- Datos de prueba

INSERT INTO personaje(nombre,nivel,clase)
VALUES
('Arthas',10,'Guerrero'),
('Merlin',15,'Mago'),
('Legolas',12,'Arquero');

INSERT INTO inventario(nombre_item,cantidad,id_personaje)
VALUES
('Espada',1,1),
('Pocion',5,2),
('Arco',1,3);