Algoritmo "area do losango"
// Disciplina   : [Lógica de Programação com JavaScript]
// Professor   : Jailson
// Descrição   : Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
// Autor(a)    : Victor Gabriel
// Data atual  : 01/09/2022
Var
// Seção de Declarações das variáveis 
diagonal_maior: real
diagonal_menor: real
area: real

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
escreval("descreva a diagonal maior ")
leia(diagonal_maior)
escreval("descreva a diagonal menor")
leia(diagonal_menor)
area<-(diagonal_maior+1)*(diagonal_menor-1)/2
escreval("a área do losango é:",area)

Fimalgoritmo