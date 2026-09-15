package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "item_servico")
public class ItemServico {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    private int quantidade;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ordem_id")
    private OrdemServico ordemServico;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "servico_id")
    private Servico servico;

    public ItemServico() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public OrdemServico getOrdemServico() { return ordemServico; }
    public void setOrdemServico(OrdemServico ordemServico) { this.ordemServico = ordemServico; }
    public Servico getServico() { return servico; }
    public void setServico(Servico servico) { this.servico = servico; }
}