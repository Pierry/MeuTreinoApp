package br.com.pierrydev.meutreino.models;

import br.com.pierrydev.meutreino.utilities.DataUtil;

public class Treino {

    private int treinoId;
    private int tipo;
    private String titulo;
    private String descricao;
    private String tipoUm;
    private String tipoDois;
    private boolean kg;
    private String dataCriacao;
    private boolean ativo;

    public Treino(int tipo, String titulo,
                  String tipoUm, String tipoDois, boolean kg){
        this.tipo = tipo;
        this.titulo = titulo;
        this.tipoUm = tipoUm;
        this.tipoDois = tipoDois;
        this.kg = kg;
        this.dataCriacao = DataUtil.obterDataAtual();
        this.ativo = true;
    }

    public Treino(int tipo, String titulo,
                  String tipoUm, String tipoDois, boolean kg,
                  String dataCriacao, boolean ativo){
        this.tipo = tipo;
        this.titulo = titulo;
        this.tipoUm = tipoUm;
        this.tipoDois = tipoDois;
        this.kg = kg;
        this.dataCriacao = dataCriacao;
        this.ativo = ativo;
    }

    public void validar(){

    }

    public void alterarDados(String titulo, String descricao){
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public void alterarTipos(String tipoUm, String tipoDois){
        this.tipoUm = tipoUm;
        this.tipoDois = tipoDois;
    }

    public void ativarDesativar(){
        if (ativo){ ativo = false; }
        if (!ativo){ ativo = true; }
    }

    public int getTreinoId() {
        return treinoId;
    }

    public void setTreinoId(int treinoId) {
        this.treinoId = treinoId;
    }

    public int getTipo() {
        return tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipoUm() {
        return tipoUm;
    }

    public String getTipoDois() {
        return tipoDois;
    }

    public boolean isKg() {
        return kg;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

}

