
import java.time.LocalDate;
import java.util.Scanner;
import java.util.Calendar;

public class AdivinhaDadosUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir o nome, sexo e data de nascimento do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu sexo (m ou f): ");
        String sexoStr = scanner.nextLine();
        char sexo = sexoStr.charAt(0);

        System.out.print("Digite o dia do seu nascimento: ");
        int diaNascimento = scanner.nextInt();

        System.out.print("Digite o mês do seu nascimento (1-12): ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite o ano do seu nascimento: ");
        int anoNascimento = scanner.nextInt();
        scanner.nextLine();

        // Calcular a idade exata do usuário
        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.now();
        int idade = dataAtual.getYear() - dataNascimento.getYear();
        if (dataAtual.getMonthValue() < dataNascimento.getMonthValue() || (dataAtual.getMonthValue() == dataNascimento.getMonthValue() && dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth())) {
            idade--;
        }

        // Adivinhar o signo do zodíaco do usuário
        String[] signos = {"Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"};
        int[] diasFinais = {19, 18, 20, 19, 20, 20, 21, 22, 22, 22, 21, 21};
        String signo = signos[mesNascimento - 1];
        if (diaNascimento > diasFinais[mesNascimento - 1]) {
            signo = signos[mesNascimento];
        }

        // Adivinhar a cor da sorte do usuário
        String[] coresDaSorte = {"vermelho", "azul", "amarelo", "verde", "roxo", "laranja"};
        int indiceCor = nome.length() % coresDaSorte.length;
        String corDaSorte = coresDaSorte[indiceCor];

        // Adivinhar o número da sorte do usuário
        int numSorte = nome.length() * idade % 100;

        // Imprimir a mensagem final com os dados adivinhados
        if (sexo == 'm') {
            System.out.println("Sr " + nome + ", nascido no dia " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo de " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numSorte + " e sua cor da sorte é: " + corDaSorte + ".");
        } else if (sexo == 'f') {
            System.out.println("Sra " + nome + ", nascida no dia " + diaNascimento + "/" + mesNascimento + "/" + anoNascimento + ", é do signo de " + signo + ". Você tem " + idade + " anos. Seu número da sorte é " + numSorte + " e sua cor da sorte é: " + corDaSorte +".");
        }
    }
}
