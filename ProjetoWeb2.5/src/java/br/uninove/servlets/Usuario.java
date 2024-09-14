
package br.uninove.servlets;

import java.util.Date;


public class Usuario{

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
public Usuario(String nome,String sobrenome,Date dataNascimento,String endereco,String bairro,String cep,String telefone,String celular,String email,String usuario,String senha) {

this.nome = nome;
this.sobrenome = sobrenome;
this.dataNascimento = dataNascimento;
this.endereco = endereco;
this.bairro = bairro;
this.cep = cep;
this.telefone = telefone;
this.celular = celular;
this.email = email;
this.login = login;
this.senha = senha;

}
private Integer idusuario;
private String nome;
private String sobrenome;
private Date dataNascimento;
private String endereco;
private String bairro;
private String cep;
private String telefone;
private String celular;
private String email;
private String login;
private String senha;

    Usuario(String nome, String sobrenome, String idade, String endereco, String bairro, String cep, String telefone, String celular, String email, Usuario usuario, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}



 
        