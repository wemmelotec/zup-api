CREATE TABLE usuario(
	codigo 			BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome 			VARCHAR(50) NOT NULL,
	e_mail 			VARCHAR(20) NOT NULL UNIQUE,
	cpf 			VARCHAR(14)  NOT NULL UNIQUE,
	data_nascimento DATE NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT 	INTO usuario (nome, e_mail, cpf, data_nascimento) VALUES ('Yuri', 'yr@teste.com.br', '123.456.789-22','2021/05/18');