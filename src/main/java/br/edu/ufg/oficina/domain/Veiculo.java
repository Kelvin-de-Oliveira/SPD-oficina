package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "veiculo")
public class Veiculo {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    private String placa;

    @DatabaseField
    private String modelo;

    @DatabaseField(columnName = "ano_modelo")
    private int anoModelo;

    @DatabaseField(foreign = true, foreignAutoRefresh = true, columnName = "cliente_id")
    private Cliente cliente;

    public Veiculo() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAnoModelo() { return anoModelo; }
    public void setAnoModelo(int anoModelo) { this.anoModelo = anoModelo; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
}