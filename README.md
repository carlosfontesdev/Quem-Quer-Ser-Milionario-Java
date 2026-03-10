# Projeto: Jogo Quem Quer Ser Milionário

## Descrição do Problema
O projeto consistiu no desenvolvimento de um simulador do jogo "Quem Quer Ser Milionário", 
focado na criação de uma arquitetura que suporte a gestão estruturada de perguntas e a persistência de dados. 
O desafio central foi garantir que o sistema apresentasse questões adequadas ao nível do jogador, 
gerisse corretamente as opções de resposta e permitisse o uso de ajudas (50/50 e Troca de Pergunta) sem comprometer a lógica do jogo.

## Lista de Funcionalidades Implementadas

**1º Fase - Registo e Inicio**  

Registar Nome do Jogador; ✅ 
Verificar se o nome ficou gravado na Base de Dados; ✅ 
Verificar se a primeira pergunta que aparece corresponde ao nível 1; ✅ 
Ir buscar as 4 opções que correspondem é pergunta inicial; ✅ 

**2º Fase - Partida** 

Verificar se uma das 4 opções é a correta para a pergunta em questão; ✅ 
Verificar se ao selecionar a resposta errada o programa mostra a janela do “Fim”; ✅ 
Verificar que ao selecionar a resposta correta o programa reconhece o acerto e muda de pergunta; ✅ 
Verificar se o patamar dos prémios aparece na janela e fica permanentemente; ✅ 
Verificar se o patamar dos prémios aumenta conforme cada pergunta acertada; ✅ 
Verificar se as perguntas que aparecem correspondem ao nível que o utilizador se encontra; ✅ 

**3º Fase – Ajudas** 

50/50:

Validar que o botão de ajuda (50/50) está disponível e pode ser selecionado; ✅ 
Conferir que ao selecionar o botão duas opções ficam bloqueadas ;✅ 
Garantir que das duas opções bloqueadas nenhuma é a resposta correta; ✅ 
Conferir que depois de usada a opção ela torna-se desativa; ✅ 

Mudar de Pergunta:

Conferir que o botão da ajuda (Mudar de Pergunta) está disponível e selecionável; ✅ 
Verificar que ao selecionar o botão o sistema muda de pergunta; ✅ 
Conferir que a pergunta que vêm é consoante o nível que o jogador estiver; ✅ 
Confirmar que depois de usada a opção ela fica desativa; ✅ 

## Instruções de utilização da aplicação

Início e Registo:
Introduza o seu Nome de Jogador.
Clique em Começar para carregar a primeira pergunta (Nível 1).

Durante a Partida:
Escolha uma das 4 opções de resposta.
Se acertar: O seu prémio sobe no painel lateral e avança para o nível seguinte.
Se errar: O jogo termina e será exibida a janela de "Fim".

Uso de Ajudas:
Botão 50/50: Elimina duas respostas erradas (disponível uma vez).
Botão Trocar Pergunta: Gera uma nova questão do mesmo nível (disponível uma vez).

Objetivo:
Responda corretamente a todas as questões para atingir o prémio máximo!