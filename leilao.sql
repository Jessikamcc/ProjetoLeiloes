-- Cria o banco de dados (caso não exista)
CREATE DATABASE IF NOT EXISTS leilao;
USE leilao;

-- Criação da tabela produtos
CREATE TABLE `produtos` (
  `id` bigint(20) UNSIGNED NOT NULL,
  `nome` text DEFAULT NULL,
  `valor` int(11) DEFAULT NULL,
  `status` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SELECT * FROM  produtos;

-- Inserção de dados
INSERT INTO `produtos` (`id`, `nome`, `valor`, `status`) VALUES
(2, 'PS4', 1500, 'Vendido'),
(3, 'Xbox 360', 800, 'Vendido'),
(4, 'Iphone 12', 4800, 'Vendido'),
(5, 'PS2', 400, 'A Venda');

-- Chave primária
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`id`);

-- Auto incremento
ALTER TABLE `produtos`
  MODIFY `id` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

COMMIT;