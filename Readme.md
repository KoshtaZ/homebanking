 PROJETO I – JAVA – SISTEMA DE GESTÃO BANCÁRIA

OBJETIVO

O objetivo deste trabalho é a realização de um sistema de gestão bancária e uma aplicação para uma caixa ATM usando a linguagem Java e os conceitos OOP Isto é, desenvolver uma PoC (Proof of Concept) do novo ‘DigitalBank’ BD.

PROBLEMA
A Rumos vem com a ideia de inovar o setor bancário com uma abordagem 100% digital, inicialmente provendo serviços de gestão de clientes, cartões de crédito e de débito e finanças.
Bem como uma caixa ATM para utilização de seu novo sistema.

ROADMAP:
O projeto DB subdivide-se em quatro fases:
1 - DB em JavaSE, com o modelo e as regras de negócio para a gestão de clientes e caixa ATM.
2 - DB em JavaFX, que utiliza o modelo e a camada de serviço já existente. Somente ATM.
3 - DB em JavaEE, que utiliza a camada de serviço já existente. Somente gestão de clientes.
4 - DB reestruturação dos projetos para utilizar o JavaFX como caixa ATM utilizando o serviço REST.

DESCRIÇÃO
O sistema deve fazer gestão de clientes, contas e cartões bancários.
O enunciado deverá ser feito na totalidade cumprindo sempre com os requisitos mínimos definido pelo cliente e suas respetivas restrições. Contudo, caso o formando queira evoluir o projeto poderá fazê-lo, desde que a ideia principal e requisitos do cliente não sejam alterados.
A implementação do projeto deverá ter em conta as várias fases de alteração do próprio projeto.

REQUISITOS
Como requisitos iniciais e obrigatórios pelo cliente RMD, a aplicação deverá inicialmente ser capaz de fornecer os seguintes requisitos mínimos:

Cliente
O sistema deve guardar informações sobre os clientes, cada Cliente deverá ter as seguintes características: nif, senha, nome, data de nascimento, telefone, telemóvel, email e profissão.

Requisitos mínimos
	● Gerir a sua informação pessoal
		o Alterarnome,senha,telefone,telemóvel,emaileprofissão.
	● Gerir as suas finanças, tais como: o Realizardepósitos
		o Realizarlevantamentos
		o Realizartransferências
	● Gerir os seus cartões:
		o Possuirumcartãodedébito,decréditoouambos o Solicitarecancelarcartõesdedébito
		o Solicitarecancelarcartõesdecrédito

Restrições
	● Não pode existir mais de um cliente por NIF
	● Cada cliente só pode possuir um cartão de débito e um cartão de crédito.

Conta Bancária

Cada cliente poderá ter uma ou mais contas associadas, bem como uma conta poderá ter vários titulares (clientes). Cada conta deverá ter a seguintes características: número da conta, titular principal e titulares secundários e saldo.

Requisitos mínimos
	● Possui um saldo partilhado
	● Possui um histórico de transações

Restrições
	● Possui, no mínimo o Titular principal
	● Titular principal precisa ter, no mínimo 18 anos de idade
	● Possui, no máximo, quatro outros titulares
	● Possui, no máximo, dois cartões de crédito
	● Saldo mínimo obrigatório para abertura de conta de 50€

Cartões

Cada titular de uma conta poderá ou não possuir um cartão de débito, sendo que uma conta poderá ter no máximo um cartão de débito por titular e dois cartões de crédito.
Cada cartão tem as suas próprias características.

Cartão de Débito

Um cartão de débito está sempre associado a uma conta e consequentemente a um titular dessa conta. Este cartão permite fazer movimentos numa conta (levantamentos e depósitos), transferências entre contas do próprio cliente ou de uma conta do cliente para outras, consultar o saldo da conta à ordem e movimentos da própria conta. O cartão de débito deverá ter as seguintes características: cliente, conta, número único, PIN, valor já levantado hoje (dia)

Requisitos mínimos
	● Deverá ser protegido por um PIN de 4 dígitos
	● Atribuição de PIN automático, que deverá trocado na primeira utilização

Restrições
	● Permite, no máximo o levantamento de 400€ por dia.
	● Permite, no máximo um valor de 200€ por transação.
	● Transações não podem exceder o saldo da conta
	● Possui número único com 4 dígitos.

Cartão de Crédito

Um cartão de crédito permite fazer tudo que um cartão de débito permite fazer.
Além disso tem um plafond mensal associado (definido no momento da criação do cartão). Este plafond vai permitir fazer levantamentos “cash-advance” (levantamentos feitos do plafond e não da conta à ordem), pagamentos (também do plafond) e pagamento do cartão (que consiste em fazer o pagamento ao banco do valor já emprestado, colocando-se o valor disponível para empréstimo mensal igual ao plafond do cartão O cartão de crédito deverá ter as seguintes características: cliente, conta, número único, PIN, número de levantamento diários,

Requisitos mínimos
	● Deverá ser protegido por um PIN de 4 dígitos
	● Atribuição de PIN automático, que deverá trocado na primeira utilização

Restrições
	● Possui número único com 4 dígitos.
	● Numa operação cash-advance permite, no máximo um valor de 200€ por transação.
	● Numa operação cash-advance as transações não podem exceder o plafond

Interface Consola

A interface com o utilizador do programa deve ser o mais simples possível. Ao iniciar a aplicação deverá solicitar qual a categoria a que o cliente quer aceder, Gestão ou caixa ATM.

Gestão
	● Deverá se possível ao cliente realizar todas as operações que cada entidade fornece como serviço mínimo, exceto levantamentos

Caixa ATM
	● Acessível apenas com o número do cartão de débito ou crédito
	● Protegida com o PIN associado ao cartão introduzido
	● Deverá se possível ao cliente realizar todas as operações que cada entidade fornece como
    serviço mínimo, exceto alterar informações pessoais, bem como alterações do PIN
