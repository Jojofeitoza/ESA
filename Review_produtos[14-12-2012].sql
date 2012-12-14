/*
MySQL Backup
Source Server Version: 3.21.0
Source Database: review_produtos
Date: 14/12/2012 01:36:47
*/


-- ----------------------------
--  Table structure for `comentario`
-- ----------------------------
DROP TABLE IF EXISTS `comentario`;
CREATE TABLE `comentario` (
  `coment_id` smallint(6) NOT NULL DEFAULT '0',
  `usu_id` smallint(6) DEFAULT NULL,
  `img_id` smallint(6) DEFAULT NULL,
  `quant_estrela` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`coment_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `imagem`
-- ----------------------------
DROP TABLE IF EXISTS `imagem`;
CREATE TABLE `imagem` (
  `img_id` int(11) NOT NULL DEFAULT '0',
  `img_titulo` varchar(30) DEFAULT NULL,
  `img_caminho` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`img_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `produto`
-- ----------------------------
DROP TABLE IF EXISTS `produto`;
CREATE TABLE `produto` (
  `produto_id` smallint(6) NOT NULL AUTO_INCREMENT,
  `produto_desc` varchar(30) DEFAULT NULL,
  `img_id` smallint(6) DEFAULT NULL,
  PRIMARY KEY (`produto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Table structure for `usuario`
-- ----------------------------
DROP TABLE IF EXISTS `usuario`;
CREATE TABLE `usuario` (
  `usu_id` smallint(6) NOT NULL DEFAULT '0',
  `usu_nome` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
--  Records 
-- ----------------------------
