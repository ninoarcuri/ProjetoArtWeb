
package br.uninove.model;


public class Cliente {
    private String nomeUsuario;
    private String sobrenomeUsuario;
    private String data_nasc;
    private String endereco;
    private String bairro;
    private String cep;
    private String telefone;
    private String celular;
    private String email;
    private ServicoContratado servicoContratado;

    public Cliente() 
    {    }

    public Cliente(String nomeUsuario, String sobrenomeUsuario, String data_nasc, String endereco, String bairro, String cep, String telefone, String celular, String email) {
        this.nomeUsuario = nomeUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
    }
    
    
    
    public Cliente(String nomeUsuario, String sobrenomeUsuario, String data_nasc, String endereco, String bairro, String cep, String telefone, String celular, String email, ServicoContratado servicoContratado) 
    {
        this.nomeUsuario = nomeUsuario;
        this.sobrenomeUsuario = sobrenomeUsuario;
        this.data_nasc = data_nasc;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.servicoContratado = servicoContratado;
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

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
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

    public ServicoContratado getServicoContratado() {
        return servicoContratado;
    }

    public void setServicoContratado(ServicoContratado servicoContratado) {
        this.servicoContratado = servicoContratado;
    }
    
    
    
}
