// Para ler e escrever dados em C#, utilizamos os seguintes métodos da classe Console:
// - Console.ReadLine: Lê UMA linha com dado(s) de Entrada (Inputs) do usuário; 
// - Console.WriteLine: Imprime um texto de saída (Output) e pulando uma linha. 

using System; 
public class Desafio {
    {
        public static Main()
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficio = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100)
        {
            //Atribuiu a aliquota de 5% mediante o salário:
            valorImposto = 0.005F * valorSalario;
        } 
        else if(valorSalario > 1100 && valorSalario < 2500){
            valorImposto = 0.10F * valorSalario;
        }
         else
        {
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficio;
        Console.WriteLine(saida.ToString("00.00"));
    }
}