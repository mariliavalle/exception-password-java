import br.com.alura.exercicio.excecao.SenhaInvalidaException;
import br.com.alura.exercicio.login.Password;
import br.com.alura.exercicio.login.Username;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Cadastro");
            System.out.println("********************");

            System.out.println("Username:");
            Username username = new Username(scanner.next());

            System.out.println("Senha");
            Password password = new Password(scanner.next());

            System.out.println("Cadastro realizado com sucesso!");

        } catch (SenhaInvalidaException e){
            System.out.println(e.getMessage());
        }




    }
}