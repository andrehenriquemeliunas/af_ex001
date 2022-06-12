public class ex_01a{
    public static void main( String[] args){
        int soma = 0;//Declaração variável soma
        int Q[]={35,4,22,20,36,30};//Declaração variável Q - vetor
        int n = Q.length;//Declaração variável n, que recebe a quantidade de elementos do vetor Q
        
        for(int C=0; C<n; C++){//Laço de repetição até a quantiddade de elementos do vetor
            soma = soma + Q[C];//Variável soma recebe a soma dos valores do vetor
        }

        int media = soma/n;//Declaração da variável média que recebe a variável soma divido pela quantidade de elementos do vetor

        System.out.println("A média é " + media + ", e as salas que passaram é: 1(com 35), 5(com 36) e a 6(com 30).");//Exibe a média e mostra as salas que passaram

        }
}