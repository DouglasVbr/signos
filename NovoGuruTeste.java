
package novoguruteste;

import javax.swing.JOptionPane;

import java.util.Calendar;


/**
 *
 * @author Douglas
 */
public class NovoGuruTeste {
    
     private static String numero;
    private static String mensagem;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] NovoGuruTeste) {
        // TODO code application logic here
     int Dia,Mes,Ano;
     String dataStr;
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        String Dia = JOptionPane.showInputDialog(null, "Digite seu Dia de nacimento:");
        String Mes = JOptionPane.showInputDialog(null, "Digite seu Mes de nacimento:");
        String Ano = JOptionPane.showInputDialog(null, "Digite seu Ano de nacimento:");
        String numero = JOptionPane.showInputDialog(null, "escolha um numero da sorte de 1 a 12:");
        int num = Integer.parseInt(numero);
        String cor = JOptionPane.showInputDialog(null, "escolha um numero de 1 a 12 e receba sua cor da sorte:");
       String sexoInput = JOptionPane.showInputDialog(null, "Digite seu sexo: \n 1 - Feminino \n 2 - Masculino \n 3 - Outro");
       
       Dia = Integer.parseInt(DiaStr);
        Mes = Integer.parseInt(MesStr);
        Ano = Integer.parseInt(AnoStr);
        dataStr = DiaStr + "/" + MesStr + "/" + AnoStr;
        
        
        Calendar hoje = Calendar.getInstance();
        int DiaAtual = hoje.get(Calendar.DATE);
        int MesAtual = hoje.get(Calendar.MONTH) + 1;
        int AnoAtual = hoje.get(Calendar.YEAR);
        
        int idade = (AnoAtual - Ano);
        
       
    
    
     if (nome.length() > 8) {
            String mensagem = "Seu nome é válido!";
                        
            } else {
    mensagem = "Legal se o seu nome fosse verdadeiro";
}

public class Pessoa {
    private int Dia;
    private int Mes;
    private int Ano;
    private int AnoAtual;

    public Pessoa(int Dia, int Mes, int Ano, int AnoAtual) {
        this.Dia = Dia;
        this.Mes = Mes;
        this.Ano = Ano;
        this.AnoAtual = AnoAtual;
    }

    public boolean validarDia() {
        return (Dia >= 1 && Dia <= 31);
    }

    public boolean validarMes() {
        return (Mes >= 1 && Mes <= 12);
    }

    public boolean validarAno() {
        return (Ano >= 1900 && Ano <= AnoAtual);
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
        int Dia = Integer.parseInt(partesData[0]);
        int Mes = Integer.parseInt(partesData[1]);
        int Ano = Integer.parseInt(partesData[2]);
        String signo = getSigno(Dia, Mes, Ano);
        JOptionPane.showMessageDialog(null,  " seu signo é " + signo);
        JOptionPane.showMessageDialog(null, " seu numero da sorte é " + numero);
        JOptionPane.showMessageDialog(null, " seu nome é " + nome);
         JOptionPane.showMessageDialog(null, " sua data de nacimento é " + dataStr ); 
          JOptionPane.showMessageDialog(null, " seu sexo é " + sexo);
          JOptionPane.showMessageDialog(null, " / " + mensagem);
          
         
    }

    public static String getSigno(int Dia, int Mes) {
        String signo = "";
        switch (Mes) {
            case 1:
                if (Dia <= 20) {
                    signo = "Capricórnio";
                } else {
                    signo = "Aquário";
                }
                break;
            case 2:
                if (Dia <= 19) {
                    signo = "Aquário";
                } else {
                    signo = "Peixes";
                }
                break;
            case 3:
                if (Dia <= 20) {
                    signo = "Peixes";
                } else {
                    signo = "Áries";
                }
                break;
            case 4:
                if (Dia <= 20) {
                    signo = "Áries";
                } else {
                    signo = "Touro";
                }
                break;
            case 5:
                if (Dia <= 20) {
                    signo = "Touro";
                } else {
                    signo = "Gêmeos";
                }
                break;
            case 6:
                if (Dia <= 20) {
                    signo = "Gêmeos";
                } else {
                    signo = "Câncer";
                }
                break;
            case 7:
                if (Dia <= 21) {
                    signo = "Câncer";
                } else {
                    signo = "Leão";
                }
                break;
            case 8:
                if (Dia <= 22) {
                    signo = "Leão";
                } else {
                    signo = "Virgem";
                }
                break;
            case 9:
                if (Dia <= 22) {
                    signo = "Virgem";
                } else {
                    signo = "Libra";
                }
                break;
            case 10:
                if (Dia <= 22) {
                    signo = "Libra";
                } else {
                    signo = "Escorpião";
                }
                break;
            case 11:
                if (Dia <= 21) {
                    signo = "Escorpião";
                } else {
                    signo = "Sagitário";
                }
                break;
            case 12:
                if (Dia <= 21) {
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
    
    
    }
    
} 
