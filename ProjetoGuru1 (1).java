
import javax.swing.JOptionPane;
import java.util.Calendar;

public class ProjetoGuru1 {

    public static void main(String[] args) {
        String nome, sexo = null, dataStr, signo, corSorte;
        int dia, diaA, mes, mesA, ano, anoA, num, numero, cor, idade;
        Calendar hoje = Calendar.getInstance();
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH) + 1;
        anoA = hoje.get(Calendar.YEAR);
        nome = JOptionPane.showInputDialog(null, "Digite seu nome:");
        String sexoInput = JOptionPane.showInputDialog(null, "Digite seu sexo: \n 1 - Feminino \n 2 - Masculino ");
        dataStr = JOptionPane.showInputDialog(null, "Digite seu dia de nacimento:");
        dataStr = JOptionPane.showInputDialog(null, "Digite seu mes de nacimento:");
        dataStr = JOptionPane.showInputDialog(null, "Digite seu ano de nacimento:");
          JOptionPane.showInputDialog(null, "Digite seu numero da sorte:");
        String[] partesData = dataStr.split("/");
        dia = Integer.parseInt(partesData[0]);
        mes = Integer.parseInt(partesData[1]);
        ano = Integer.parseInt(partesData[2]);
        idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
       
        numero = (int) 1 + (int) (Math.random() * 10);
        cor = (int) 1 + (int) (Math.random() * 12);
        signo = getSigno(dia, mes, ano);
        if (cor == 1) {
            corSorte = "Azul";
            if (ano <= 1970 || ano >= 2023) {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
                 int sexo = Integer.parseInt(input);
                 if (sexo == 1) {
                     
                 }
            } else {
                {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + (sexo.equals("masculino"))"-" +String nome = mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);} else if (sexo.equals("1")) {JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + (sexo.equals("feminino")) "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
            }

            }
        } else if (cor == 2) {
            corSorte = "Vermelho"; 
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2 == masculino")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1 == feminino")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 3) {
            corSorte = "Verde";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 4) {
            corSorte = "Amarelo";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 5) {
            corSorte = "Roxo";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 6) {
            corSorte = "Rosa";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 7) {
            corSorte = "Lilás";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 8) {
            corSorte = "Marrom";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 9) {
            corSorte = "Laranja";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 10) {
            corSorte = "Branco";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 11) {
            corSorte = "Preto";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        } else if (cor == 12) {
            corSorte = "Cinza";
            if (ano >= 1970 && ano <= 2023) {
                if (sexo.equals("2")) {
                    JOptionPane.showMessageDialog(null, "Sr." + nome + ", nascido no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                } else if (sexo.equals("1")) {
                    JOptionPane.showMessageDialog(null, "Sra." + nome + ", nascida no dia " + diaA + "-" + mesA + "-" + anoA + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Data de nascimento inválida, avaliação recusada");
            }
        }

    }

    public static String getSigno(int dia, int mes, int ano) {
        String signo = "";
        switch (mes) {
            case 1:
                if (dia <= 20) {
                    signo = "Capricornio";
                } else {
                    signo = "Aquario";
                }
                break;
            case 2:
                if (dia <= 19) {
                    signo = "Aquario";
                } else {
                    signo = "Peixes";
                }
                break;
            case 3:
                if (dia <= 20) {
                    signo = "Peixes";
                } else {
                    signo = "aries";
                }
                break;
            case 4:
                if (dia <= 20) {
                    signo = "aries";
                } else {
                    signo = "Touro";
                }
                break;
            case 5:
                if (dia <= 20) { 
                    signo = "Touro";
                } else {
                    signo = "Gemeos";
                }
                break;
            case 6:
                if (dia <= 20) {
                    signo = "Gemeos";
                } else {
                    signo = "Cancer";
                }
                break;
            case 7:
                if (dia <= 21) {
                    signo = "Cancer";
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
                    signo = "Sagitario";
                }
                break;
            case 12:
                if (dia <= 21) {
                    signo = "Sagitario";
                } else {
                    signo = "Capricornio";
                }
                break;

            default:
                signo = "invalido";
                break;
        }
        return signo;
    }

    public static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        limparTela();
        System.out.println("Tela limpa!");
    }

}
