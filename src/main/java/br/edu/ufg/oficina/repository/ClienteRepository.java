package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Cliente;

public class ClienteRepository extends BaseRepository<Cliente, Long> {
    public ClienteRepository(Database database) {
        super(database, Cliente.class);
    }
}