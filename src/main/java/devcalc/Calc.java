// 1 - Pacotes
package devcalc;
// 2 - Bibliotecas

import java.util.Scanner;

// 3 - Classe
public class Calc {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // entrada = input

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        // Menu Calculadora
        System.out.println(">>> CALCULADORA <<<");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("Escolha o Calculo Desejado: ");

        //Recebe Opção Desejada
        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;
        //Numeros a serem usados para Calcular
        if (opcao >= 1 && opcao <= 4) {


            System.out.print("Entre Com 1º Numero:>  ");
             num1 = entrada.nextInt();

            System.out.print("Entre Com 2º Numero:>  ");
             num2 = entrada.nextInt();
            System.out.print("O Resultado é:>>>>>>>  ");
        }
        //Chama a função para Calculo
        switch (opcao){
            case 1:
                System.out.println(somarDoisNumeros(num1, num2));
                break;
            case 2:
                System.out.println(subtrairDoisNumeros(num1, num2));
                break;
            case 3:
                System.out.println(multiplicarDoisNumeros(num1, num2));
                break;
            case 4:
                System.out.println(dividirDoisNumeros(num1, num2));
                break;

            default:

                System.out.println("Opção Invalida");
                break;

        }
        //System.out.println("Passou Pelo Método main");

    }
    public static int somarDoisNumeros(int num1, int num2){
      //  System.out.println("Passou Pelo Método somarDoisNumeros");
        return num1 + num2;
    }
    public static int subtrairDoisNumeros(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicarDoisNumeros(int num1, int num2){
        return num1 * num2;
    }
    public static int dividirDoisNumeros(int num1, int num2){
        return num1 / num2;
    }

}
