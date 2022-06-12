# Exercício 1B da AF
Média de alunos com vetor 

## Algoritmo do Exercício

INÍCIO
    Soma -> 0
    C <- 1
    vet q -> [0..6]
    
    ESCREVA("Alunos sala 1"),
    LEIA vet[0]
    ESCREVA("Alunos sala 2"),
    LEIA vet[1]
    ESCREVA("Alunos sala 3"),
    LEIA vet[2]
    ESCREVA("Alunos sala 4"),
    LEIA vet[3]
    ESCREVA("Alunos sala 5"),
    LEIA vet[4]
    ESCREVA("Alunos sala 6"),
    LEIA vet[5]

    ENQUANTO C <= 6 FAÇA
        LER(Q[C])
        Soma <- Soma + Q[C]
        C <- C + 1
    FIM ENQUANTO

    Média <- Soma/6

    EXIBIR(Média)

    ESCREVA('Salas acima da media:')
    SE vet[0] > Média, FAÇA
        ESCREVA('Sala 1')
    SE vet[1] > Média, FAÇA
        ESCREVA('Sala 2')
    SE vet[2] > Média, FAÇA
        ESCREVA('Sala 3')
    SE vet[3] > Média, FAÇA
        ESCREVA('Sala 4')
    SE vet[4] > Média, FAÇA
        ESCREVA('Sala 5')
    SE vet[5] > Média, FAÇA
        ESCREVA('Sala 6')
    FIM SE

    ESCREVA('Salas abaixo da media:')
    SE vet[0] < Média, FAÇA
        ESCREVA('Sala 1')
    SE vet[1] < Média, FAÇA
        ESCREVA('Sala 2')
    SE vet[2] < Média, FAÇA
        ESCREVA('Sala 3')
    SE vet[3] < Média, FAÇA
        ESCREVA('Sala 4')
    SE vet[4] < Média, FAÇA
        ESCREVA('Sala 5')
    SE vet[5] < Média, FAÇA
        ESCREVA('Sala 6'<
    FIM SE

FIM

## Fluxograma
<img src="teste.jpg" alt="">
