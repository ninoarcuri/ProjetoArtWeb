
package br.uninove.model;


class ServicoContratado {
   private int idServ;
   private String nome_servicoC;
   private String descricaoC;
   private String tipoC;
   private int valorC;

    public ServicoContratado() {
    }

    public ServicoContratado(int idServ, String nome_servicoC, String descricaoC, String tipoC, int valorC) {
        this.idServ = idServ;
        this.nome_servicoC = nome_servicoC;
        this.descricaoC = descricaoC;
        this.tipoC = tipoC;
        this.valorC = valorC;
    }

    public int getIdServ() {
        return idServ;
    }

    public void setIdServ(int idServ) {
        this.idServ = idServ;
    }

    public String getNome_servicoC() {
        return nome_servicoC;
    }

    public void setNome_servicoC(String nome_servicoC) {
        this.nome_servicoC = nome_servicoC;
    }

    public String getDescricaoC() {
        return descricaoC;
    }

    public void setDescricaoC(String descricaoC) {
        this.descricaoC = descricaoC;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    public int getValorC() {
        return valorC;
    }

    public void setValorC(int valorC) {
        this.valorC = valorC;
    }
   
   
   
}
