
package Signos;

import javax.swing.JOptionPane;

import java.util.Calendar;
 
public class Variaveis {
    
    

    private static String numero;
    private static String mensagem;
    
    public static void main(String[] args) {
        int Dia,Mes,Ano;
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        String dataStr = JOptionPane.showInputDialog(null, "Digite seu dia de nacimento:");
        String dataStr = JOptionPane.showInputDialog(null, "Digite seu mes de nacimento:");
        String dataStr = JOptionPane.showInputDialog(null, "Digite seu ano de nacimento:");
        String numero = JOptionPane.showInputDialog(null, "escolha um numero da sorte de 1 a 12:");
        int num = Integer.parseInt(numero);
        String cor = JOptionPane.showInputDialog(null, "escolha um numero de 1 a 12 e receba sua cor da sorte:");
       String sexoInput = JOptionPane.showInputDialog(null, "Digite seu sexo: \n 1 - Feminino \n 2 - Masculino \n 3 - Outro");

       Calendar Hoje = Calendar.getInstance();
       Dia = Hoje.get(Calendar.DATE);
       Mes = Hoje.get(Calendar.MONTH)+1;
       Ano = Hoje.get(Calendar.YEAR);
        
       
       
        int idade = ((Ano*365+Mes*12+Dia)-(Ano*365+Mes*12+Dia))/365;
       
       
        if (nome.length() > 8) {
            String mensagem = "Seu nome é válido!";
} else {
    mensagem = "Legal se o seu nome fosse verdadeiro";
}

public class Pessoa {
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private int anoAtual;

    public Pessoa(int diaNascimento, int mesNascimento, int anoNascimento, int anoAtual) {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.anoAtual = anoAtual;
    }

    public boolean validarDiaNascimento() {
        return (diaNascimento >= 1 && diaNascimento <= 31);
    }

    public boolean validarMesNascimento() {
        return (mesNascimento >= 1 && mesNascimento <= 12);
    }

    public boolean validarAnoNascimento() {
        return (anoNascimento >= 1900 && anoNascimento <= anoAtual);
    }
} 
        
        
String sexo;
switch (sexoInput) {
    case "1":
        sexo = "Feminino";
        break;
    case "2":
        sexo = "Masculino";
        break;
    case "3":
        sexo = "Outro";
        break;
    default:
        sexo = "Indefinido";
        break;
}
String mensagem;

switch(cor) {
    case "1":
        mensagem = "Sua cor da sorte é Vermelho!";
        break;
    case "2":
        mensagem = "Sua cor da sorte é Laranja!";
        break;
    case "3":
        mensagem = "Sua cor da sorte é Amarelo!";
        break;
    case "4":
        mensagem = "Sua cor da sorte é Verde!";
        break;
    case "5":
        mensagem = "Sua cor da sorte é Azul!";
        break;
    case "6":
        mensagem = "Sua cor da sorte é Anil!";
        break;
    case "7":
        mensagem = "Sua cor da sorte é Violeta!";
        break;
    case "8":
        mensagem = "Sua cor da sorte é Rosa!";
        break;
    case "9":
        mensagem = "Sua cor da sorte é Marrom!";
        break;
    case "10":
        mensagem = "Sua cor da sorte é Cinza!";
        break;
    case "11":
        mensagem = "Sua cor da sorte é Branco!";
        break;
    case "12":
        mensagem = "Sua cor da sorte é Preto!";
        break;
    default:
        mensagem = "Número inválido! Escolha um número de 1 a 12.";
        break;
}

        String[] partesData = dataStr.split("/");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);
        String signo = getSigno(dia, mes);
        JOptionPane.showMessageDialog(null,  " seu signo é " + signo);
        JOptionPane.showMessageDialog(null, " seu numero da sorte é " + numero);
        JOptionPane.showMessageDialog(null, " seu nome é " + nome);
         JOptionPane.showMessageDialog(null, " seu dia de nacimento é " + dataStr ); 
         JOptionPane.showMessageDialog(null, " seu mes de nacimento é " + dataStr );
         JOptionPane.showMessageDialog(null, " seu ano de nacimento é " + dataStr );
          JOptionPane.showMessageDialog(null, " seu sexo é " + sexo);
          JOptionPane.showMessageDialog(null, " / " + mensagem);
          
         
    }

    public static String getSigno(int dia, int mes) {
        String signo = "";
        switch (mes) {
            case 1:
                if (dia <= 20) {
                    signo = "Capricórnio";
                } else {
                    signo = "Aquário";
                }
                break;
            case 2:
                if (dia <= 19) {
                    signo = "Aquário";
                } else {
                    signo = "Peixes";
                }
                break;
            case 3:
                if (dia <= 20) {
                    signo = "Peixes";
                } else {
                    signo = "Áries";
                }
                break;
            case 4:
                if (dia <= 20) {
                    signo = "Áries";
                } else {
                    signo = "Touro";
                }
                break;
            case 5:
                if (dia <= 20) {
                    signo = "Touro";
                } else {
                    signo = "Gêmeos";
                }
                break;
            case 6:
                if (dia <= 20) {
                    signo = "Gêmeos";
                } else {
                    signo = "Câncer";
                }
                break;
            case 7:
                if (dia <= 21) {
                    signo = "Câncer";
                } else {
                    signo = "Leão";
                }
                break;
            case 8:
                if (dia <= 22) {
                    signo = "Leão";
                } else {
                    signo = "Virgem";
                }
                break;
            case 9:
                if (dia <= 22) {
                    signo = "Virgem";
                } else {
                    signo = "Libra";
                }
                break;
            case 10:
                if (dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpião";
                }
                break;
            case 11:
                if (dia <= 21) {
                    signo = "Escorpião";
                } else {
                    signo = "Sagitário";
                }
                break;
            case 12:
                if (dia <= 21) {
                    signo = "Sagitário";
                } else {
                    signo = "Capricórnio";
                }
                break;
                
            default:
                signo = "inválido";
                break;
        }
        return signo;
    }

    

        
          
            
            
        } 
    

    

