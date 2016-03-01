package br.com.agecomnet.gestoremobile.br.com.agecomnet.gestoremobile.modelo;

/**
 * Created by Michel Soares on 29/02/2016.
 */
public class Usuario {

    private Long id;
    private String nome;
    private String senha;
    private String email;
    private String privilegio;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public String toString(){
        return "nada por enquanto";
    }
}
