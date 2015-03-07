package domain;

public class Treino {
    private int treinoId;
    private String titulo;
    private String dataCricao;
    private boolean ativo;

    private Item item;

    public Treino(String titulo, String dataCricao, boolean ativo, Item item) {
        this.titulo = titulo;
        this.dataCricao = dataCricao;
        this.ativo = ativo;
        this.item = item;
    }

    public Treino(int treinoId, String titulo, String dataCricao, boolean ativo, Item item) {
        this.treinoId = treinoId;
        this.titulo = titulo;
        this.dataCricao = dataCricao;
        this.ativo = ativo;
        this.item = item;
    }

    public int getTreinoId() {
        return treinoId;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDataCricao() {
        return dataCricao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public Item getItem() {
        return item;
    }

    @Override
    public String toString() {
        return titulo;
    }
}
