CREATE TABLE livros (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    valor DECIMAL(10, 2),
    idLivro VARCHAR(255),
    tpMovimento VARCHAR(255),
    autor VARCHAR(255),
    anoPublicacao INT,
    editora VARCHAR(255),
    idioma VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE cliente (
    id INT NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255),
    sobrenome VARCHAR(255),
    idade INT,
    email VARCHAR(255),
    PRIMARY KEY (id)
);

ALTER TABLE livros
DROP COLUMN tpMovimento;