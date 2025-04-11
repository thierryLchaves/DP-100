// Desafios JavaScript na DIO têm funções "get" e "prints" acessíveis globalmente:
// - "get": lê UMA linha com dado(s) de entrada inputs do usuário; 
// - "print: imprime um texto de saída (outputs), pulando linha. 

//Lê os valores de Entrada:
const valorSalario = parseFloat(gets());
const valorBeneficio = parseFloat(gets());

//Calcula o imposto através da função "calcularImposto:
const valorImposto = calcularImposto(valorSalario);
//Calcula e imprime a saída (com 2 casas decimais):
const saida = valorSalario - valorImposto + valorBeneficio;
print(saida.toFixed(2));

//Função útil  para o calculo do imposto (baseado na aliqotas).
function calcularImposto(salario){
    let aliqota;
    if (salario>= 0 && salario <= 1100){
        aliqota = 0.05;
    } else if (salario >1100 && salario <=2500) {
        aliqota = 0.10;
    }else{
        aliqota = 0.15;
    }
    //TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%.
    return aliqota * salario;
}
