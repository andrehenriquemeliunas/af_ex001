import java.util.Scanner;
public class ex_01b{
    public static void main( String[] args){
        Scanner s = new Scanner( System.in);
        int soma = 0;//Declaração variável soma

        int q[]={0, 0, 0, 0, 0, 0};//Declaração variável q - vetor
        int n = q.length;//Declaração variável n, recebendo a quantidade elementos do vetor
    
        System.out.print("Sala 1: ");//Pede ao usuário a quantidade de alunos da sala 1
        q[0] = s.nextInt();//Armazena resposta

        System.out.print("Sala 2: ");//Pede ao usuário a quantidade de alunos da sala 2
        q[1] = s.nextInt();//Armazena resposta

        System.out.print("Sala 3: ");//Pede ao usuário a quantidade de alunos da sala 3
        q[2] = s.nextInt();//Armazena resposta

        System.out.print("Sala 4: ");//Pede ao usuário a quantidade de alunos da sala 4
        q[3] = s.nextInt();//Armazena resposta

        System.out.print("Sala 5: ");//Pede ao usuário a quantidade de alunos da sala 5
        q[4] = s.nextInt();//Armazena resposta

        System.out.print("Sala 6: ");//Pede ao usuário a quantidade de alunos da sala 6
        q[5] = s.nextInt();//Armazena resposta

        for(int c=0; c<n;c++){//Laço de repetição até a quantiddade de elementos do vetor
            soma = soma + q[c];//Variável soma recebe a soma dos valores do vetor
        }

        int media = soma/n;//Declaração da variável média que recebe a variável soma divido pela quantidade de elementos do vetor

        System.out.println("-------------------------------------");//Questão estética
        System.out.println("A média de alunos das salas é: " + media);//Exibe a média
        System.out.println("-------------------------------------");//Questão estética

        System.out.println("Salas MAIORES que a média: ");//Exibe as salas maiores que a média
        if(q[0] > media){//Verifica se a sala é maior
            System.out.println("- Sala 1");//Se sim, mostra qual a sala
        }
        if(q[1] > media){//Verifica se a sala é maior
            System.out.println("- Sala 2");//Se sim, mostra qual a sala
        }
        if(q[2] > media){//Verifica se a sala é maior
            System.out.println("- Sala 3");//Se sim, mostra qual a sala
        }
        if(q[3] > media){//Verifica se a sala é maior
            System.out.println("- Sala 4");//Se sim, mostra qual a sala
        }
        if(q[4] > media){//Verifica se a sala é maior
            System.out.println("- Sala 5");//Se sim, mostra qual a sala
        }
        if(q[5] > media){//Verifica se a sala é maior
            System.out.println("- Sala 6");//Se sim, mostra qual a sala
        }
        System.out.println("-------------------------------------");//Questão estética

        System.out.println("Salas MENORES que a média: ");//Exibe as salas menores que a média
        if(q[0] < media){//Verifica se a sala é menor
            System.out.println("- Sala 1");//Se sim, mostra qual a sala
        }
        if(q[1] < media){//Verifica se a sala é menor
            System.out.println("- Sala 2");//Se sim, mostra qual a sala
        }
        if(q[2] < media){//Verifica se a sala é menor
            System.out.println("- Sala 3");//Se sim, mostra qual a sala
        }
        if(q[3] < media){//Verifica se a sala é menor
            System.out.println("- Sala 4");//Se sim, mostra qual a sala
        }
        if(q[4] < media){//Verifica se a sala é menor
            System.out.println("- Sala 5");//Se sim, mostra qual a sala
        }
        if(q[5] < media){//Verifica se a sala é menor
            System.out.println("- Sala 6");//Se sim, mostra qual a sala
        }
        System.out.println("-------------------------------------");//Questão estética

        s.close();
    }
        
}
