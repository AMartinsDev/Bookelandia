#Normalização
#Entidades que utilizaremos a principio: Clientes(feito), Pedidos(falta inserir), Produtos, Funcionarios, Categoria de produto(falta inserir), 


# Criar o banco de dados
create database bookelandia;


#Mostrar o banco de dados
show databases;


#Utitilizar o banco de dados criado
use bookelandia;


#Excluir um banco
drop database bookelandia;


#Mostrar as tabelas do banco atual
show tables;


#Criar as tabelas
create table `clientes`(
cpf varchar(11),
senha varchar(20) not null,
nome varchar(50) not null,
email varchar(50) not null,
telefone varchar(15),
endereço varchar(100),
dataDeCadastro date,
primary key (cpf)
);
#altera a tabela de clientes, removendo os campos `email` e `senha`
alter table clientes drop column email;
alter table clientes drop column senha;


create table `categoria_produtos`(
codigo int,
nome varchar(20) not null,
descricao varchar (20),
primary key (codigo)
);


create table `produto`(
codigoDoProduto int, 
codigoDaCategoria int, 
nome varchar(20),
descricao text,
preco decimal(10,2)
);
#Altera a tabela de produto para adicionar uma primary key caso voce tenha esquecido
alter table produto add primary key (codigoDoProduto)
#Altera a tabela produto para dizer que existe uma chave estrangeira nela
alter table produto
add constraint fk_produtos_categoria_produtos
foreign key (codigoDaCategoria)
references categoria_produtos (codigo);


create table `avaliacao_do_pedido`(
codigo_do_produto int,
codigo_do_cliente varchar (11),
nota int check (nota >=1 and nota <=5),
descricao text,
primary key (codigo_do_produto, codigo_do_cliente),
foreign key (codigo_do_produto) references produto(codigoDoProduto),
foreign key (codigo_do_cliente) references clientes(cpf)
);

select email from login;

create table `login`(
email varchar (50) not null,
senha varchar (20) not null, 
nivel_de_acesso varchar(11) check (nivel_de_acesso in ('admin', 'cliente', 'funcionario')),
`status` boolean 
);
# Altera a tabela de logins para marcar a chave primária
alter table `login` add primary key (`email`);


create table `pedido`(
numero_do_pedido int,
codigo_do_cliente varchar(11),
forma_pagamento varchar (11) check (forma_pagamento in ('debito', 'credito', 'boleto')),
`status` boolean,
`data` date,
cupom varchar(10),  
valor_total float,
primary key (numero_do_pedido),
foreign key (codigo_do_cliente) references clientes(cpf)
);


create table `produtos_do_pedido`(
numero_do_pedido int not null,
codigo_do_produto int not null,
quantidade int,
primary key (numero_do_pedido, codigo_do_produto),
foreign key (numero_do_pedido) references pedido(numero_do_pedido ),
foreign key (codigo_do_produto) references produto(codigoDoProduto)
);


create table `funcionarios`(
matricula varchar(11) not null,
nome varchar(50) not null,
data_de_admissao date,
cargo varchar(50),
salario decimal,
primary key (matricula)
);


create table `chamados`(
ticket varchar(11) not null,
`status` boolean, 
codigo_do_funcionario varchar(11) not null,
codigo_do_cliente varchar(11) not null,
descricao text,
codigo_do_pedido int,
primary key (ticket),
foreign key (codigo_do_funcionario) references funcionarios(matricula),
foreign key (codigo_do_cliente) references clientes(cpf),
foreign key (codigo_do_pedido) references pedido(numero_do_pedido)
);


#Exemplo para mostrar informações de uma tabela
describe produto;


#Exemplo para exibir os registros de uma tabela
select * from clientes;
select nome from clientes;
select nome, endereço from clientes;


#INSERIR DADOS NAS TABELAS
insert into clientes
(cpf, nome, telefone, endereço, dataDeCadastro)
values
('05423687453', 'Fernanda Montenegro', '75982697542', 'Rua do Brejo, 623', '2022-05-19'),
('02385967585', 'Jean Luiz', '71-996271627', 'Rua do capão, 1', '2019-10-19'),
('56298746985', 'Gabriel Pensador','71-982674749', 'Rua de brilhantes, 45', '2020-10-29'),
('12349568745', 'Luiz Santos','11-33814152', 'Rua do Limoeiro, 11', '2022-05-19'),
('23456987564', 'Smith Oliveira', '33-987569568', 'Rua do Palo Alto, 66', '2021-03-23'),
('32154698574','Júlio César', '71-33814626', 'Rua Altino Seberto, 26', '2018-10-15'),
#a próxima linha foi feita antes de dar um alter table na tabela clientes
('12345678901', 'abc@123', 'João Oliveira', 'joao.oliveira@bookelandia.com', '11986764543', 'Rua das Orquídeas, 456', NOW());


