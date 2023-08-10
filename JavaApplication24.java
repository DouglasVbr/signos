/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;

import java.util.Scanner;

        
      import java.util.Scanner;

public class JavaApplication24 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double comissaoJr, comissaoPleno, comissaoSenior;
    double lucroCrianca, lucroHomem, lucroMulher, lucroTotal;

    System.out.print("Digite o número de cortes para crianças: ");
    int cortesCrianca = input.nextInt();

    System.out.print("Digite o número de cortes para homens: ");
    int cortesHomem = input.nextInt();

    System.out.print("Digite o número de cortes para mulheres: ");
    int cortesMulher = input.nextInt();

    comissaoJr = cortesCrianca * 0.03 + cortesHomem * 0.03 + cortesMulher * 0.03;
    comissaoPleno = cortesCrianca * 0.06 + cortesHomem * 0.06 + cortesMulher * 0.06;
    comissaoSenior = cortesCrianca * 0.1 + cortesHomem * 0.1 + cortesMulher * 0.1;

    lucroCrianca = cortesCrianca * 15 - comissaoJr - comissaoPleno - comissaoSenior;
    lucroHomem = cortesHomem * 38 - comissaoJr - comissaoPleno - comissaoSenior;
    lucroMulher = cortesMulher * 70 - comissaoJr - comissaoPleno - comissaoSenior;
    lucroTotal = lucroCrianca + lucroHomem + lucroMulher;

    System.out.println("Comissão do cabeleireiro júnior: R$" + comissaoJr);
    System.out.println("Comissão do cabeleireiro pleno: R$" + comissaoPleno);
    System.out.println("Comissão do cabeleireiro sênior: R$" + comissaoSenior);
    System.out.println("Lucro do salão para cortes de crianças: R$" + lucroCrianca);
      String lucro = null;
    System.out.println("Lucro do salão para cortes de homens: R$" + lucro); 
  
        
        
    
    }
    
} 
