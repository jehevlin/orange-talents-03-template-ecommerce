package br.com.zupacademy.jessica.mercadolivre.responses;

import br.com.zupacademy.jessica.mercadolivre.models.Usuario;

public class UsuarioResponse {

    private String login;

    public UsuarioResponse(Usuario usuario){
        this.login = usuario.getLogin();
    }

    public String getLogin(){ return login; }
}