insert into funcionarios
(matricula, nome, data_de_admissao, cargo, salario)
values
('712469852', 'Maria da Silva', '2020-06-01', 'Desenvolvedor Web', '13.000'),
('741028965', 'Arthur Martins', '2022-06-13', 'Analista de Sistema', '14.000'),
('123456789', 'Silvia Maria', '2021-09-12', 'Gerente de Logistica', '14.000'),
('357455389', 'Roberto Santos', '2020-07-12', 'Suporte', '10.000'),
('533658974', 'Johny Silva', '2018-01-20', 'Administrador', '20.000');


insert into categoria_produtos
(codigo, nome, descricao)
values
('4444', 'Romance', 'Categoria romances'),
('0000', 'Ficção Cientifica', 'Categoria ficção'),
('3333', 'Terror', 'Categoria terror'),
('2222', 'Fisicos', 'LivrosFisicos'),
('1111', 'Ebooks', 'LivrosDigitais');

insert into produto
(codigoDoProduto, codigoDaCategoria, nome, descricao, preco)
values
('41000', '2222', 'O Pequeno Príncipe', 'Clássicos Infantis', '30.00'),
('33387', '1111', 'Dom Casmurro', 'Clássicos Brasileiros - M. De Assis', '20.00'),
('36987', '1111', 'Vidas Secas', 'Clássicos Brasileiros - Graciliano Ramos', '20.00'),
('14789', '2222', 'A Hora Da Estrela', 'Clássicos Brasileiros - Clarice Lispector', '40.00'),
('55891', '1111', 'Capitães Da Areia', 'Clássicos Brasileiros - Jorge Amado', '20.00'),
('12345', '2222', 'Cinderela', 'Clássicos Infantis Ver Final - Irmãos Grimm', '200.00'),
('45697', '2222', 'Crônicas de Nárnia', 'C.S Lewis', '50.00'),
('14535', '2222', 'O Velho e o Mar', 'Clássicos Literários - E.Hemingway', '40.00'),
('14756', '2222', 'Fahrenheit 451', 'Clássicos Distópicos - R.Bradbury', '40.00'),
('26669', '2222', 'Revolução dos Bichos', 'Clássicos Distópicos - George Orwell', '40.00'),
('84597', '1111', 'Dom Quixote', 'Clássicos Literários - M.Cervantes', '150.00'),
('45687', '2222', 'Guerra e Paz', 'Clássicos Literários - Tolstoi', '150.00'),
('69852', '1111', 'Cem Anos De Solidão', 'Clássicos Literários - G.Garcia', '80.00'),
('67544', '1111', 'Branca de Neve', 'Clássicos Infantis Ver. Digital', '20.00'),
('87546', '2222', 'Branca de Neve', 'Clássicos Infantis, Irmãos Grimm', '35.00'),
('95787', '1111', 'Hamlet', 'Uma das maiores obras de W.Shakespeare', '50.00'),
('95786', '2222', 'Hamlet', 'Uma das maiores obras de W.Shakespeare', '100.00'),
('14578', '4444', 'Madame Bovary', 'livro de romance', 100.00),
('26674', '0000', 'Box Star Wars', 'livro de ficção cientifica', 200.00),
('26478', '3333', 'Dracula', 'livro de terror', 200.00);

insert into login
(email, senha, nivel_de_acesso, `status`)
values
('cgbvud@lxvhhq.com', '123456@', 'funcionario',true),
('pmlxew@veracg.com', '213548@', 'funcionario',true),
('ucmnyo@afyyrn.com', '662825f', 'funcionario',true),
('esvhne@jsnpxh.com', 'qsd223a', 'funcionario',true),
('lffcosta2@yahoo.com.br', 'assdedc', 'cliente',false),
('derby451@hotmail.com', 'fghhbb2', 'cliente',true),
('azzyyj@hhnlqu.com', '236af2c', 'cliente', true),
('gwagmp@fsqcjc.com', 'wqw3333', 'cliente',false),
('xgkoto@xmwrjd.com', '#355221', 'cliente',true),
('tzoiow@gflnwi.com', 'w7q46', 'cliente',true),
('xsxkvw@bookelandia.com', '213548@', 'admin',true);


insert into pedido
(numero_do_pedido,codigo_do_cliente,forma_pagamento,`status`,`data`, cupom, valor_total)
values
('1', '05423687453', 'debito', true, '2022-05-20', '00001', '80.00'),
('2', '23456987564', 'credito', true, '2019-07-06', '00006', '250.00'),
('3', '56298746985', 'boleto', false, '2021-11-01', ' ', '90.00');


insert into produtos_do_pedido
(numero_do_pedido, codigo_do_produto, quantidade)
values
('1', '33387', '1'),
('1', '36987', '1'),
('1', '14789', '1'),
('2', '84597', '2'),
('2', '95786', '2');

select * from clientes;

##########################################################################################################