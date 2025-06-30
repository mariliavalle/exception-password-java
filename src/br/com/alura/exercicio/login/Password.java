package br.com.alura.exercicio.login;

import br.com.alura.exercicio.excecao.SenhaInvalidaException;

public class Password {
    private String password;

    public Password(String password) {
        if(password.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres");
        }
        this.password = password;
    }
}
