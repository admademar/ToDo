package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestaCalc {
    @Test
    public void testarSomarDoisNumeros() {
        // 1 - Preparar/Configurar - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        // 2 - Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("************************************");
        System.out.println("* Resultado do Calculo Somar       *");
        System.out.println("* O Resultado Esperado e:  "+resultadoEsperado+"      *");
        System.out.println("* O Resultado Atual foi:  "+resultadoAtual+"       *");
        assertEquals(resultadoEsperado, resultadoAtual);
        System.out.println("************************************");
    }
    @Test
    public void testarSubtrairDoisNumeros(){
        // 1 - Preparar/Configurar - Given
        int num1 = 25;
        int num2 = 10;
        int resultadoEsperado = 15;
        // 2 - Executar -  When
        int resultadoAtual = Calc.subtrairDoisNumeros(num1, num2);
        // 3 - Validar - Then
        System.out.println("************************************");
        System.out.println("* Resultado do Calculo Subtrair    *");
        System.out.println("* O Resultado Esperado>>  "+resultadoEsperado+"       *");
        System.out.println("* O Resultado Atual>>  "+resultadoAtual+"          *");

        assertEquals(resultadoEsperado, resultadoAtual);
        System.out.println("************************************");
    }
    @Test
    public void testarMultiplicarDoisNumeros(){
        // 1 - Preparar/Configurar - Given
        int num1 = 5;
        int num2 = 5;
        int resultadoEsperado = 25;

        // 2 - Executar - When
        int resultadoAtual = Calc.multiplicarDoisNumeros(num1, num2);

        // 3 - Validar - Then
        System.out.println("************************************");
        System.out.println("* Resultado do Calculo Multiplicar *");
        System.out.println("* O Resultado Esperado>>  "+resultadoEsperado+"       *");
        System.out.println("* O Resultado Atual   >>  "+resultadoAtual+"       *");
        System.out.println("************************************");
        assertEquals(resultadoEsperado, resultadoAtual);
    }
    @Test
    public void testarDividirDoisNumeros() {
            // 1 - Preparar/Configurar - Given

         int num1 = 25;
         int num2 =  5;
         int  resultadoEsperado = 5;

            // 2 - Executar - When
            int resultadoAtual = Calc.dividirDoisNumeros(num1, num2);

            // 3 - Validar - Then
            System.out.println("************************************");
            System.out.println("* Resultado do Calculo Dividir     *");
            System.out.println("* Resultado Esperado>>  " + resultadoEsperado + "          *");
            System.out.println("* Resultado Atual>>     " + resultadoAtual + "          *");
            System.out.println("************************************");
            assertEquals(resultadoAtual, resultadoEsperado);
        }

    }

