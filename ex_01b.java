import java.util.Scanner;
public class ex_01b{
    public static void main( String[] args){
        Scanner s = new Scanner( System.in);
        int soma = 0;

        int q[]={0, 0, 0, 0, 0, 0};
        int n = q.length;
    
        System.out.print("Sala 1: ");
        q[0] = s.nextInt();

        System.out.print("Sala 2: ");
        q[1] = s.nextInt();

        System.out.print("Sala 3: ");
        q[2] = s.nextInt();

        System.out.print("Sala 4: ");
        q[3] = s.nextInt();

        System.out.print("Sala 5: ");
        q[4] = s.nextInt();

        System.out.print("Sala 6: ");
        q[5] = s.nextInt();

        for(int c=0; c<n;c++){
            soma = soma + q[c];
        }

        int media = soma/n;

        System.out.println("-------------------------------------");
        System.out.println("A média de alunos das salas é: " + media);
        System.out.println("-------------------------------------");

        System.out.println("Salas MAIORES que a média: ");
        if(q[0] > media){
            System.out.println("- Sala 1");
        }
        if(q[1] > media){
            System.out.println("- Sala 2");
        }
        if(q[2] > media){
            System.out.println("- Sala 3");
        }
        if(q[3] > media){
            System.out.println("- Sala 4");
        }
        if(q[4] > media){
            System.out.println("- Sala 5");
        }
        if(q[5] > media){
            System.out.println("- Sala 6");
        }
        System.out.println("-------------------------------------");

        System.out.println("Salas MENORES que a média: ");
        if(q[0] < media){
            System.out.println("- Sala 1");
        }
        if(q[1] < media){
            System.out.println("- Sala 2");
        }
        if(q[2] < media){
            System.out.println("- Sala 3");
        }
        if(q[3] < media){
            System.out.println("- Sala 4");
        }
        if(q[4] < media){
            System.out.println("- Sala 5");
        }
        if(q[5] < media){
            System.out.println("- Sala 6");
        }
        System.out.println("-------------------------------------");

        s.close();
    }
        
}
