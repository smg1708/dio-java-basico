package Aula1;
import javax.xml.transform.stream.StreamResult;

public class Aula_1 {

public static void main (String [] args) {
  
    String primeiroNome = "Samuel";
    String segundoNome= "Sousa";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}