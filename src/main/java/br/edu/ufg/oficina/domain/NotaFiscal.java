package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;
import java.util.Date;

@DatabaseTable(tableName = "nota_fiscal")
public class NotaFiscal {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    private String numero;

    @DatabaseField(columnName = "chave_acesso")
    private String chaveAcesso;

    @DatabaseField(columnName = "data_emissao", dataType = DataType.DATE)
    private Date dataEmissao;

    @DatabaseField(columnName = "valor_imposto")
    private double valorImposto;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "ordem_id")
    private OrdemServico ordemServico;

    public NotaFiscal() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getChaveAcesso() { return chaveAcesso; }
    public void setChaveAcesso(String chaveAcesso) { this.chaveAcesso = chaveAcesso; }
    public Date getDataEmissao() { return dataEmissao; }
    public void setDataEmissao(Date dataEmissao) { this.dataEmissao = dataEmissao; }
    public double getValorImposto() { return valorImposto; }
    public void setValorImposto(double valorImposto) { this.valorImposto = valorImposto; }
    public OrdemServico getOrdemServico() { return ordemServico; }
    public void setOrdemServico(OrdemServico ordemServico) { this.ordemServico = ordemServico; }
}