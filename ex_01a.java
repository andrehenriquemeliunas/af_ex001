public class ex_01a{
    public static void main( String[] args){
        int soma = 0;
        int Q[]={35,4,22,20,36,30};
        int n = Q.length;
        
        for(int C=0; C<n; C++){
            soma = soma + Q[C];
        }
        int media = soma/n;
        System.out.println("A média é " + media + ", e as salas que passaram é: 1(com 35), 5(com 36) e a 6(com 30)."); 

        }
}