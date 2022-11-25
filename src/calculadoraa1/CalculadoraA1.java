//CALCULADORA ATIVIDADE 1 ANÁLISE E DESENVOLVIMENTO DE SISTEMAS PROGRAMAÇÃO I 
package calculadoraa1;

/**
 * @author lucas
 */
import java.util.Scanner;
public class CalculadoraA1 {

    public static void main(String[] args) {
        double n1, n2;
        double soma, subtracao, multiplicacao, divisao;
        int opcao;
        boolean programa = false;
        Scanner entrada = new Scanner(System.in);
         
        while(!programa){
        boolean reset = false;
        
        while(!reset && !programa){
        System.out.println("Selecione a operação!");
        System.out.println("(1) - Soma");
        System.out.println("(2) - Subtração");
        System.out.println("(3) - Multiplicação");
        System.out.println("(4) - Divisão");
        System.out.println("(0) - Encerrar calculadora");
        System.out.println("Digite a opção: ");        
        opcao = entrada.nextInt();
        
        if (opcao == 0){
            System.out.println("A calculadora foi encerrada");
            System.exit(0);
        }
        
        System.out.println("Informe o primeiro número: ");
            n1 = entrada.nextDouble();
        System.out.println("Informe o segundo número: ");
            n2 = entrada.nextDouble();
        
                   
           
           
        switch(opcao){
            case 1:
                soma = n1+n2;
                System.out.println("O RESULTADO É IGUAL A: "+soma);
                break;
                
            case 2:
                subtracao = n1-n2;
                System.out.println("O RESULTADO É IGUAL A: "+subtracao);
                break;
                
            case 3:
                multiplicacao = n1*n2;
                System.out.println("O RESULTADO É IGUAL A: "+multiplicacao);
                break;
                
            case 4:
                if(n1<n2){
                    System.out.println("NÃO FOI POSSIVEL REALIZAR O CALCULO");
                }else{
                    divisao = n1/n2;
                System.out.println("O RESULTADO É IGUAL A: "+divisao);              
                }
                break;
                
                
            default:
                System.out.println("OPERAÇÃO INVÁLIDA");
                }
        }


    }
    }
}
