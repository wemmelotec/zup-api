CREATE TABLE veiculo(
	codigo 			BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	dia_de_rodizio	VARCHAR(50),
	rodizio_ativo	BOOLEAN,
	valor 			VARCHAR(20),
    marca			VARCHAR(20),
    modelo			VARCHAR(20),
	ano_modelo 		BIGINT(20)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;