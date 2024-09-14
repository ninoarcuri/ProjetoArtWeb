
package br.uninove.model;

public class Servico {
   private int idServ;
   private String nome_servico;
   private String descricao;
   private String tipo;
   private double valor;

    public Servico() {
    }

    public Servico(int idServ, String nome_servico, String descricao, String tipo, double valor) {
        this.idServ = idServ;
        this.nome_servico = nome_servico;
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getIdServ() {
        return idServ;
    }

    public void setIdServ(int idServ) {
        this.idServ = idServ;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
   
   
}

