CREATE DATABASE UC15Atividade05;

use UC15Atividade05;

CREATE TABLE FUNCIONARIO(
	codigoFuncional INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(30),
	cpf VARCHAR(11),
	rg VARCHAR(15),
	endereco VARCHAR(100),
	telefone VARCHAR(15),
	email VARCHAR(35),
	cargo VARCHAR(15),
	remuneracao DOUBLE(8,2),
	percentualComissao INT,
	statusFuncionario VARCHAR(10),
	historicoFuncionario TEXT
);

CREATE TABLE CLIENTE(
	codigoCliente INT PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(30),
	cpf VARCHAR(11),
	rg VARCHAR(15),
	endereco VARCHAR(100),
	telefone VARCHAR(15),
	email VARCHAR(35),
	vendedorResponsavel int,
	historicoAtendimento TEXT,
	CONSTRAINT fk_VENDEDOR_RESPONSAVEL_ID FOREIGN KEY(vendedorResponsavel) REFERENCES FUNCIONARIO(codigoFuncional)
);

CREATE TABLE ITENS_ORCAMENTO(
	codigoItem INT PRIMARY KEY AUTO_INCREMENT,
	item VARCHAR(30),
	unidade VARCHAR(15),
	valor DOUBLE(8,2)
);

CREATE TABLE ORCAMENTO(
	numeroOrcamento INT PRIMARY KEY AUTO_INCREMENT,
	data DATE,
	cliente INT,
	vendedor INT,
	detalhes TEXT,
	custo DOUBLE(8,2),
	CONSTRAINT fk_CLIENTE_ID FOREIGN KEY(cliente) REFERENCES CLIENTE(codigoCliente),
	CONSTRAINT fk_VENDEDOR_ID FOREIGN KEY(vendedor) REFERENCES FUNCIONARIO(codigoFuncional)
);

CREATE TABLE USUARIO(
	codigoUsuario INT PRIMARY KEY AUTO_INCREMENT,
	funcionario INT,
	usuario VARCHAR(12),
	senha VARCHAR(35),
	nivelAcesso INT,
	CONSTRAINT fk_FUNCIONARIO_ID FOREIGN KEY(funcionario) REFERENCES FUNCIONARIO(codigoFuncional)
);




	


