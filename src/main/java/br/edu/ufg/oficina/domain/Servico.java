package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "servico")
public class Servico {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    private String descricao;

    @DatabaseField
    private double valor;

    public Servico() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}