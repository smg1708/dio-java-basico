package Aula14;

import java.util.Locale;
import java.util.Scanner;

public class Contabanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nome = "Karoline de Andrede";
        String banco = "Santander";
        int numeroAgencia = 1021;
        String saldo = "1.674.500";
        System.out.println("Por favor, digite o número da Agência: ");
        int numeroAgenciaInserido = scanner.nextInt();
        if (numeroAgenciaInserido == numeroAgencia) {
            System.out.println("Número da Agência correto, entrando!");
            System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + banco + ", conta " + numeroAgencia + " e seu saldo de R$ " + saldo + " já está disponível para saque.");
        } else {
            System.out.println("Numero da Agência incorreto, bloqueando acesso!");
        } 
        scanner.close();
        
        
    }
}
    //Todo:Conhecer e importar a classe Scanner
    //Exibir as mensagens para o nosso usuario
    //Obter pela scanner os valores digitados no terminal
    //Exibir a mensagem conta criado


