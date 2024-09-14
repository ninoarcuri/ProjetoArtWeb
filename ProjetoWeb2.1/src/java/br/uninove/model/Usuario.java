
package br.uninove.model;

import java.util.Date;

public class Usuario {
    
    private int idUser;
    private String nomeUsuario;
    private String sobrenomeUsuario;
    private Date data_nasc;
    private String endereco;
    private String bairro;
    private String cep;
    private String telefone;
    private String celular;
    private String email;
    private String usuario;
    private String senha;
    private boolean adm;
    private ServicoContratado servicoContratado;
    
    public Usuario() {}

    public Usuario(int idUser, String nomeUsuario, String sobrenomeUsuario, Date data_nasc, String endereco, String bairro, String cep, String telefone, String celular, String email, String usuario, String senha, boolean adm, ServicoContratado servicoContratado) {
        this.idUser = idUser;
        this.nomeUsuario = nomeUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.usuario = usuario;
        this.senha = senha;
        this.adm = adm;
        this.servicoContratado = servicoContratado;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSobrenomeUsuario() {
        return sobrenomeUsuario;
    }

    public void setSobrenomeUsuario(String sobrenomeUsuario) {
        this.sobrenomeUsuario = sobrenomeUsuario;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }

    public ServicoContratado getServicoContratado() {
        return servicoContratado;
    }

    public void setServicoContratado(ServicoContratado servicoContratado) {
        this.servicoContratado = servicoContratado;
    }
    
    
    
}
