                             // DOUGLAS VIEIRA//
package vetores;

import java.util.Scanner;

public class CalculadoraIMC {
    
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura); // CALCULO PESO DIVIDIDO POR ALTURA VEZES ALTURA
    }
    
    public static void interpretarIMC(double imc) { // MAIOR OU MENOR QUE 
        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso.");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Seu peso está dentro da faixa considerada saudável.");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Você está com sobrepeso.");
        } else {
            System.out.println("Você está com obesidade.");
        }
    }
    
    public static void main(String[] args) { // METODO PRINCIPAL
        Scanner scanner = new Scanner(System.in);  // ESCANECAR
        
        System.out.print("Digite o seu nome: "); // A PESSOA DIGITA O NOME 
        String nome = scanner.nextLine(); 
        
        System.out.print("Digite o seu peso em quilogramas: "); // A PESSOA DIGITA O PESO
        double peso = scanner.nextDouble();
        
        System.out.print("Digite a sua altura em metros: ");  // A PESSOA DIGITA A ALTURA 
        double altura = scanner.nextDouble(); 
        
        double imc = calcularIMC(peso, altura);
        
        System.out.println("\n-+-+ Resultado -+-+"); // A MENSAGEM APARECE 
        System.out.println("Nome: " + nome);
        System.out.printf("IMC: %.2f\n", imc); 
        interpretarIMC(imc); 
    }
}

