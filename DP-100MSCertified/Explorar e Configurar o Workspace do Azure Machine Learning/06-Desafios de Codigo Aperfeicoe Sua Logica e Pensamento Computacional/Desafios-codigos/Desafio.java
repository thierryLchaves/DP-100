// Para ler e escrever dados em Java, aqui na Dio Padronizamos da seguinte forma:
// - new Scanner(System.in): cria um lçeitos de entradas, com étodos úteis com prefixo "next";
// - System.out.println: imprime um texto de saída (Output) e pulando uma linha. 

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficio = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribuiu a aliquota de 5% mediante o salário;
            valorImposto = 0.05F * valorSalario;
        }else if (valorSalario > 1100 && valorSalario < 2500){
            valorImposto = 0.10F *  valorSalario;
        }else {
            valorImposto = 0.15F * valorSalario;
        }

        // Calcula e imprime a saída (com 2 casas decimais):>
        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));
    }
}
