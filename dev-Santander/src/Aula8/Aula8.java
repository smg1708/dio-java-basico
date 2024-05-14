package Aula8;

public class Aula8 {
    public static void main(String[] args) {
        String nomeUm = "Samuel";
        String nomeDois = new String("Sousa");
        System.out.println(nomeUm.equals(nomeDois));
        
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        if(numero1 == numero2){ //true
            System.out.println("a nossa condicao é verdadeira");
        }
        System.err.println("numero um é igual a numero dois? " + simNao);
        simNao = numero1 != numero2;
        System.err.println("numero um é diferente do numero dois? " + simNao);
    }
}
