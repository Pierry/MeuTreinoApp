package domain;

public class Item {

    private int itemId;
    private String descricao;

    public Item(int itemId, String descricao) {
        this.itemId = itemId;
        this.descricao = descricao;
    }

    public Item(String descricao) {
        this.descricao = descricao;
    }

    public int getItemId() {
        return itemId;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
