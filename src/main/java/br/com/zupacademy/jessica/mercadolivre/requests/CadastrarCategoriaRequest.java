package br.com.zupacademy.jessica.mercadolivre.requests;

import br.com.zupacademy.jessica.mercadolivre.models.Categoria;
import br.com.zupacademy.jessica.mercadolivre.requests.validators.MustBeUnique;

import javax.validation.constraints.NotBlank;

public class CadastrarCategoriaRequest {

    @NotBlank
    @MustBeUnique(domainClass = Categoria.class, fieldName = "nome", message = "Categoria já cadastrada")
    private String nome;
    private Categoria categoriaMae;

    public Categoria toModel() {
        return new Categoria(nome, categoriaMae);
    }

    public String getNome() {
        return nome;
    }

    public Categoria getCategoriaMae() {
        return categoriaMae;
    }
}
