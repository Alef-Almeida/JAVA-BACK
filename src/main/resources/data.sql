CREATE TABLE usuario (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         email VARCHAR(255) NOT NULL UNIQUE,
                         nome VARCHAR(255) NOT NULL,
                         senha VARCHAR(255) NOT NULL
);

INSERT INTO usuario (email, nome, senha) VALUES
                                             ('alef.almeida@email.com', 'Alef Almeida', '123'),
                                             ('nathan.santos@email.com', 'Nathan Santos', '456'),
                                             ('atomos.silva@email.com', 'Atomos Silva', '789');
