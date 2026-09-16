package br.edu.ufg.oficina.repository;

import br.edu.ufg.oficina.domain.OrdemServico;

public class OrdemServicoRepository extends BaseRepository<OrdemServico, Long> {
    public OrdemServicoRepository(Database database) {
        super(database, OrdemServico.class);
    }
}