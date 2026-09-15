package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "mecanico")
public class Mecanico {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    private String nome;

    public Mecanico() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
}