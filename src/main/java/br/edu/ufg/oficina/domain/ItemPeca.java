package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "item_peca")
public class ItemPeca {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    private int quantidade;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ordem_id")
    private OrdemServico ordemServico;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "peca_id")
    private Peca peca;

    public ItemPeca() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public OrdemServico getOrdemServico() { return ordemServico; }
    public void setOrdemServico(OrdemServico ordemServico) { this.ordemServico = ordemServico; }
    public Peca getPeca() { return peca; }
    public void setPeca(Peca peca) { this.peca = peca; }
}