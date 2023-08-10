package com.mycompane.ProjetoGuru;

import java.util.Calendar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ProjetoGuru {

    public static void main(String[] args) {

        String nome, sexo, signo, corSorte;

        int dia, diaA, mes, mesA, ano, anoA, numero, cor, idade;
        Scanner ler = new Scanner(System.in);

        Calendar hoje = Calendar.getInstance();
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH) + 1;
        anoA = hoje.get(Calendar.YEAR);

        System.out.println("Digite o seu nome:");
        nome = ler.nextLine();
        System.out.println("Digite (1) para Feminino e (2) para Masculino:");
        sexo = ler.nextLine();
        System.out.println("Ano de nascimento:");
        ano = ler.nextInt();

        if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0) && (ano >= 1970) && (ano <= anoA)) {
            System.out.println("Mês de nascimento:");
            mes = ler.nextInt();
            if (mes == 01 || mes == 03 || mes == 05 || mes == 07) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 31 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;

                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes"; 
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }
                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);

                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }

                } else {
                    System.out.println("Dia inválido");
                }
            } else if (mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 31 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes";
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }

                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }

                } else {
                    System.out.println("Dia inválido");
                }
            } else if (mes == 02) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 29 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes";
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }
                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }
                } else {
                    System.out.println("Dia inválido");
                }
            } else if (mes % 2 == 0 && mes != 2 && mes != 8) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 30 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes";
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }
                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }
                } else {
                    System.out.println("Dia inválido");
                }
            } else {
                System.out.println("Mês inválido");

            }

        } else if (ano >= 1970 && ano <= anoA) {
            System.out.println("Mês de nascimento:");
            mes = ler.nextInt();
            if (mes == 01 || mes == 03 || mes == 05 || mes == 07) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 31 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes";
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }
                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }
                } else {
                    System.out.println("Dia inválido");
                }
            } else if (mes == 8 || mes == 10 || mes == 12) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 31 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes";
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }
                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }
                } else {
                    System.out.println("Dia inválido");
                }
            } else if (mes == 02) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 29 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes";
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }
                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }
                } else {
                    System.out.println("Dia inválido");
                }
            } else if (mes % 2 == 0 && mes != 2 && mes != 8) {
                System.out.println("Dia do nascimento:");
                dia = ler.nextInt();
                if (dia <= 30 && dia > 0) {
                    idade = ((anoA * 365 + mesA * 12 + diaA) - (ano * 365 + mes * 12 + dia)) / 365;
                    switch (mes) {
                        case 1 -> {
                            if (dia <= 20) {
                                signo = "Capricornio";
                            } else {
                                signo = "Aquario";
                            }
                        }
                        case 2 -> {
                            if (dia <= 19) {
                                signo = "Aquario";
                            } else {
                                signo = "Peixes";
                            }
                        }
                        case 3 -> {
                            if (dia <= 20) {
                                signo = "Peixes";
                            } else {
                                signo = "aries";
                            }
                        }
                        case 4 -> {
                            if (dia <= 20) {
                                signo = "aries";
                            } else {
                                signo = "Touro";
                            }
                        }
                        case 5 -> {
                            if (dia <= 20) {
                                signo = "Touro";
                            } else {
                                signo = "Gemeos";
                            }
                        }
                        case 6 -> {
                            if (dia <= 20) {
                                signo = "Gemeos";
                            } else {
                                signo = "Cancer";
                            }
                        }
                        case 7 -> {
                            if (dia <= 21) {
                                signo = "Cancer";
                            } else {
                                signo = "Leão";
                            }
                        }
                        case 8 -> {
                            if (dia <= 22) {
                                signo = "Leão";
                            } else {
                                signo = "Virgem";
                            }
                        }
                        case 9 -> {
                            if (dia <= 22) {
                                signo = "Virgem";
                            } else {
                                signo = "Libra";
                            }
                        }
                        case 10 -> {
                            if (dia <= 22) {
                                signo = "Libra";
                            } else {
                                signo = "Escorpião";
                            }
                        }
                        case 11 -> {
                            if (dia <= 21) {
                                signo = "Escorpião";
                            } else {
                                signo = "Sagitario";
                            }
                        }
                        case 12 -> {
                            if (dia <= 21) {
                                signo = "Sagitario";
                            } else {
                                signo = "Capricornio";
                            }
                        }

                        default ->
                            signo = "invalido";
                    }
                    numero = (int) 1 + (int) (Math.random() * 10);
                    cor = (int) 1 + (int) (Math.random() * 12);
                    switch (cor) {
                        case 1 -> {
                            corSorte = "Azul";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 2 -> {
                            corSorte = "Vermelho";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }
                        case 3 -> {
                            corSorte = "Verde";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 4 -> {
                            corSorte = "Amarelo";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 5 -> {
                            corSorte = "Roxo";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 6 -> {
                            corSorte = "Rosa";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 7 -> {
                            corSorte = "Lilás";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                            break;
                        }

                        case 8 -> {
                            corSorte = "Marrom";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }

                        case 9 -> {
                            corSorte = "Laranja";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        case 10 -> {
                            corSorte = "Branco";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;

                        }
                        case 11 -> {
                            corSorte = "Preto";

                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }

                        }
                        case 12 -> {
                            corSorte = "Cinza";
                            if (sexo.equals("2")) {
                                System.out.println("Sr." + nome + ", nascido no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            } else if (sexo.equals("1")) {
                                System.out.println("Sra." + nome + ", nascida no dia " + dia + "-" + mes + "-" + ano + " é do signo de " + signo + " - você tem " + idade + " anos - seu nº da sorte é " + numero + " e sua cor: " + corSorte);
                            }
                            break;
                        }
                        default -> {
                        }
                    }
                } else {
                    System.out.println("Dia inválido");
                }
            } else {
                System.out.println("Mês inválido");

            }

        } else {
            System.out.println("Ano inválido");
        }
        
        
