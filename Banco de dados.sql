
CREATE DATABASE IF NOT EXISTS `db` ;
USE `db`;

-- Copiando estrutura para tabela db.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `cpf` varchar(50) NOT NULL DEFAULT '',
  `dt_nascimento` varchar(50) NOT NULL DEFAULT '',
  `nome` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;


-- Copiando estrutura para tabela db.projeto
CREATE TABLE IF NOT EXISTS `projeto` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `dt_inicio` varchar(50) DEFAULT NULL,
  `dt_termino` varchar(50) DEFAULT NULL,
  `descricao` varchar(50) DEFAULT NULL,
  `projetista` varchar(50) DEFAULT NULL,
  `cliente` varchar(50) NOT NULL,
  `valor_financeiro` double DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

