#Api-Pessoas

query

CREATE TABLE tb_pessoas (
	PESSOA_ID INTEGER,
	NOME TEXT,
	CPF INTEGER NOT NULL,
	SEXO TEXT NOT NULL,
	DATA_CRIACAO INTEGER NOT NULL,
	DATA_ALTERACAO INTEGER NOT NULL,
	STATUS TEXT NOT NULL
);

crie e configure o DB no application propreies
Start o serviço
e faça a chamada via post

