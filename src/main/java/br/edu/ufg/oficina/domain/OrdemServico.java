package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;
import java.util.Date;

@DatabaseTable(tableName = "ordem_servico")
public class OrdemServico {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField(columnName = "data_emissao", dataType = DataType.DATE)
    private Date dataEmissao;

    @DatabaseField(columnName = "valor_total")
    private double valorTotal;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "veiculo_id")
    private Veiculo veiculo;

    public OrdemServico() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public Date getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(Date dataEmissao) { this.dataEmissao = dataEmissao; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }
}