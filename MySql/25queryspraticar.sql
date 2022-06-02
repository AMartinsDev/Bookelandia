use bookelandia;

##### Usando where, in ,not...#####


#Pedido que usaram cartao de credito como pagamento
select numero_do_pedido, forma_pagamento, valor_total 
from pedido
where forma_pagamento in ('credito');

#pedidos que não foram feitos com cartão de credito
select numero_do_dedido, formaPagamento, valorTotal 
from pedidos
where formaPagamento not in ('credito');

#ordenando salários de funcionarios entre 1000 e 1500
select nome, salario
from funcionarios
where salario between 8.000 and 15.000
order by salario;

#ordenando pedidos com valor até 20 reais
select numero_do_pedido as pedido, valor_total
from pedido
where valor_total between 0.00 and 200.00
order by valor_total;


##### funcoes numericas 

#Caso o cliente use um cupom de 50% de desconto, como ficaria os valores dos livros?
SELECT nome, preco / 2 as 'Preço com 50% de desconto'
FROM produto;

#Os livros aumentaram os valores em 99 centavos cada, exiba esses valores de forma arredondada para mais.
UPDATE produto
SET preco = preco + 0.99;
select preco, ceil(preco)
from produto;

#O livro "o velho e o mar" custa 41.00 reais e tem uma caixa no estoque com 41 deles, qual o valor total dessa caixa?
select nome,power(preco,2) 
from produto 
where nome = 'O velho e o mar';



########Funcoes Data########

#Exiba as datas de admissao dos funcionarios de modo que estejam formatadas
SELECT data_de_admissao, nome AS "Informações Detalhadas",
DATE_FORMAT(data_de_admissao, '%Y') AS "Ano",
DATE_FORMAT(data_de_admissao, '%M') AS "Mês",
DATE_FORMAT(data_de_admissao, '%d') AS "Dia"
FROM funcionarios;

#Quantos anos de cadastro no nosso site de ecommerce, o cliente "Jean Luiz" tem?
SELECT nome, TIMESTAMPDIFF (YEAR, dataDeCadastro, CURDATE())
from clientes
where nome = 'Jean Luiz';

#Qual o dia da semana que o cliente "gabriel pensador" se cadastrou no sistema?
select nome, dayname(dataDeCadastro)
from clientes
where nome = 'Gabriel Pensador';



#######USANDO Group by, having, count...##########

# Quantas vendas foram realizadas com boleto?
select forma_pagamento, count(forma_pagamento) 
from pedido
where forma_pagamento = 'boleto'
group by forma_pagamento;

#Quantos livros a venda temos no estoque?
select nome, count(nome)
from produto
group by nome;

#Quais os livros que custam mais de 150 reais?
select nome, preco
from produto
group by nome
having preco > 150;



######USANDO subconsultas##########

#Todos os produtos que são mais baratos que o livro x 
select * from produtos
where preco < (select preco from produtos 
where nome = 'Morte do demônio');

#pedidos mais baratos que o lviro x
select * from pedidos 
where valorTotal < (select preco from produtos
where nome = 'Morte do demônio');

#pedidos do livro x com desconto;
select * from pedidos 
where valorTotal < (select preco from produtos
where nome = 'Morte do demônio') and nome = 'Morte do demônio';

#atendentes que recebem menos que funcionario x
select * from funcionarios 
where salario < (select salario 
from funcionarios where nome = 'Aderbaaldo braga')
and  cargo = 'Atendente';

#funcionarios que recebem mais que funcionario x
select * from funcionarios
where salario > (select salario 
from funcionarios where nome = 'Aderbaaldo braga');



########USANDO TEXTO##########

#quantidade de caracteres usados na descricao do produto
select descricao, length(descricao) from produto;

#descricao do produto com letras minusculas
select nome, upper(descricao) from produto;

#descricao do produto com letras maiusculas
select nome, lower(descricao) from produto;



####USANDO JOINS#####

# Quantidade de chamados por Cliente
select  cpf, 
		codigoDoCliente
from cliente 						
left join chamados
	on cliente.cpf = chamados.codigoDoCliente;
    
   
   
# Quantidade de chamados por funcionário
select matricula,
	   codigoDoFuncionario
from funcionarios, chamados
where funcionarios.matricula = chamados.codigoDoFuncionario;