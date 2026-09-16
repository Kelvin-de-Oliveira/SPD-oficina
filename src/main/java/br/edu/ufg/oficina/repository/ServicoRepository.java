package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.Servico;

public class ServicoRepository extends BaseRepository<Servico, Long> {
    public ServicoRepository(Database database) {
        super(database, Servico.class);
    }
}