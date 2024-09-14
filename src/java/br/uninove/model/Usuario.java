
package br.uninove.model;

import java.util.Date;

public class Usuario {
    
    private int idUser;
    private String login;
    private String senha;
    public Cliente cliente;
    private boolean adm;
   

    public Usuario() {}

    public Usuario(int idUser, String login, String senha, Cliente cliente, boolean adm) {
        this.idUser = idUser;
        this.login = login;
        this.senha = senha;
        this.cliente = cliente;
        this.adm = adm;
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }
    
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    
    
}