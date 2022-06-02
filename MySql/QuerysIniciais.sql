############################################## 
############# TUTORIAL DE QUERYS #############

# Quem são os funcionários?
select * from `funcionarios`;

# Qual é o nome e a matrícula dos funcionários?
select nome, matricula from `funcionarios`;

# Quais são os produtos mais caros?
select nome, preco from `produto` order by preco desc;

# Quem são os clientes com sobrenome 'Oliveira'?
select * from clientes where nome like '%Oliveira';

# Quais são os nomes e preços dos produtos que custam entre R$30 e R$60?
select nome, preco 
from produto 
where preco >= 30 and preco <= 60
order by preco;

# Quais são os nomes e preços dos produtos que custam entre R$30 e R$60? (2ª forma)
select nome, preco
from produto
where preco between 30 and 60
order by preco;

# Quais são pedidos feitos com pix ou cartão de crédito?
select numeroDoPedido, formaPagamento, valorTotal 
from pedido
where formaPagamento = 'pix'
	or formaPagamento = 'credito';

# Quais são pedidos feitos com pix ou cartão de crédito? (2ª forma)
select numeroDoPedido, formaPagamento, valorTotal 
from pedidos
where formaPagamento in ('pix', 'cartão de crédito');

# Quais são os pedidos feitos com todos as formas de pagamento exceto pix?
select numeroDoPedido, formaPagamento, valorTotal 
from pedidos
where formaPagamento <> 'pix';

# Quais são os pedidos feitos com todos as formas de pagamento exceto pix e cartão de crédito? 
select numeroDoPedido, formaPagamento, valorTotal 
from pedidos
where formaPagamento not in ('pix', 'cartão de crédito');

# Quais são as categorias de produtos? (alias)
select nome as `Categoria do Produto` from categoria_produtos;

# Quantos funcionários trabalham na loja?
select count(matricula) as `Quantidade de Funcionários` from funcionarios;

# Quantos funcionários trabalham na loja? - 2ª forma
select count(0) from funcionarios;

# Qual é o volume total de vendas?
select sum(valorTotal) as `Volume de Vendas` from pedidos;

# Qual é o volume médio de vendas?
select avg(valorTotal) as `Volume Médio de Vendas` from pedidos;

# Quais são os pedidos que usaram cupons de desconto?
select * from pedidos where cupom is not null;

# Quantos pedidos não usaram cupons de desconto?
select count(1) from pedidos where cupom is null;

# Formatação em caixa baixa e caixa alta
select lower(nome), upper(cargo) from funcionarios;

# Tamanho do texto
select formaPagamento, length(formaPagamento) from pedidos;

# Seleciona parte do texto
select nome, substr(nome, 1, 4) from clientes;

# Exibe a data corrente
select now();

# Qual é o mês de cadastro dos funcionários?
select 	nome, 
		dataDeAdmissao, 
		month(dataDeAdmissao), 
        date_format(dataDeAdmissao, '%M')
from funcionarios;

# Quantas vendas foram realizadas por forma de pagamento?
select formaPagamento, count(formaPagamento) 
from pedidos
group by formaPagamento;

# Quantas vendas acima de R$50 foram realizadas por forma de pagamento?
select forma_Pagamento, count(forma_Pagamento)
from pedidos
where valorTotal > 50
group by formaPagamento;

# Quais são as formas de pagamento que geraram volume acima de R$60?
select formaPagamento, sum(valorTotal) 
from pedidos
group by formaPagamento
having sum(valorTotal) > 60;