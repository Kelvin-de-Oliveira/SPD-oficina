package br.edu.ufg.oficina.domain;

import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "cliente")
public class Cliente {

    @DatabaseField(generatedId = true)
    private long id;

    @DatabaseField
    private String nome;

    @DatabaseField(columnName = "cpf_cnpj")
    private String cpfCnpj;

    @DatabaseField
    private String endereco;

    @DatabaseField
    private String cep;

    @DatabaseField
    private String numero;

    @DatabaseField
    private String complemento;

    public Cliente() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpfCnpj() { return cpfCnpj; }
    public void setCpfCnpj(String cpfCnpj) { this.cpfCnpj = cpfCnpj; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
}