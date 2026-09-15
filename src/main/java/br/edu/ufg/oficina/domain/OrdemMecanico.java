package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "ordem_mecanico")
public class OrdemMecanico {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ordem_id")
    private OrdemServico ordemServico;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "mecanico_id")
    private Mecanico mecanico;

    public OrdemMecanico() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public OrdemServico getOrdemServico() { return ordemServico; }
    public void setOrdemServico(OrdemServico ordemServico) { this.ordemServico = ordemServico; }
    public Mecanico getMecanico() { return mecanico; }
    public void setMecanico(Mecanico mecanico) { this.mecanico = mecanico; }
}